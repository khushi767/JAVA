/*
 * Automatic process: Garbage collection is managed by java virtual machine(jvm), running in background.
 * 
 * Object eligibility: objects that are no longer reachable, meaning no active references to them,are eligible for garbage collection.
 * 
 * no manual control: unlike c++,java developers cannot explicitly deallocate memory.Garbage collection is automatic and non-deterministic.
 * 
 * Generational collection: java uses a generational garbage collection strategy,which divides memory into different regions(young,old,permanent) based on ages.
 * 
 * 
 * heap memory:garbage collection occurs in heap memory,where all java objects reside.
 * 
 * performance impact:garbage collection can affect application performance, particularly if it runs frequently or takes a long time to complete.
 * 
 * 
 */

 /*Life time of finalizable object obj
 obj created->obj unreachable->obj added to finalization queue->obj finalized->obj reclaimed

 1.) Finalization: Before an object is garbage collected,the finalize() method may be called, giving the object a chance to clean up resources.however,it's not guaranteed to run, and its usage is generally discouraged.

 2.)Optimization: Developers can optimize the process indirectly through code practices like setting unnecessary object references to null.

 3.) System.gc() call: while system.gc() suggests that the jvm performs garbage collections,it's not a guarantee
  * 

  */

public class garbage_collection {
    
}
