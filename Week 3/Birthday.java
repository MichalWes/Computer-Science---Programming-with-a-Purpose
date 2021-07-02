public class Birthday {

    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] counter = new int[n+2];
        double fract = 0.0;
        counter[0] = 0;
        int k =1;

        System.out.println(1 + "\t " + 0 + "\t " + fract);

        while(fract < 0.5)
        {
            counter[k]=0;
            for(int i=0; i<trials; i++)
            {
                boolean[] hasBirthday = new boolean[n];
                int  people = 0;
                while (true)
                {
                    people++;
                    int d = (int) (n * Math.random());
                    if (hasBirthday[d]) break;
                    hasBirthday[d] = true;
                }
                if(people == k+1)
                {
                    counter[k]++;
                }
            }
            fract = fract + (double) counter[k]/trials;
            System.out.println(k+1 + "\t" + counter[k] + "\t" + fract);
            k++;
        }
    }
}
