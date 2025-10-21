public class _32_reverse_array {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal");
        int[] numarr=_27_array_utility.inputArray();
        reverse(numarr);
        System.out.println("your reversed array is: ");
        _27_array_utility.displayarray(numarr);
    }

    public static void reverse(int[] arr){

        int i=0;
        while(i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
}
