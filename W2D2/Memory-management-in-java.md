
Java memory management divides into two major parts:
1) JVM Memory Structure
2) Working of the Garbage Collector


- It is managed by Java automatically. Java uses an automatic memory management system called a garbage collector.
- The JVM divides the memory into two parts: stack memory and heap memory.
- stack is used to store the order of method execution/invocation and local variables
- heap memory stores the objects
- Memory management in the stack follows LIFO
- Heap stores objects and JRE classes.
- In heap, For managing the memory automatically, Java provides the garbage collector that deletes the objects which are no longer being used. 
Heap memory is of 5 types 
Young generation
Survivor space
Old generation
Permanent generation
Code Cache

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

.java converts to .class(bytecode) through compiler
- this bytecode is run by JVM
- jvm is divided into 3 parts :- a) classloader b) memory areas c) execution engine

a) classloader
- .class file gets memory allocation in memory areas through classloader
- class loader has 3 processes that it uses to allocate memory to .class file to memory areas a) loading b) linking c) initialization
- .class file goes to classloader and loading process has 3 components  
1) Bootstrap class loader
2) Extension class loader
3) Application class loader
these loader helps .class file in memory allocation in memory areas
- then .class comes across next process which is linking process and it has 3 component 
1) verify
2) prepare
3) resolve
- then .class comes across next process which is initialization and it has 2 component
1) All static variables are assigned with values.
2) Static block will be executed from top to bottom.

b) Memory areas : method area, heap area, stack area, pc register, Native method area 
method area = static variables 
heap area = objects, arrays, instance variables. It follows dynamic memory allocation || outofmemory error 
stack area =  primitive data type, function calls, object references || stack overflow error

stack area pc register native method area are thread safe 
method area and heap area are not thread safe 

c) execution engine : It has interpreter and jit compiler


--------------------------------------------------------------------------------------------------------------------------------------------------------------------Garbage collector :
- works on mark and sweep algorith 