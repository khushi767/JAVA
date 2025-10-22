/*
 * %s: String of text
 * %f: floating point value(float or double)
 * %e:Exponential,scientific notation of float or double
 * %b: boolean true or false value
 * %c: single character char
 * %d: base 10 integer value(byte,short,int,long)
 * %o: octal number
 * %x: hexadecimal numbr
 * %%: percentage sign
 * %n: new line
 * %tY: year to four digits
 * %tR: time in 24-hour notation hh:mm
 * %tT: time in hh:mm:ss
 * %tD: date in mm/dd/yy
 * %tF: date in yyyy-mm-dd
 * %tA: full weekday name
 * 
 * 
 * Printf fkag: Purpose
 * - : Aligns the formatted printf output to left
 * + : output includes a negative or positive sign
 * ( :places negative number in parenthesis
 * 0:formatted printf output is zero padded
 * ,: formatted output includes grouping seperators
 * <space>: a blank space adds a minus sign for negatibe numbers and a leading space when positive.
 * 
 */

public class _25_string_class {
   public static void main(String[] args) {
    String name="khushi";
    int marks=90;
    System.out.println("hello"+name+",your marks are: "+45);
    System.out.printf("hello %s, your marks are: %d",name,marks);// this is more effiicient as we dont have to concatenate strings
   } 
}
