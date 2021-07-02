public class AudioCollage {

    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = alpha * a[i];
        return b;
    }

    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[a.length - 1];
        return b;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        for (int j = a.length; j < a.length + b.length; j++)
            c[j] = b[j - a.length];
        return c;
    }

    public static double[] mix(double[] a, double[] b) {
        int z = 0;
        boolean d = false;
        if (a.length > b.length) d = true;
        if (d) z = a.length;
        else z = b.length;
        double[] c = new double[z];
        for (int i = 0; i < z; i++) {
            c[i] = 0;
            if (d && i < b.length) c[i] = a[i] + b[i];
            if (d && i >= b.length) c[i] = a[i];
            if (!d && i < a.length) c[i] = a[i] + b[i];
            if (!d && i >= a.length) c[i] = b[i];
        }
        return c;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        int z = a.length;
        int m = (int) Math.floor(z / alpha);
        double[] c = new double[m];
        for (int i = 0; i < m; i++) {
            int k = (int) Math.floor(i * alpha);
            c[i] = a[k];
        }

        return c;

    }

    public static void main(String[] args) {
        double alpha = 2.0;
        double[] a = StdAudio.read("exposure.wav");
        double[] b = StdAudio.read("chimes.wav");
        StdAudio.play(AudioCollage.amplify(a, alpha));
        StdAudio.play(AudioCollage.reverse(a));
        StdAudio.play(AudioCollage.merge(a, b));
        StdAudio.play(AudioCollage.mix(a, b));
        StdAudio.play(AudioCollage.changeSpeed(a, alpha));
    }
}
