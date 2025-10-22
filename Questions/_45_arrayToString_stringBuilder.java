public class _45_arrayToString_stringBuilder {
    public static void main(String args[]){
        String[] arr=new String[]{
            "Hello","khushi","you","will","get","job","soon"
        };
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s).append(" ");
        }
        System.out.println(sb);


    }
}
