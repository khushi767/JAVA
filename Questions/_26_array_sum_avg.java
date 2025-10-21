import java.util.Scanner;

public class _26_array_sum_avg {
   public static void main(String[] args) {
    System.out.print("Welcome to array sum and avg");
    int[] numarray=_27_array_utility.inputArray();
    long sum=sum(numarray);
    float avg=average(numarray);
    System.out.println("Sum of numbers is: "+sum);
    System.out.println("Average of numbers is: "+avg);
 
   } 

   public static long sum(int[] numarray){
    long sum=0;
    int i=0;
    while(i<numarray.length){
        sum+=numarray[i];
        i++;
    }
    return sum;

   }

   public static float average(int[] numarray){
    float sum= sum(numarray);
    return (sum/numarray.length);

   }
}
