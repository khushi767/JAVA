public class _13_arrays {
   public static void main(String args[]){
    int[] myarr=new int[5];
    myarr[0]=98;
    myarr[1]=67;
    myarr[2]=12;
    myarr[3]=05;
    myarr[4]=2;
    int[] newarr={12,12,32,45};
    System.out.println(newarr[2]);
    System.out.println(myarr[0]);
    System.out.println(myarr[4]);
//array traversal
    int index=0;
    while(index<5){
        System.out.println(myarr[index]);
        index++;
    }
   } 
}

//int [] myint= new int[10];
//int [] intvalues={1,5,6,23,11,5};
/*
 * String[] strarr=new String[4];
 * strarr[0]="first";
 * 
 * String[] newstrarr={"first","sec"};
 * System.out.println(newstrarr.length);
 */