import java.util.Scanner;

public class _27_array_utility {
    public static int[] inputArray(){
        System.out.println("Please enter size of array");
        Scanner input=new Scanner(System.in);
    int size=input.nextInt();
    int [] nums=new int[size];
    input.close();
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
   
   public static int[][] input2DArray(){
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter number of rows: ");
    int rows=input.nextInt();
    System.out.println("Please enter number of columns: ");
    int columns=input.nextInt();
    int[][] numArray=new int[rows][columns];
    input.close();

    int i=0;
    while(i<rows){
        int j=0;
        while(j<columns){
            System.out.println("Please enter element row: "+",column: "+(j+1)+":");
            numArray[i][j]=input.nextInt();
            j++;
        }
        i++;
    }
    return numArray;

   }
    }

