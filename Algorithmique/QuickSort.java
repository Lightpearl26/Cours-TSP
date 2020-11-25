public class QuickSort {
    public static void main(String[] args) throws Exception {
        int[] tab = {4, 7, 3, 9, 1, 2, 5};
        quickSort(tab, 0, tab.length-1);
        display(tab);
    }

    public static void display(int[] tab) {
        System.out.print("{");
        for (int i=0; i<tab.length-1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1] + "}");
    }

    public static void swap(int[] tab, int ind1, int ind2) {
        int temp = tab[ind1];
        tab[ind1] = tab[ind2];
        tab[ind2] = temp;
    }

    public static int partition(int[] tab, int start, int end) {
        int f = start;
        int i = start;
        do {
            if (tab[i] < tab[end]) {
                swap(tab, i, f);
                f++;
            } 
            i++;
        } while (i != end);
        swap(tab, end, f);
        return f;
    }

    public static void quickSort(int[] tab, int start, int end) {
        if (start < end) {
            int f = partition(tab, start, end);
            quickSort(tab, start, f-1);
            quickSort(tab, f+1, end);
        }
    }
}
