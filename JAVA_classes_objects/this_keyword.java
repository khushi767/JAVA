/*
 * this can be used to refer currennt class instance variable
 * this can be used to invoke current class method implicitly
 * this() can be used to invoke current class constructor.
 * this can be passed as an argument in the menthod call
 * this can be passed as an argument in constructor call
 * this can be used to return the current class instance from the method.
 * 
 */

 /*STATIC KEYWORD
jis data sbke liye same same ho
ik ko change krne se sbke liye change ho jaye,
jo class ka behaviour ho naki single instance ka.
static keyword dont follow object oriented programming

 static: makes it class method so that it can be called using classname without creating an object of the class
 static variables: belong to class,not individual instances.shared among all instances of the class.
 static methods: can be called without creating an object of the class.can only directly access static variables and other static methods
 no acces to non static members: static methods and blocks cannot directly ccess not static members(variables and methods) of the class
  * 


  non static ke andr static ko hm access kr skte hai,
  pr class 

  class me kuj rkhna hai to static use krna and minimum se minimu use kre

  Non-static methods ke andar static members ko access karna allowed hota hai kyunki static members class level par hote 
  hain aur unhe object banaye bina bhi use kiya ja sakta hai, lekin static methods ke andar non-static members
   ko directly access nahi kar sakte kyunki static context ke paas object ka reference
    nahi hota; agar access karna ho to pehle class ka object banana padta hai. Jab hume aisi cheez
     chahiye jo saare objects ke liye common ho, jaise college name ya counter, tab static ka use karna 
     chahiye, par static ka use minimum rakhna chahiye kyunki wo ek hi baar memory me
      load hota hai aur usme change karne se saare objects pr effect padta hai. Isliye static ko sirf s
      shared data ya utility functions ke liye hi use karna best practice mana jata hai.
  */


  /*CONSTRUCTORS : ()
constructor ka koi return type nhi hota, wo hmesha object retur krega
constructor ka name whu hoga jo class ka name hoga
constructor is called ,whenenver an object is made or called

car(){
color="black;
price="200";
}

  class ke basis pe object ko define krta hai, agr hm constructor define na kre to jvm khudse compile ke time ik default constructor apply krdeta hai.
  Constructor initialise new object and set intial states for the 


  Java CONSTRUCTOR
  1.) Default Constructor: If no constructor is explicitly defined, java provides a default constructore that initializes all member variables to default values
  2.) Parameterized constructors: constructors can have paarameters to pass values when creating an object,allowing for different initializations.

  Constructor chaining,=> a single class can have multiple constructors, also one constructor can call other constructor

  1.) within same class:using this() to call another constructor in the same class
  2.)first statement:this() must be the first statement in a constructor.
  3.)no loop: constructor chaining can't form a loop;it must have a termination point.

  student(){
  this(5)
  }

  student(){
  this(id,"hi")
  }

  student(int id,string msg){
  this(id,"hi")
  }
   * 
   */

   /*
    * Code Block: code written inside { };
    Static block sirf ik baar run hoga jb code run hoga
    {} blok utni baar run hoga jitni baar object initialise hoga

    initialization block: block without static run each time an instance is created
    static block:block with static run once when class is loaded

    */

    /*STACK VS HEAP MEMORY
    stack:order on top of each other
    methods invocations and local variables live

    methods and variables are in stack memory
    heap:doesnt have a particular order
where all objects live

objects are in heap memory

object jayega heap me, refernce jayega stack mein
program me hm reference se use krte hai jo stacj me hota hai

     * 
     */


     /*
      * DATA TYPES IN JAVA
      Primitive: integer,float,char,boolean
      Non-Primitive (derived): class,array,interface,object
      references:bydefault integer hote hai 4 byte ke

      */

/*
 Memory: primitives store actual values;references types store addressed to objects.
 Default values: primitives have specific defaults like 0 or false,refernce type default to null
 spped:access to primitives is generally faster.
 storage location: primitives are stored in stack; reference types are sstored in heap
 comaprison:primitives compared by value,refernce type comapred by reference.
 
 */
public class this_keyword {
    
}
