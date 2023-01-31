
operations = searching, sorting, insertion, manipulation/updation, and deletion

Java Collection framework provides many interfaces : set, list, queue, deque
Java Collection framework provides many classes : ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet

Q- what is collection in java ?
- Any group of individual objects which are represented as a single unit is known as collection. ex- dvd, books, movies, songs, laptops, mobiles  

Q- what is framework ?
- it is a set of classes and interfaces which provide a ready made architechture.
- they are written so that we do not have to write code again and again. We can reuse them wherever needed.

Q- what is collection framework ?
- Collection framework is java API which provide architecture to store and manipulate group of objects.

Collection : it is an Interface. interfaces can't be instantiated. it has come from 1.2v of java. It represents a group of objects as single unit. It has 4 childs : list set queue map

List : it is also interface
- it's child are ArrayList, LinkedList, Vector => they are all classes
- it creates indexed collection (index like array)
- order is preserved 
- duplicates are allowed 

ArrayList : it will work upon dynamic array. it is non thread safe 
LinkedList : it will work upon doubly linked list
Vector : it will work upon dynamic array. it is thread safe. It has one child which is stack (LIFO). 


set : it is also interface
- it has two child : hashSet and sortedSet
- it does not create indexed collection. 
- order is not preserved
- duplicates are not allowed 

HashSet : its implementation class of set. it has a child LinkedHashSet
LinkedHashSet : order is preserved here but duplicates are not allowed 
SortedSet : it provides sorting functionality in the collection. it has a child TreeSet.
TreeSet : elements in treeSet are already sorted. ascending sorting for num and string. can also implement custom logic. Its working on BST.


collection interface extends iterable : using for each we can iterate over each child elements 
Iterator : it is an interface. it has a Has-A relationship. using Iterator we can traverse set and list both. it provides us object in forward direction. for that there is another Iterator which is listIterator.
ListIterator : we can traverse using this in backward direction also. List has its object. Set can't be traversed using ListIterator. Has-A relationship. 

- we can traverse list and it's child using 3 ways : Iterable, Iterator, ListIterator
- we can traverse set and it's child using 3 ways :  Iterable, Iterator

Enumeration : it's another way of traversing vector in 1.0v of java. it is an interface. vector has it's object. so we can traverse vector using enumeration also. 


In total we have 5 types of traversal ways some apply to some while some don't 
- Iterable
- Iterator
- ListIterator
- Enumeration 
- 1.8v of java has foreach() method also of traversing. 

class extends class
interface extends interface
class implements interface 


--------------------------------------------------------------------------------------------------------------------------------------------------------------------

heirarchy of map : it has two childs HashMap and SortedMap
- it provides us key value pair functionality. order or keys is not preserved. duplicate keys are not allowed.  
HashMap : it's a class. it's a child implementation and it has another child LinkedHashMap
LinkedHashMap : keyorder is preserved in this but duplicates not allowed.  
SortedMap : it's a interface. it has a child TreeMap 
TreeMap : it's a class and a child implementation. it provides us keywise sorting.  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

All classes and interfaces we learned are inside util package of java. 

There are two ways of creating collection 
1) Type Safe collection : same type of elements or objects are added to collection 


2) Un Type Safe collection : different types of elements can be added to collection. 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
ArrayList : type safe and un type safe
Type safe : ArrayList<String> names = new ArrayList(); , Can store the type defined only
Un Type safe : ArrayList names = new ArrayList(); , Can store of any type

- If Type safe is string than you can only add string to collection
- it is a class
- order is preserved
- elements are indexed. ex- names.get(1) or names.get(0)
- duplicacy allowed 
- If the object is declared Un Type safe then it can have any data type in one collection like string, num, boolean, double/float
- 

Methods in ArrayList:
- names.add() and TC = O(1) 
- names.get() and TC = O(1)
- 



--------------------------------------------------------------------------------------------------------------------------------------------------------------------
LinkedList : 

- it is a class 
- everything is same as above. 






Methods in LinkedList:
