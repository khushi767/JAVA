public class _07_if_else_stmt{
    public static void main(String args[]){
        boolean isMALE=false;
        String name="Neo";
        System.out.println("befor if");
        if(isMALE){
            System.out.println("Mr." +name);
        }else{
            System.out.println("Ms."+name);
        }
        System.out.println("after if");


        boolean isSeniorCitizen=true;
        boolean isAnAdult=true;
        if(isSeniorCitizen){
            System.out.println("Hello senior citizen");
        }else{
            if(isAnAdult){
                System.out.println("Hello adult");

            }else{
                System.out.println("Hello chaild");
            }
        }
    }
}