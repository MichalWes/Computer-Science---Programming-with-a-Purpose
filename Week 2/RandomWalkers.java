public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int s = 0;
        double ran = 0;
        double stepssum = 0;
        double average = 0;

        for (int i = 0; i < trials; i++)
        {
            while (Math.abs(x) + Math.abs(y) < r)
            {
                ran = Math.random();
                if (ran < 0.25) x++;
                if (ran >= 0.25 && ran < 0.5) x--;
                if (ran >= 0.5 && ran < 0.75) y++;
                if (ran >= 0.75 && ran < 1) y--;
                s = s + 1;

            }
            stepssum = stepssum + s;
            s = 0;
            ran = 0;
            x = 0;
            y = 0;
        }
        average = stepssum / trials;
        System.out.println("Average number of steps  = " + average);

    }

}
