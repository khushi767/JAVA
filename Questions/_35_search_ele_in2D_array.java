import java.util.Scanner;
public class _35_search_ele_in2D_array {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array");
        Scanner input=new Scanner(System.in);
        int[][] numArr=_27_array_utility.input2DArray();
        System.out.print("Now enter number you want to search: ");
        int num=input.nextInt();
        boolean isFound=search(numArr,num);
        if(isFound){
            System.out.println("your number was found");
        }
        else{
            System.out.println("your number is not found");
        }
        input.close();
    }

    public static boolean search(int[][] numArr,int num){
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                if(numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
