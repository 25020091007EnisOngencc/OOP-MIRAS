package istiklal.edu.tr;

import java.util.ArrayList;

public class Exercise11_07 {

    public static void shuffle(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());

            Integer temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Karıştırmadan önce liste:");
        System.out.println(list);

        shuffle(list);

        System.out.println("\nKarıştırıldıktan sonra liste:");
        System.out.println(list);
    }
}