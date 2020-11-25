public class Pgcd {
    public static void main(String[] args) throws Exception {
        if (args.length == 2) {
            int p = Integer.parseInt(args[0]);
            int q = Integer.parseInt(args[1]);
            do {
                if (p>q) {
                    p = p-q;
                } else {
                    q = q-p;
                }
            } while (p != 0 && q != 0);
            if (p == 0) {
                System.out.println(q);
            } else {
                System.out.println(p);
            }
        } else {
            System.exit(1);
        }
    }
}
