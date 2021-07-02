public class ActivationFunction {

    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x < 0.0) return 0.0;
        else if (x == 0.0) return 0.5;
        else return 1;
    }

    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double sig = 1 / (1 + Math.exp(-x));
        return sig;
    }

    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double tanh = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        return tanh;
    }

    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double sfts = x / (1 + Math.abs(x));
        return sfts;
    }

    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        double stfs = 0.0;
        if (x <= -2) stfs = -1;
        else if (x > -2 && x < 0) stfs = x + Math.pow(x, 2) / 4;
        else if (x >= 0 && x < 2) stfs = x - Math.pow(x, 2) / 4;
        else stfs = 1;
        return stfs;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside(" + x + ") = " + ActivationFunction.heaviside(x));
        System.out.println("sigmoid(" + x + ") = " + ActivationFunction.sigmoid(x));
        System.out.println("tanh(" + x + ") = " + ActivationFunction.tanh(x));
        System.out.println("softsign(" + x + ") = " + ActivationFunction.softsign(x));
        System.out.println("sqnl(" + x + ") = " + ActivationFunction.sqnl(x));
    }
}
