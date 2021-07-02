public class ThueMorse {

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double m = (Math.log(n)/Math.log(2));
        if (n < 4) n = 4;
        if (m%Math.floor(m) > 0)
        {
            n = (int)Math.pow(2,(int) (m + 1));
            m = (int)m + 1;
        }
        int thue[] = new int[n];

        for (int i = 0; i < 4; i++)
        {
            if (i == 0) thue[i] = 0;
            else if (i%2 == 0) thue[i] = i/2;
            else if (i%2 != 0)thue[i] = 1-thue[i-1];
        }
        if (n > 4)
        for (int i = 4; i < 8; i++)
        {
            if (thue[i-4] == 0) thue[i] = 1;
            else if (thue[i-4] == 1) thue[i] = 0;
        }
        if (n > 8)
        for (int i = 8; i < 16; i++)
        {
            thue[i] = thue[15-i];
        }
        if (n > 16)
        for (int i = 16; i < 32; i++)
        {
            thue[i] = thue[31-i];
        }
        System.out.println();
        if (Math.pow(2, m ) > 32)
        for (int i = 32; i < n; i++)
        {
            thue[i] = thue[n-1-i];
        }
        System.out.println();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (thue[i] == thue[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }

}
