public class InsertionSort {
    public static void main(String[] args) throws Exception {
        int[] sorted = new int[args.length];
        for (int i=0; i<args.length; i++) {
            int dest = -1;
            int temp = 0; // On initialise une variable temporaire pour garder l'information à décaler
            for (int j=0; j<i; j++) {
                if (dest == -1) { // Si dest = -1 on cherche la position de l'élément
                    if (sorted[j] > Integer.parseInt(args[i])) {
                        dest = j;
                        temp = sorted[j+1];
                        sorted[j+1] = sorted[j];
                    }
                } else { // Sinon on connait sa position donc on décale à droite
                    int temp2 = sorted[j+1];
                    sorted[j+1] = temp;
                    temp = temp2;
                }
            }
            if (dest == -1) { // Si dest = -1 alors l'élément est plus grand que tout les éléments triés donc on le place à la fin
                sorted[i] = Integer.parseInt(args[i]);
            } else {
                sorted[dest] = Integer.parseInt(args[i]);
            }
        }
        for (int i=0; i<sorted.length; i++) { // On affiche le tableau sorted
            System.out.print(sorted[i] + " ");
        }
    }
}
