package TimeComplexity;

public class asymptoticWay {
    public static void main(String[] args) {
        //Complexity=n^4
        //Eqn=n/2*(n(n+1)(2*n+1))/6
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i*i;j++)
            {
                for(int k=1;k<=n/2;k++)
                {
                    System.out.print("Hello world!");
                }
            }
        }
        //Complexity=log(n)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j+=i)
            {
                System.out.print("Hello world!");
            }
        }

        //bubble sort,insertion sort,selecion sort(time complexity?)
        //best case of insertion sort is order of n: <when array is already sorted.>(inner loop do not work)
        // on the basis of swapping which sort is best(ans=insertion:n-1 swaps)
    }
}
