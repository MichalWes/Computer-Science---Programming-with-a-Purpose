import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0.0, n);
        // StdDraw.filledSquare();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) StdDraw.setPenColor(Color.blue);
                else StdDraw.setPenColor(Color.lightGray);
                StdDraw.filledSquare(i - 0.5, j - 0.5, 0.5);
            }
        }
    }
}
