public class DiscreteDistribution {

    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = args.length;
        int a[] = new int[n-1];
        for (int i = 1; i < n; i++)
        {
            a[i-1] = Integer.parseInt(args[i]);
        }

        int sum[] = new int[n];
        sum[0] = 0;
        for (int j = 1; j < n; j++)
        {
            sum[j] = sum[j-1] + a[j-1];
        }
        for (int k = 0; k < m; k++)
        {
            int r = (int) ((sum[n-1])  * Math.random());
            for (int l = 1; l < (sum.length); l++)
            {
                if (r >= sum[l-1] && r < sum[l])
                    System.out.print(l + " ");
            }
        }
    }

}
