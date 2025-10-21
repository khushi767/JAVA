public class _20_for_each_loop {
    public static void main(String[] args) {
        String[] array= new String[]{
            "Ram","shyam","mohan","sohan","sita","gita"
        };
        printArray(array);
        printarrayforeach(array);

    }

    public static void printarrayforeach(String[] array){
        for(String name:array){
            System.out.println(name);
        }
    }

    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" "+"\t");
        }
    }
}
