package istiklal.edu.tr;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {

    
    public static double sum(ArrayList<Double> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }

        double total = 0;
        for (double num : list) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        double totalSum = sum(list);
        System.out.println("The sum of the numbers is: " + totalSum);

        input.close();
    }
}