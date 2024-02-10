import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание №1.
        int [] i = new int [3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double [] d = {1.57, 7.654, 9.986};
        char [] c = {'S', 'e', 'r', 'J'};

        // Задание №2.
        for (int p = 0; p < i.length; p++) {
            System.out.print(i[p]);
            if (i.length - 1 != p) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int p = 0; p < d.length; p++) {
            System.out.print(d[p]);
            if (d.length - 1 != p) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int p = 0; p < c.length; p++) {
            System.out.print(c[p]);
            if (c.length - 1 != p) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // Задание №3.
        for (int p = 0; p < i.length; p++) {
            System.out.print(i[i.length-1-p]);
            if (i.length - 1 - p != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int p = 0; p < d.length; p++) {
            System.out.print(d[d.length-1-p]);
            if (d.length - 1 - p != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int p = 0; p < c.length; p++) {
            System.out.print(c[c.length-1-p]);
            if (c.length - 1 - p != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // Задание №4.
        for (int p = 0; p < i.length; p++) {
            if (i[p] % 2 != 0) {
                i[p] += 1;
            }
        }
        System.out.println(Arrays.toString(i));
    }
}