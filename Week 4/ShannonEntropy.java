public class ShannonEntropy {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int sum = 0;
        double pi = 0.0;
        double log = 0.0;
        double shen = 0.0;

        int[] ES = new int[m + 1];

        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            ES[value] += 1;
            sum += 1;
        }

        for (int a = 1; a <= m; a++) {
            pi = (double) ES[a] / sum;
            if (pi > 0) {
                log = -pi * (Math.log(pi) / Math.log(2));
                shen += log;
            }
        }
        StdOut.printf("%.4f", shen);
    }
}
