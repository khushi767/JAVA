import java.lang.*;
/*public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/

/*
Java features/Buzzwords

* Robust: Java is robust due to its dtring memory management,
  expception handling and type checking mechanisms which help in preventing system crashes and ensures stable perfomances.

* Multithreading: Ability of cpu to execute multiple threads concurrently, allowing for more efficient processing and task management.

* Artitectural Neutral: Java is artitecturally neutral because its complied code (bytecode) can run on any device with a java virtual machine (jvm),regarding underlying hardware artitecture.

* Interpreted and high performance with interpretability, as its bytecode is interpreted by the virtual machine (jvm), which deploys just-int-time(jit) common for efficient and faster

* Distributed: Java is inherintly distributed, designed to facilitate network based application development and interaction, seamless integration with internet protocols and remote method invocation.

* Object Oriented Programming
class: human, object:name,properties:id,phone_no,methods:job,send_email

------------------------------------
Java Basics
Installing JDK,first class using text editor,Compiling andd Running
Anatomy of a class, file extensions,jdk vs jvm vs jre
importance of main method

---basic Programm

import java.lang.*;
public classFirstProgram{
    public static void main(String[] args){
        System.out.println("hello");
    }
}

program.java(.java source file)->java compiler(javac)-->program.class(bytecode.class file)-->java-->output



public : public so everyone can access its
class: this is a class
myfirstapp: the name of this class
{

    public
    static
    void: return type
    main: name of this method
    (string[] args): arguments to the method.this method must be given an array of strings, and array will be called args

    System.out.print("")//this says print to standard output
}


.java:
contains java source code, high level human readable,used for development,file is editable

.class
contains java bytecode,for consumption of jvm,used for execution,not meant to be edited

JDK(Java Development kit)-->Java Development tools like javac,jheap,java,execute
JRE(Java runtime enviroment)->jvm(java virtual machine) Set of java libraries,other files

.jdk: it is a software development kit required to develop java application
includes jre, an interpreter/loader(java),a compiler(javac),and other tools needed for java Development
essentially, jdk is a superset of jre


jre:
it is aa part of jdk but can be downloaded seperately
provides libraries ,jvm and other components to run applications
does not have tools and utilities for developers like compilers or interpreter

jvm: 
it is part of jre and responsible for executing bytecode.
ensures java's write once run anywhere capability.
not platform independent : a different jvm is needed for each type

Importance of main method:
Entry Point: it is entry point of a java program, where execution starts without main method, java virtual machine(jvm)does not know where to begin running the code.
Public and Static: the main method must be public and static ensuring it's complied to jvm without needinf to instantiate the class.
Fixed Signature: the main method has a fixed signature:public static void main(String[] args).Deviating from this signature means jvm wont be able to find the starting point.

Public class Goodmorning{
public Statci void main(args[] String ){
Syste,.out.println("goodmorning");
}
}

*/

public class hello{
public static void main(String args[] ){
//System.out.println("goodmorning");


}
}