import java.util.Scanner;
public class _14_searching_in_array{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr={3,4,8,67,4,56,8,9,76,54};
        System.out.println("welcome to array search");
        System.out.println("enter the number you want to search: ");
        int num=input.nextInt();
        boolean isfound=isfound(arr,num);
        if(isfound){
            System.out.println("your number was found in array");
        }
        else{
            System.out.println("your number was not found in array");
        }
input.close();

    }

    public static boolean isfound(int[] arr,int num){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }

        return false;

    }
}