public class Minesweeper
{

    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        Object[][] mines = new Object[m][n];
        int p = 0;
        int q = 0;

        for (int b = 0; b < m; b++)
        {
            for (int a = 0; a < n; a++)
            {
               mines[b][a] = Integer.valueOf(0);
            }
        }

        for (int i = 0; i < k; i++)
        {
            while (true){
                p = (int) (m * Math.random());
                q = (int) (n * Math.random());
                if(mines[p][q] != "*")
                {
                    mines[p][q] = "*";
                    if (p-1 >= 0 && mines[p-1][q] != "*") mines[p-1][q] = Integer.valueOf((int) mines[p-1][q] + 1);
                    if (p-1 >= 0 && q-1 >= 0 && mines[p-1][q-1] != "*") mines[p-1][q-1] = Integer.valueOf((int) mines[p-1][q-1] + 1);
                    if (p-1 >= 0 && q+1 < n && mines[p-1][q+1] != "*") mines[p-1][q+1] = Integer.valueOf((int) mines[p-1][q+1] + 1);
                    if (q-1 >= 0 && mines[p][q-1] != "*") mines[p][q-1] = Integer.valueOf((int) mines[p][q-1] + 1);
                    if (q+1 < n && mines[p][q+1] != "*") mines[p][q+1] = Integer.valueOf((int) mines[p][q+1] + 1);
                    if (p+1 < m && mines[p+1][q] != "*") mines[p+1][q] = Integer.valueOf((int) mines[p+1][q] + 1);
                    if (p+1 < m && q-1 >= 0 && mines[p+1][q-1] != "*") mines[p+1][q-1] = Integer.valueOf((int) mines[p+1][q-1] + 1);
                    if (p+1 < m && q+1 < n && mines[p+1][q+1] != "*") mines[p+1][q+1] = Integer.valueOf((int) mines[p+1][q+1] + 1);
                    break;
                }
            }
        }

        for (int j = 0; j < m; j++)
        {
            for (int l = 0; l < n; l++)
            {
                System.out.print(mines[j][l] + "  ");
            }
            System.out.println();
        }
    }

}
