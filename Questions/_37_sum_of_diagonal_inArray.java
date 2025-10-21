public class _37_sum_of_diagonal_inArray {
    public static void main(String[] args) {
       System.out.println("Welcome to diagonal sum");
       int[][] numArr=_27_array_utility.input2DArray();
       long sum=sumofDiagonals(numArr);
       System.out.println("Sum of Diagonal is: "+sum); 
    }

    public static long sumofDiagonals(int[][] numArr){
        long leftSum=sumofleftdiagonal(numArr);
        long rightSum=sumofrightdiagonal(numArr);
        long sum=leftSum+rightSum;
        if(numArr.length%2!=0){
            int ind=numArr.length/2;
            sum-=numArr[ind][ind];

        }
        return sum;

    }
    public static long sumofleftdiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
           sum+=numArr[i][i];
           i++; 
        }
        return sum;

    }
    public static long sumofrightdiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int col=numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;

    }


}
//no of rows and no of colums will be same