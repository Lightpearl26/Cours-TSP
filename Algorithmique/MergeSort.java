public class MergeSort {
    public static void main(String[] args) throws Exception {
        int[] tab = {4, 7, 3, 9, 1, 2, 5};
        display(mergeSort(tab));
    }

    public static void display(int[] tab) {
        System.out.print("{");
        for (int i=0; i<tab.length-1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1] + "}");
    }

    public static int[] right(int[] tab) {
        int[] result = new int[tab.length-1];

        for (int i=1; i<tab.length; i++) {
            result[i-1] = tab[i];
        }

        return result;
    }

    public static int[] merge(int val, int[] tab) {
        int[] result = new int[tab.length+1];

        result[0] = val;

        for (int i=0; i<tab.length; i++) {
            result[i+1] = tab[i];
        }

        return result;
    }

    public static int[] merge(int[] tab1, int[] tab2) {
        if (tab1.length == 0) {
            return tab2;
        } else if (tab2.length == 0) {
            return tab1;
        } else if (tab1[0] < tab2[0]) {
            return merge(tab1[0], merge(right(tab1), tab2));
        } else {
            return merge(tab2[0], merge(tab1, right(tab2)));
        }
    }

    public static int[] extract(int[] tab, int start, int end) {
        int[] result = new int[end-start];

        for (int i=0; i<end-start; i++) {
            result[i] = tab[start+i];
        }

        return result;
    }

    public static int[] mergeSort(int[] tab) {
        if (tab.length == 1) {
            return tab;
        } else {
            int[] t1 = extract(tab, 0, tab.length/2);
            int[] t2 = extract(tab, tab.length/2, tab.length);

            return merge(mergeSort(t1), mergeSort(t2));
        }
    }
}
