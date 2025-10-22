/* 
Final keyword when applied to a variable, it becomes constant,meaning its value cannot be changed once assigned.

using final can lead to performance optimization, as compiler can make certain assumptions about final elements.
final variable must be initialized before the constructor completes,reducing null pouinter erros.

helps in creating immutable objects in combination with private fields and no setter methods.


*/
/* 
public class _27_final_keyword{
    public static void main(String[] args) {
        final double pi=3.13;
        void testing(){
            pi=3.14; //error cannot change the value of final variable
        }

}
        */