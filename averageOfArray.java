import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
public class averageOfArray {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10  double values");
        double [] avg=new double[10];
        for(int i=0;i<avg.length;i++){
            avg[i]=sc.nextDouble();
        }
        System.out.println("average is "+average(avg));
    }
    public static int average(int [] aray) {
        double sum=0;
        for(int i=0;i<aray.length;i++){
            sum+=aray[i];
        }
        double average=sum/(aray.length);
        int averag=(int)(average);
        return averag; 
    }
    public static double average(double [] aray) {
        double sum=0;
        for(int i=0;i<aray.length;i++){
            sum+=aray[i];
        }
        double average=sum/(aray.length);
        return average;  
    }
}
