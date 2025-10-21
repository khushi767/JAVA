import java.util.Scanner;

public class _27_array_utility {
    public static int[] inputArray(){
        System.out.println("Please enter size of array");
        Scanner input=new Scanner(System.in);
    int size=input.nextInt();
    int [] nums=new int[size];
    int i=0;
    while(i<size){
        System.out.print("Please enter element no "+(i+1)+":");
        nums[i]=input.nextInt();
        i++;
    }
    return nums;
    
   } 

   public static void displayarray(int[] numArray){
    int i=0;
    while(i<numArray.length){
        System.out.print(numArray[i]+" ");
        i++;
    }
    System.out.println();
   }
   
    }

