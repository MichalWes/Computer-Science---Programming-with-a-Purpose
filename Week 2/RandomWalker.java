public class RandomWalker {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int s = 0;
        double ran = 0;
        while (Math.abs(x) + Math.abs(y) < r)
        {
            ran = Math.random();
            if (ran < 0.25) x++;
            if (ran >= 0.25 && ran < 0.5) x--;
            if (ran >= 0.5 && ran < 0.75) y++;
            if (ran >= 0.75 && ran < 1) y--;
            System.out.println(x + ", " + y);
            s = s + 1;
	    }
        System.out.println("Steps = " + s);

    }

}
