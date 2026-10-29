package istiklal.edu.tr;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_08 {

    public static void sort(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        sort(list);

        System.out.println("The sorted numbers are:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();
    }
}