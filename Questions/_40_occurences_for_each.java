import java.util.Scanner;
public class _40_occurences_for_each {
    public static void main(String[] args) {
        
    
    System.out.println("Finding occurences of an array");
    System.out.println("enter the number u want to find");
    Scanner input=new Scanner(System.in);
    int element=input.nextInt();
    System.out.println("enter your array");
    int[] nums=_27_array_utility.inputArray();
    int occ=countofoccurnces(nums,element);
    System.out.println("yiur element was found: "+occ+" times");
    input.close();
}
public static int countofoccurnces(int[] nums,int element){
int occ=0;
for(int num:nums){
    if(num==element){
        occ++;
    }

}


    return occ;
}

}


//command.equals("exit")-->to comapre
//command.equalsIgnoreCase("exit")