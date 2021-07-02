public class WorldMap {
    public static void main(String[] args) {

        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        StdDraw.setCanvasSize((int) x, (int) y);
        StdDraw.setXscale(0.0, x);
        StdDraw.setYscale(0.0, y);

        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty()) {
            StdIn.readString();

            int numberOfVertices = StdIn.readInt();
            double[] verticesX = new double[numberOfVertices];
            double[] verticesY = new double[numberOfVertices];

            for (int i = 0; i < numberOfVertices; i++) {
                verticesX[i] = StdIn.readDouble();
                verticesY[i] = StdIn.readDouble();
            }

            StdDraw.polygon(verticesX, verticesY);
        }
        StdDraw.show();
    }
}
