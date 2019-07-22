public class LabeledBreak {
    public static void main(String[] args) {
        int[][] sqr = {{4,3,2},{3,5,6},{6,7,8}};
        int sum = 0;
        out: for(int i = 0; i < sqr.length; ++i)
        {
            for(int j = 0; j < sqr[i].length; ++j)
            {
                if (i==j)break;
                System.out.println(sqr[i][j]);
                sum+=sqr[i][j];
                if(sum>10) break out;
            }
        }
        System.out.println(sum);
    }
}
