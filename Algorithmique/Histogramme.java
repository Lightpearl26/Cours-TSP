public class Histogramme {
    public static void main(String[] args) throws Exception {
        int[] tab = {-1, -3, 2, -2, 3, 0, 4, 2, -2, -1};
        int min = 0;
        int max = 0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        for (int line=max; line>=min; line--) {
            for (int col=0; col<tab.length; col++) {
                if (line == 0) {
                    if (tab[col] == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                } else if (line > 0) {
                    if (tab[col] >= line) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (tab[col] <= line) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
