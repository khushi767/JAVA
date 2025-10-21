public class _34_merge_two_sorted_array {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted array");
        int[] arr1=_27_array_utility.inputArray();
        int[] arr2=_27_array_utility.inputArray();
        int[] mergedArr=merge(arr1,arr2);
        System.out.println("your merged array is: ");
        _27_array_utility.displayarray(mergedArr);
    }

    public static int[] merge(int[] arr1,int[] arr2){
        int newSize=arr1.length+arr2.length;
        int[] newArr=new int[newSize];
        int i=0,j=0,k=0;
        while(i<arr1.length ||j<arr2.length){
            if(j==arr2.length||i<arr1.length && arr1[i]<arr2[j]){
            
                newArr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k]=arr2[j];
                k++;
                j++;
            }

        }
        return newArr;

    }
}
