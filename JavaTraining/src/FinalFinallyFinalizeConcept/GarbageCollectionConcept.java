package FinalFinallyFinalizeConcept;

public class GarbageCollectionConcept {

	/* 1. In java destruction of object from memory is done automatically by the JVM
	 * 2. No delete keyword in java
	 * 3. When there is no reference to an object, then that object is assumed to be no longer needed and the memory occupied 
	 *    by the object are released.
	 * 4. This technique is is called Garbage Collection. This is accomplished by the JVM.
	 * 
	 * 5. Whenever you run a java program, JVM created 3 threads
	 *    a) main thread  --> to execute main()
	 *    b) Thread Scheduler  --> to scheduling the threads or slicing the time for each thread
	 *    c) Garbage Collector thread  --> to sweep out abandoned objects from the heap memory.
	 * 
	 * 6. In these 3 threads, main thread is a user thread and remaining two are daemon thread which run in background.
	 * 7. Abandoned objects or dead objects are those objects which does not have live references.
	 * 8. Garbage collector thread before sweeping out an abandoned object, it calls finalize() of that object.
	 * 9. After finalize() is executed, object is destroyed from the memory.
	 * 10. We can call Garbage Collector explicitly using System.gc() or RunTime.getRunTime().gc()      
	 * 11. But it is just a request to garbage collector not a command. It is up to Garbage collector to honour to this requst
	 * 
	 * 12. Advantage of GC -> Increase memory efficiency and decreases the chances for memory leak.
	 * 
	 */
	
}   
