import java.util.Scanner;
public class _28_noof_occurence_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to array occurences");
        int[] numArr=_27_array_utility.inputArray();
        System.out.print("Now enter yhe number u want to find: ");
        int num=input.nextInt();
        int occurrences=noofoccurences(numArr,num);
        System.out.println("your element was found "+occurrences+"times in array");
    }

    public static int noofoccurences(int[] numArr,int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;

        }

        return occ;
    }
}
