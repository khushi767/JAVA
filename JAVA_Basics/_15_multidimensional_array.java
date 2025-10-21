public class _15_multidimensional_array{
    public static void main(String args[]){
        //int [][]arr={{},{}};
        int [][] myarr=new int[2][3];
        myarr[0][0]=9;
        int[][] arr={{1,2,4},{4,5,6},{7,8,9}};
        //System.out.println(arr);
        System.out.println(arr[0].length);
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;

            }
            i++;
        }

    }
}

/*
 * int[][] numArr=new int[2][3];
 * int [][] intarray={{1,2,3},{8,9,9}};
 * 
 * num[0][0]=5;
 */