package istiklal.edu.tr;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {

   
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Sayı dizisini giriniz (Bitirmek için 0 girin): ");
        int value = input.nextInt();

        while (value != 0) {
            list.add(value);
            value = input.nextInt();
        }

        Integer maxValue = max(list);

        if (maxValue == null) {
            System.out.println("Liste boş!");
        } else {
            System.out.println("En büyük sayı: " + maxValue);
        }

        input.close();
    }
}
