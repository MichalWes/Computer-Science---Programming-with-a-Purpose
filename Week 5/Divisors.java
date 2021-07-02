public class Divisors {

    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        int c = gcd(a, b);
        int d = (a * b) / c;
        return d;
    }

    public static boolean areRelativelyPrime(int a, int b) {
        int c = gcd(a, b);
        if (c == 1) return true;
        else return false;
    }

    public static int totient(int a) {
        if (a <= 0) return 0;
        int d = 0;
        for (int n = 1; n <= a; n++) {
            int c = gcd(a, n);
            if (c == 1) d++;
        }
        return d;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd(" + a + ", " + b + ") = " + Divisors.gcd(a, b));
        System.out.println("lcm(" + a + ", " + b + ") = " + Divisors.lcm(a, b));
        System.out.println(
                "areRelativelyPrime(" + a + ", " + b + ") = " + Divisors.areRelativelyPrime(a, b));
        System.out.println("totient(" + a + ") = " + Divisors.totient(a));
        System.out.println("totient(" + a + ") = " + Divisors.totient(b));
    }
}
