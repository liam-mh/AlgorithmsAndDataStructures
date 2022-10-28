public class task1 {

    public static void main(String[] args) {

        /*
        int n = 10;
        int x = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i; j++) {

                for (int k = 1; k < j; k++) {

                    x++;
                }
            }
        }
        System.out.println("n = "+n);
        System.out.println("x = "+x);
        */

        int n = 4;
        int x = 0;
        System.out.println("n = "+n);

        for (int i = 0; i <= n; i++) { //O(n)
            System.out.println("i = "+i);

            for (int j = 1; j <= i; j++) { //O(n)
                System.out.println("  j = "+j);

                for (int k = 1; k <= j; k++) { //O(n)
                    System.out.println("    k = "+k);

                    x++;
                    System.out.println("      x = "+x);
                }
            }
        }

    }
}
