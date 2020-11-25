public class BubbleSort {
    public static void main(String[] args) throws Exception {
        double[] tab = {2.3, 17.0, 3.14, 8.83, 7.26}; // On initialise le tableau
        for (int i = tab.length-1; i>0; i--) { // On parcoure les pivots de droite à gauche
            for (int j=0; j<i; j++) {
                if (tab[j] > tab[j+1]) {
                    double temp = tab[j]; // On crée une variable temp pour ne pas perdre la valeur de tab[j]
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        for (int i=0; i<tab.length; i++) { // Cette boucle sert a afficher le tableau final
            System.out.print(tab[i] + " ");
        }
    }
}
