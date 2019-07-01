public class BreakWithLabel {
    public static void main(String[] args) {
        int n = 0, sum = 0, m = 0, total = 0;
        double nsqrt;
        outer: //LABEL NAME
        while(true)
        {
            n = n+1;
            m = m+1;
            while(true)
            {
                sum+=n;
                if(sum > 50)
                    System.out.println("n = " + n + "sum = " + sum);
                break;
            }
            total+=n+m;
            if(total > 100)
                break outer;
        }
        nsqrt = Math.sqrt(total);
        System.out.println("n = "+ n + "m = " + m);
        System.out.println("total = "+ total + "Sqrt of total " +nsqrt);
    }
}
