import java.util.Scanner;
public class _31_delete_ele_from_array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to array deletion");
        int[] numArr=_27_array_utility.inputArray();
        System.out.print("Now, enter number u want to delete: ");
        int numtodelete=input.nextInt();
        int[] newArr=deleteNumber(numArr,numtodelete);
        System.out.println("Here is your new arrsy");
        _27_array_utility.displayarray(newArr);
        input.close();


    }

    public static int[] deleteNumber(int[] numArr,int numtodelete){
        int occ=_28_noof_occurence_array.noofoccurences(numArr, numtodelete);
        if(occ==0){
            return  numArr;
        }
        int newSize=numArr.length-occ;
        int[] newArr=new int[newSize];
        int i=0,j=0;
        while(i<numArr.length){
            if(numArr[i]!=numtodelete){
                newArr[j]=numArr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
