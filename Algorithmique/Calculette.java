public class Calculette {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[args.length];
        for (int i=0; i<args.length; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        int s=0;
        for (int i=0; i<tab.length; i++) {
            s += tab[i];
        }
        System.out.println(s);
    }
}
