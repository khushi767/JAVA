public class _36_sum_avg_2d_array {
    public static void main(String[] args) {
        
    
    System.out.println("Welcome to sum and avg of 2d array");
    int[][] numArr=_27_array_utility.input2DArray();
    long sum=sum(numArr);
    double avg=average(numArr);
    System.out.println("your sum of array: "+sum);
    System.out.println("Your average of array is: "+avg);
    }

    public static double average(int[][] numArr){
        if(numArr.length==0){
            return 0;
        }
        int rows=numArr.length;
        int cols=numArr[0].length;
        double size=rows*cols;
        return sum(numArr)/(size);


    }

    public static long sum(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

}

