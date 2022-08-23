package Week2.Day5.Assignment;
//Q5 Try to add 2 Jagged arrays:
public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagarr1 = {
                {1,2,3,4},
                 {1,2},
                 {1,2,3},
                {1,2,3,4,5}
        };

        int[][] jagarr2 = {
                new int[] {1,2},
                new int[] {1,2,3,4},
                new int[] {1,2,3,4,5},
                new int[] {1,2,3},
        };


        int resArr[][] = new int[4][];
        for (int i=0;i<resArr.length;i++)
        {
            int p=Integer.max(jagarr1[i].length,jagarr2[i].length);
            resArr[i] = new int[p];
            for (int j=0;j<resArr[i].length;j++)
            {
                int fit = Integer.min(jagarr1[i].length,jagarr2[i].length);
                if(j<fit) {
                    resArr[i][j]= jagarr1[i][j] + jagarr2[i][j];
                }
                else if(jagarr1[i].length>jagarr2[i].length)
                {
                    resArr[i][j]= jagarr1[i][j];
                }
                else
                {
                    resArr[i][j]=jagarr2[i][j];
                }
            }
        }


        for(int[] i : resArr) {
            for(int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}

/*  OUTPUT

2 4 3 4
2 4 3 4
2 4 6 4 5
2 4 6 4 5


* */