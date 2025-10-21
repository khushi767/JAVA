public class _21_break_and_continue {
    public static void main(String args[]){
        for(int i=1;i<100;i++){
            if(i<10){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");

    }
}
