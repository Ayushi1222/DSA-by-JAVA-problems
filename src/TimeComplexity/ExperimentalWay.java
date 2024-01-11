package TimeComplexity;
//Experimental way is dependent on hardware!
public class ExperimentalWay {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000_000;i++)
        {

        }
        long end=System.currentTimeMillis();
        System.out.print(end-start);
    }
}
