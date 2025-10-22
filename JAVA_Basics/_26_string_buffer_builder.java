/*
 * StringBuilder sentence= new StringBuilder("This is a sentence");
 * sentence.append("Added word.");
 * System.out.println(sentence.toString());//output: this is a sentence added word.
 * 
 * 
 * Stringbuilder is mostly used
 * 
 * String: immutable, string constant pool, not used in threaded environment as it is immutable,comparitely slower.
 * 
 * StringBuilder:it is mutable,stored in heap, not thread sade so used in single threaded environment,it is comapratively faster.
 * 
 * StringBuffer:it is mutable stored in heap, Thread safe so used in multi-threaded environment. Faster than string but slower than stringBuilder.
 */
public class _26_string_buffer_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("khushi");
        sb.append(22);
        sb.toString();
        System.out.println(sb);
    }
}

