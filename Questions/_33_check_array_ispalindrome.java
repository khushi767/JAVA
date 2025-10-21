public class _33_check_array_ispalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker");
        int[] myarr=_27_array_utility.inputArray();
        boolean isPalin=isPalindrome(myarr);
        if(isPalin){
            System.out.println("your array is palindrome");
        }
        else{
            System.out.println("your array is not palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while(i<numArr.length/2){
            if(numArr[i]!=numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
