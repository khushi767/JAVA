//true string method
/* 


string na to heap hai ,hm new se ni bna rhe na hi stack hai beech ka hai. to string ki memory hogi kidhr. hoga to heap me hi. pr heap me ik special area hota hai jisko string pool bolte hai. jisme string literals store hote hai. jb bhi hm string literal bnte hai to wo string pool me jata hai. agr waha pe wo string already exist krti hai to new memory allocate ni krta wo existing reference return kr deta hai. agr ni hoti to nayi memory allocate krta hai or usme store kr deta hai.


toString() provides string representation of object, it is inherited from Object class. by default return class name@hashcode.
Commonly overrriden in custom classes for meaningful output.
implicit call: automatically called in string concatenation.

Immuntability: once created, a string object's value cannit be changed,modifications create new string objects.
String pool: java maintains a pool of strings for efficiency.when a new string is created, it's checked against pool for a match to reuse
comparing: equals() method for value comparison, == operator checks for reference equality.


String class
concatenation:string can be concatenated using + operator.but each concatenation creates a new string object,leading to inefficiency in loops.
methods: length(), charAt(), substring(), indexOf(), toUpperCase(), toLowerCase(), trim(), replace(), split(), etc
memory: stored in heap memory, with a special area called string pool for literals.being immutable, strings can use more memory when frequently modified.
*/

public class _24_car {
   int noofwheels;
   int noofdoors;
   int maxspeed;
   String name;
   String modelnumber;
   String company;

   public _24_car(int nowheels, int nodoors, int maxspeed, String name, String modelnumber, String company){
         this.noofwheels=nowheels;
         this.noofdoors=nodoors;
         this.maxspeed=maxspeed;
         this.name=name;
         this.modelnumber=modelnumber;
         this.company=company;
   }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "my car name is "+name;
   }
    public static void main(String[] args) {
        _24_car swift= new _24_car(4,4,120,"swift","zz43","maruti");
        System.out.println(swift.toString());
        
    }

   
 
}
