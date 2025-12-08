//ONE-SHOT CORE JAVA - YSD’s INTERVIEW NOTES
//
//        1. Java Overview & Basics
//        Definition:
//        Java is a platform-independent, object-oriented, high-level programming language.
//        Code (.java)→ Compiler → Bytecode(.class) → JVM (runs anywhere) → O/P .
//        HENCE, WHILE COMPILATION WE WRITE “javac filename.java” & WHILE EXECUTION WE WRITE “java filename”
//        Java Components:
//        _____
//        |JDK|
//        __________  /\   ____
//        |COMPILER|      |JRE|
//        |                   |___
//        |BYTECODE| →   |JVM| → O/P
//        JDK = JRE + Compiler + Dev tools.
//        JRE = JVM + Libraries.
//        JVM = Executes bytecode, handles memory, and JIT compilation.
//        Features:
//        Robust
//        Object Oriented
//        Simple
//        Distributed Application
//        Secure
//        Architectural Neutral
//        Portable
//        Multithreading
//
//
//
//
//
//        2. OOP Concepts ✅ VERY HIGH PRIORITY
//
//        Class - Blueprint that the object follows
//        Object - Instance of class
//
//Principles:
//        Encapsulation → Data hiding via private variables & public methods.
//        Inheritance → Code reuse via extends.
//        Polymorphism → Same method name behaving differently.
//        Abstraction → Hiding implementation using abstract classes/interfaces.
//        Common Pitfalls:
//        Forgetting @Override in overriding methods.
//        Overloading resolution occurs at compile time, while overriding takes place at runtime.
//        ⭐ Inheritance:
//        PARENT CLASS —EXTENDS→ CHILD CLASS
//        5 TYPES BUT JAVA SUPPORTS ONLY 3!
//        - SINGLE → directly java✅
//        - MULTI-LEVEL → directly java✅
//        - HIERARCHICAL → directly java✅
//        Code Example:
//// Parent class
//class Parent {
//    int a = 20;
//    void display() {
//        System.out.println("PARENT");
//    }
//}
//// Child class extending Parent
//class Child extends Parent { // Single Inheritance
//    int b = 10;
//    void show() {
//        System.out.println("CHILD");
//    }
//}
//class GrandChild1 extends Child{ // Multilevel Inheritance
//    int c1 = 1;
//    void disp1() {
//        System.out.println("GrandChild1");
//    }
//}
//class GrandChild2 extends Child{ // Hierarchical Inheritance
//    int c2 = 1;
//    void disp2() {
//        System.out.println("GrandChild2");
//    }
//}
//// Main class to test Inheritance
//class Inherit {
//    public static void main(String[] args) {
//        Child c = new Child();
//        System.out.println(c.b); // Child's variable
//        c.show();                // Child's method
//        System.out.println(c.a); // Parent's variable
//        c.display();             // Parent's method
//    }
//}
//- MULTIPLE → Not directly by Java❌ , but can be used Interface✅
//        - HYBRID → Not directly by Java❌ , but can be used Interface✅
//
//
//        ⭐ Polymorphism:
//        IMPLEMENTING THE SAME THING IN DIFFERENT WAYS!
//        -  Compile-Time Polymorphism → Method Overloading → Static Binding
//        -  Run-Time Polymorphism → Method Overriding → Dynamic Binding→ performed by Inheritance
//
//
//        ⭐ Abstract Classes & Interfaces
//        Abstract Class & Methods:
//        -  Abstract Method is the method with only a declaration but no definition!
//        -  Abstract Class is a class with at least one Abstract method
//-  Can have both abstract & concrete(normal) methods.
//        -   Implementation of Abstract Methods will be written in the Derived Class
//        -  NEED TO USE abstract KEYWORD!
//        -  OBJECT CAN’T CREATE!!
//        -  SO TO IMPLEMENT ABSTRACT METHODS WE NEED TO CREATE
//        CONTRACT CLASS AND THEN WE NEED TO CREATE AN OBJECT OF THE     CONTRACT CLASS!!
//        Code Example:
//// Abstract class A
//abstract class A {
//    abstract void display();
//}
//// Abstract class B extends A
//abstract class B extends A {
//    void display() {
//        System.out.println("Class A");
//    }
//    abstract void show();
//}
//// Class C extends B
//class C extends B {
//    void show() {
//        System.out.println("Class B");
//    }
//}
//// Main class
//class AbstractDemo {
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.display(); // Calls display() from B
//        obj.show();    // Calls show() from C
//    }
//}
//
//Interfaces:
//        - USED TO ACHIEVE MULTIPLE AND HYBRID INHERITANCE!
//        - ONLY ABSTRACT METHODS!
//        - INTERFACE ALWAYS IMPLEMENTED, NOT EXTENDED!
//        - SO, class can’t extend 2 classes, so we can’t implement multiple inheritance, but we can implement 2 interfaces, hence we can achieve multiple and hybrid inheritance:)
//        \
//
//        Code Example:
//// Interface A
//interface A {
//    void Adisplay();
//}
//// Interface B
//interface B {
//    void Bdisplay();
//}
//// Class AB implements both interfaces
//class AB implements A, B {
//    public void Adisplay() {
//        System.out.println("A DISPLAY");
//    }
//    public void Bdisplay() {
//        System.out.println("B DISPLAY");
//    }
//}
//// Main class
//class AMain {
//    public static void main(String[] args) {
//        AB obj = new AB();
//        obj.Adisplay();
//        obj.Bdisplay();
//    }
//}
//⭐Packages & Access Modifiers
//
//        Package:
//        - consists of classes and interfaces so we can directly use those classes and their method without implementing by just creating an object!
//        - it should not main class
//
//steps:
//        Step 1: Create the package class
//File: A.java
//        package pack;
//public class A {
//    public void show() {
//        System.out.println("A class");
//    }
//}
//_______________________________________________
//        |Compile with:						            |
//        |javac -d . A.java                          |
//        |This will create a folder named pack containing A.class. |
//
//        Step 2: Create the Main class
//File: MainDemo.java
//        import pack.A;
//public class MainDemo {
//    public static void main(String[] args) {
//        A obj = new A();
//        obj.show();
//    }
//}
//
//______________________
//        |Compile and run:                |
//        |javac MainDemo.java |
//        |java MainDemo       |
//
//        Step 3: O/P
//        ______________
//        | Output will be:   |
//        |_A class_____|
//
//        Access Modifiers:
//public: Everywhere
//protected: Same package + subclass
//default: Same package
//private: Within class
//
//
//
//
//
//
//3. Keywords & Data Types
//        Primitive Types: byte(1 byte), short(2 byte), int(4 byte), long(8 byte), float(4 byte), double(8 byte), char(2 byte), boolean(1 bit).
//        Non-Primitive: String, Arrays, Classes, Interfaces.
//        Special Keywords:
//final → constant/immutable.
//static → belongs to class.
//        this → refers to the current object.
//        super → refers to the immediate parent class object.
//        extends→ used in class declarations to establish an inheritance relationship.
//        package→  refer to a group of classes and an interface
//enum→  special data type that represents a fixed set of named constants
//        Pitfall:
//        == checks reference, .equals() checks value.
//
//        4. Input & Output
//        “See by creating an instance of Class i.e object, we can access its variables and methods”
//        We have standard input and output streams called IOStreams
//        System.in→ Read Data
//        System.out→ Display Data
//        System.err→ Display error.
//        And hence we need to import java.lang package in which we have the standard classes of IOStreams
//        Scanner (easy but slower):
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        BufferedReader (faster, checked exception):
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        Interview Tip: BufferedReader is faster because it reads chunks of data.
//        Also, while using InputStreamReader, we need ot extend IOException to handle ase when we are putting data from an empty file.
//
//        5. Command Line Argument & main Function
//
//        See, we can input directly through the CMD line argument …
//        HOW?
//        See “main(String args[])”
//        This is an argument of a String array named args[], so we can directly pass it to this, and as the main function loads, it will take input while running the code.
//
//
//        Code Example:
//        Class Main{
//public static void main(String args[]){
//        int a = Integer.parseInt(args[0]);
//        }
//        }
//
//        So …..“public static void main(String args[])”
//        Public - Access modifier used to provide access (Encapsulation)
//static - to access this method w/o creating objects directly by class name
//void - return type
//        main(String args[]) - cmd line argument (this is syntax by compiler, like must need thing!!)
//
//        6. Variables, Constructors
//        Variables are of 3 types
//        1. Local -
//        Within a Method.
//        Direct Access.
//        2. Instance-
//        Declared inside the class
//Accessing is done through the Object.
//        3. Static-
//        Memory allocated only once
//        Declared using the Static Keyword
//        Directly access
//
//        Constructor-
//        A constructor is a special method without a return type and with the same name as the class name used to initialize the object.
//        Note - it is called when we create an object using that ‘new’ keyword!! as even if you create or don’t create java has it’s own default constructor, so when an object is create constructor is used!!
//        2 types of constructor - Default(no argument) and Parameterized(with arguments)!
//
//        7. Keywords
//        1. Static:
//        To Access the variables and methods, we need to create an object (instance) so what if I don’t want to create an object?
//        → USE static!!
//
//        2 ways of use
//        I. In the SAME class, i.e in our main class where the main method is present..
//        directly access static variables ✅
//        directly access methods ✅
//        directly access static blocks without calling✅
//        II. In the DIFFERENT class but in the SAME FILE.
//        access static variables BY CLASS NAME✅
//        access methods BY CLASS NAME ✅
//        access static blocks without calling ONLY IF ANY REFERENCE IS SHARED✅
//        Code Example:
//class Demo {
//    static int a = 10;
//    static void display() {
//        System.out.println("Static Method");
//    }
//    static {
//        System.out.println("Static Block");
//    }
//}
//class StaticDemo {
//    public static void main(String args[]) {
//        System.out.println(Demo.a);  // REFERENCE
//        Demo.display(); // REFERENCE
//    }
//}
//    SO IF WE DELETE THESE 2 LINES IN WHICH IS POINTING DEMO CLASS, OUR STATIC BLOCK WILL NOT RUN DIRECTLY!!
//        THIS IS CALLED REFERENCING!!
//
//        2. this:
//        Represent instance variables of the current object.
//        Code Example:
//class ThisDemo {
//    int a = 10; // Instance variable
//    void display() {
//        int a = 200; // Local variable
//        System.out.println("LOCAL VARIABLE = " + a);
//        System.out.println("INSTANCE VARIABLE = " + this.a); //ALWAYS PRINT INSTANCE!
//    }
//    public static void main(String[] args) {
//        ThisDemo obj = new ThisDemo();
//        obj.display();
//    }
//}
//
//3. Super:
//        While Implementing Inheritance…Parent –Extends→ Child
//        So, what if Child OVERRIDES the parent method/variable?
//        “super” keyword is used to access the IMMEDIATE(only one level up, not more than that) parent method/variable/constructor, if both have the same name
//        SO NEED TO NOTE THAT WE HAVE TO USE THIS SUPER IN THE CHILD CLASS ONLY!
//
//        Code Example:
//class Parent
//{
//    Parent()
//    {
//        System.out.println("Parent Constructor");
//    }
//    int a = 40;
//    void display()
//    {
//        System.out.println("PARENT CLASS");
//    }
//}
//class Child extends Parent
//{
//    // super();  // implicitly called by the JVM, so no need to //explicitly call for the parent constructor if there is any //constructor in the parent that will be directly called!
//    Child()
//    {
//        System.out.println("Child Constructor");
//    }
//    int a = 30;
//    void display()
//    {
//        System.out.println("CHILD CLASS");
//    }
//}
//class ParentChild
//{
//    public static void main(String args[])
//    {
//        Child obj = new Child();
//        obj.display();
//    }
//}
//8. Strings
//        String: Immutable(CAN’T BE MODIFIED)-> so if we tried to modify that new reference is created in the heap memory-> more MEMORY -> stored in String Pool.
//        Code Example:
//        String str = new String(" Hello");
//        System.out.println(str);System.out.println(str.length());
//        System.out.println(str.indexOf("H"));
//        System.out.println("Character at=" + str.charAt(4));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.compareTo("hello"));
//        System.out.println(str.trim());
//
//        StringBuffer: Mutable + synchronized-> NO SEPARTE REFERENCE WHILE MODIFICATION-> LESS MEMORY.
//        Code Example:
//        StringBuffer str = new StringBuffer("WELCOME");
//        System.out.println(str);
//        System.out.println(str.append(" to JAVA"));
//        System.out.println(str.insert(4, "HOW"));
//        System.out.println(str.delete(4, 7));
//        System.out.println(str.reverse());
//        System.out.println(str.length());
//        System.out.println(str.reverse());
//        System.out.println(str.indexOf("WELCOME"));
//        System.out.println(str.charAt(6));
//        System.out.println(str.substring(8));
//        System.out.println(str.subSequence(11, 15));
//        System.out.println(str);
//
//        StringBuilder: Mutable + not synchronized (faster).
//        9. Method Overloading vs Overriding
//        Overloading: Same name, diff params, compile-time.
//        3 Types                              __
//        - Constructor Overloading     |
//        - Method Overloading	           |→  POLYMORPHISM(COMPILE TIME)
//        - Operator Overloading      __|
//
//        Overriding: Same signature in subclass, runtime.
//        – With the help of INHERITANCE.
//        – Method name should be the same in both the super and subclass.
//        – Return type, Scope, Parameter should be the same.
//        – Static methods cannot be overridden (method hiding).
//        – Final methods cannot be overridden.
//        Code Example:
//class Parent {
//    void display() {
//        System.out.println("PARENT");
//    }
//}
//class Child extends Parent {
//    void display() {
//        super.display(); //to access parent method
//        System.out.println("CHILD"); //override
//    }
//}
//class Override {
//    public static void main(String args[]) {
//        Child c = new Child();
//        c.display();
//    }
//}
//10. Exception Handling ✅ VERY HIGH PRIORITY
//
//        EXCEPTION - UNEXPECTED/UNWANTED events
//        HANDLING - ALTERNATIVE PATH SO THAT, ABLE TO REACH AT LEAST TO THE
//        FINAL O/P
//        Feel:-           _
//        O    |  “ ME SUBH UTHA AND SUPPOSE KI, DJ ME JA RAHA HU AND
//        /|\   |  TRAIN   BHICH ME HI RUK GAY KYUKI SOM POWER FAILURE..
//        |     |==> NOW, ME TRAIN SE NIKAL KE NEAREST STATION GAYA AND
//        /\ _|  UDHERSE PUBLIC TRANSPORT SE COLLEGE GAYA.. ”
//
//        SO YAHA JO MERA DAILY ROUTINE HAI JO KI ME TRAIN SE HI JATA HU VHO DISTURB HUA BECAUSE OF THIS UNEXPECTED/UNWANTED EVENT..
//        HENCE, THIS UNEXPECTED/UNWANTED EVENT IS AN EXCEPTION
//        AND TO HANDLE THIS EXCEPTION, I USED ANOTHER ALTERNATIVE WAY..
//        SO THIS IS EXCEPTION HANDLING
//        NOTE:- NOT A SOLUTION TO THE EXCEPTION....
//
//        DEF:-**"An EXCEPTION is an UNWANTED/UNEXPECTED/ABNORMAL  event/condition, which occurs during the execution of a program (i.e, at *RUN TIME NOT AT COMPILE TIME..*), that disturbs the normal flow of the program "**
//
//        AND DUE TO THIS AAGE WALA CODE RUN HI NAHI HOGA…….
//        SO, EXCEPTION HANDLING IS  AVOIDING ABNORMAL TERMINATION OF PROGRAM
//
//        TYPES:-
//        -  Checked: Compiletime Exception(NOT OCCURS AT COMPILE TIME JUST CHECKED AT COMPILE TIME!) → Must handle →occurs BECAUSE OF PROGRAMS
//        EX-  FileInputStream fis = new FileInputStream("d:/abc.txt"); // FILE NOT FOUND
//
//        - Unchecked: Runtime Exception. →  All Exceptions in Throwable class→ -||-
//        EX- System.out.println(100/0); // DIVIDEBYZERO
//
//        - Errors: Serious issues → Runtime/Unchecked→ occurs BECAUSE OF LACK OF system RESOURCES
//        NOTE⇒
//        1. koi exception compile time pe check nahi hoti sab run time me samjti hai..
//        2. So, compileTime exception MATLAB "warning of the exception that can ocurrs   at run time " which is nothing but compileTime exception..
//        3 Indirectly, jis exception ke PREDICTION compiler kar sakta hai vhi compileTime and rest are RUNTIME..
//        Consists block ⇒
//        - try: (must present) block in which we are expecting the execution
//        - catch: (must present) block in which we handle the Exception raised in the try Block
//        - finally: (may present)  for running "cleanUp code" jo resources try me open kiye
//        he vho finally me close karte nhai..
//        - throw: is used to explicitly create and throw an instance of an exception.
//        - throws: used in the signature of a method to indicate that this method might throw one of the listed exception types.
//        DIFFERENT SCENARIOS OF IMPLEMENTING EXCEPTION HANDLING….
////scenario1 ⇒SIRF TRY OR CATCH OR FINALLY
//// try{
//// }
//        **OR***
//// catch(Exception e){
//// }
//        **OR**
//// finally{
//// }
//        O/P→
//        // COMPILE HI NAHI HOGA KYUKI try-catch and try - finally  HAMESHA EKSAT HOTE HAI..
//// senario2 ⇒
//// try{
//// }
//// catch(Exception e){
//// }
//// catch(Exception e){
//// }
//// catch(ArthmeticException e){
//// }
//
//        O/P→
//        //FIRSE COMPILE NAHI HOGA KYUKI "exception Exception has already been caught" & "exception ArithmeticException has already been caught" i.e Exception ME SAARI EXCEPTION AA JATI HAI TO FIRSE LAGANE SE FAYDA KYA..?
//// senario3⇒
//// try{
//// }
//// finally{
//// }
//// catch(Exception e){
//// }
//
//
//        O/P→
//        // ERROR->FINALLY KE VAJAHSE CATCH LAVARIS HO GAYA SO CATCH EITHER NIKALO YA USKO EK TRY DEDO..
//
//
//// senario4⇒
//// try{
//        // try{
//        // }
//        // catch(Exception e){
//        // }
//// }
//        **OR**
//// try{
//// }
//// catch(Exception e){
//        // try{
//        // }
//        // catch(Exception e){
//        // }
//// }
//        O/P→
//        SUCCESSFULLY RUN HONGE…
//        ***imp -> yaha program chalega that doesn't means ki exception removed or repaired bass hamne alternative path use karke final o/p tak pauche hai..***
//
//
//        Throws and throw
//        THROW⇒
//        1. HAME EXCEPTION KI CONDITION CHAYIE THE SIRF..NOT HANDELING..
//        2. IF EXCEPTION KI CONDITION FULFILLED THEN VO EXCEPTION PRINT KAREGA ..
//        3 .IMP-.HE EXCEPTION defult EXCEPTION HANDELER KARVARAHA HE..
//
//        BUT HOW??
//        4.default HANDELR ->CLASS ME GAYA AND CHECK FOR EXCEPTION→
//        IF AN EXCEPTION IS THERE? →
//        IF  YES!! →
//        // THEN VHO throw KAREGA EXCEPTION "ExceptionClassName" , msg                                                                // THEN JO MSG HAI VO BHI HANDELER KE PAS JA KE TRACE default PRINT KAREGA...
//        IF NO!! →
//        //THEN APNA KAM KAR .....
//        example
//        throw new ArithmeticException("/ by zero");
//        THROWS⇒
//        HAME MALUM HE KI HAI COMPILETIME EXCEPTION  HAI SO YAHA handeling KARNI PADEGI BUT,
//        HUM CHAHATE HAI KI JO DEVLOPER IS VALE METHOD KO USE KARE VAHI HANDELING CODE BANAYE HUM KHUDSE NAHI DENGE SAB KO..
//        SO ABB KYA SOLUTION HAI??
//        SO HERE COMES IMP OF *throws* KEYWORD..
//        SO BY USING THROWS HUM JO BHI USS FILE/METHOD KO USE KARNE VALA HE USKO BATA DIYA KI ISSME YE NAAM KA ERROR HAI..
//        SO, HAME JO BHI EXCEPTION HAI USEE import BHI KARNA PADTA HAI..
//        NOTE =>
//        1.**throws ONLY FOR COMPILETIME/CHECKED EXCEPTIONS KELIYE HI USE KAR SAKTE HAI..**  BECAUSE check to user ke vajah se aata hai.. na to uska fault hai hum kuvh nahi kr SAKTE..
//        2.**throws KEYWORD SE BHI HANDELING NAHI HOTI ONLY EXCEPTION NAME JO USER VO METHOD KO USE KAR RAHA HAI USSE SAMAJTA HAI..**
//        example
//        type method_name(parameters) throws exception_list
//        REOURCE APNA HI HAI .. → https://www.onlinegdb.com/edit/-MerqmhSQ
//
//        11. Multithreading
//        A thread is a lightweight process, and it’s individual part of running program so group of threads is collectively called a Program!
//
//        Life Cycle of Threads ⇒
//        Note- Thread is class!!
//        So when we create an object → new  {Thread t = new Thread();}
//        If the thread is ready to run  → Runnable {t.start();}
//        If the professor is  available or the thread started execution→ Running {t.run();}
//        If any interruption arrived → Waiting/Blocked {t.sleep(); t.wait();}
//        If so thread can go to the runnable or running state based on professor is busy or not
//        If no interruption occurs and execution is finished, then it reaches → Stop  {t.stop();}
//
//
//
//
//
//
//
//
//
//
//        Implementation Of Thread⇒
//
//        1. Using Inheritance (Thread Class):
//        class MyThread extends Thread //extends Thread class
//        {
//        public void run()   //overriding run method of Thread class
//        {
//        System.out.println("Running");
//        }
//        }
//        Class ST
//        {
//        public static void main(String args[])
//        {
//        MyThread m = new MyThread(); //crate Object of out thread
//        m.start(); //start execution & implicitly calls run();
//        }
//        }
//        2. Using Interface (Runnable):
//        class MyThread implements Runnable //implements Runnable interface
//        {
//        public void run() //overriding run method of Thread class
//        {
//        System.out.println("Running");
//        }
//        }
//        Class ST
//        {
//        public static void main(String args[])
//        {
//        MyThread m = new MyThread();//crate Object of out thread
//        Thread t = new Thread(m);//pass object to Thread class
//        t.start(); //start execution & implicitly calls run()
//        }
//        }
//
//
//
//
//        Methods of Thread Class in Java⇒
//        - start()- Starts the execution of the thread by calling the run() method internally.
//        - run()- Implicitly called by start(). Defines the code executed by the thread.
//        - sleep(milliseconds)- Suspends the thread for the given milliseconds of time. (Static method, must be used in try-catch block).
//        - join()- Waits for a thread to complete its process. (Used in multithreading, requires try-catch).
//        - getId()- Returns the ID of a thread.
//        - getName()- Returns the thread name. By default, thread names start from 'Thread-0'.
//        - setName(String)- Replaces the thread name with the given string.
//        - getPriority()- Returns the priority of the thread. Priority ranges from 1 to 10.
//        - MIN_PRIORITY = 1
//        - NORM_PRIORITY = 5 (default)
//        - MAX_PRIORITY = 10
//        - setPriority(int)- Sets the priority of the thread (range 1 to 10). Example: setPriority(10).
//        - isAlive()- Checks if the thread is still running.
//        - true: if thread is running
//        - false: if thread has completed execution.
//        Synchronization:
//        synchronized blocks ensure one thread accesses resource at a time.
//
//
//        volatile ensures visibility across threads.
//
//        12. Applets & AWT (Legacy GUI)
//        Applet Lifecycle: init(), start(), paint(), stop(), destroy(). (Deprecated)
//        AWT Components: Button, Label, TextField, etc.
//        Event Handling: Implement listeners (ActionListener, MouseListener).
//
//
//
//
//
//        INTERVIEW QUESTIONS
//
//        1. Difference between JDK, JRE, JVM?
//        JDK: Java Development Kit – Includes JRE + development tools (compiler, debugger).
//
//
//        JRE: Java Runtime Environment – Includes JVM + libraries for running Java apps.
//
//
//        JVM: Java Virtual Machine – Executes bytecode, provides platform independence.
//
//
//
//        2. Why is Java platform-independent?
//        Java code → compiled into bytecode → JVM interprets bytecode → runs on any OS with a JVM.
//
//
//        WORA: Write Once, Run Anywhere.
//
//
//
//        3. Difference between abstract class and interface?
//        Feature
//        Abstract Class
//        Interface
//        Methods
//        Can have abstract + concrete
//        All methods abstract (Java 7), default/static (Java 8+)
//        Variables
//        Can have instance vars
//        Only public static final
//        Inheritance
//        Single
//        Multiple
//        Use
//        Common base with partial impl
//        Contract for behavior
//
//
//        4. String vs StringBuilder vs StringBuffer?
//        String: Immutable, thread-safe (no change allowed).
//
//
//        StringBuilder: Mutable, not thread-safe, fastest for single-thread.
//
//
//        StringBuffer: Mutable, thread-safe (synchronized), slower than StringBuilder.
//
//
//
//        5. Method overloading vs overriding?
//        Overloading: Same method name, different parameter list, compile-time polymorphism.
//
//
//        Overriding: Same method signature in subclass, runtime polymorphism.
//
//
//
//        6. Checked vs unchecked exceptions?
//        Checked: Compile-time check, must be handled (IOException, SQLException).
//
//
//        Unchecked: Runtime exceptions (NullPointerException, ArrayIndexOutOfBoundsException).
//
//
//
//        7. throw vs throws?
//        throw: Used inside method to throw an exception object.
//
//
//        throws: Declares exceptions a method might throw.
//
//
//
//        8. final vs finally vs finalize()?
//        final: Keyword for constants, non-overridable methods, non-inheritable classes.
//
//
//        finally: Block always executed after try-catch.
//
//
//        finalize(): Method called by GC before object is destroyed (deprecated).
//
//
//
//        9. HashMap vs Hashtable?
//        HashMap: Not synchronized, allows one null key, faster.
//
//
//        Hashtable: Synchronized, no null keys, slower.
//
//
//
//        10. ArrayList vs LinkedList?
//        ArrayList: Fast random access, slow insert/delete (except at end).
//
//
//        LinkedList: Slow access, fast insert/delete.
//
//
//
//        11. wait() vs sleep()?
//        wait(): Releases lock, used for thread communication.
//
//
//        sleep(): Doesn’t release lock, just pauses thread.
//
//
//
//        12. volatile vs synchronized?
//        volatile: Variable value always read from main memory, no caching.
//
//
//        synchronized: Locks a block/method to prevent concurrent access.
//
//
//
//        13. Transient keyword?
//        Prevents a variable from being serialized.
//
//
//
//        14. Serialization in Java?
//        Process of converting an object into a byte stream to store/transfer it.
//
//
//        Implement Serializable interface.
//
//
//
//        15. Why multiple inheritance not supported in classes?
//        To avoid Diamond Problem (ambiguity in method resolution).
//
//
//
//        16. What is garbage collection?
//        JVM automatically removes unused objects from memory.
//
//
//        Uses algorithms like Mark and Sweep.
//
//
//
//        17. Why main() is static?
//        JVM calls main() without creating an object.
//
//
//
//        18. Access modifiers order (most restrictive → least):
//        private → default (package-private) → protected → public
//
//        19. Static block vs constructor?
//        Static block: Runs once when class loads, before main().
//
//
//        Constructor: Runs each time object is created.
//
//
//
//        20. Difference between == and equals()?
//        ==: Compares references (memory addresses).
//
//
//        equals(): Compares object content (can be overridden).
//
//
//
//        21. What is Java’s memory structure?
//        Heap: Stores objects.
//
//
//        Stack: Stores local variables and function calls.
//
//
//        Method Area: Stores class structure, static vars.
//
//
//        PC Registers & Native Method Stack: JVM internals.
//
//
//
//        22. What is method hiding?
//        If a static method is redefined in a subclass, it hides the superclass method (not overridden).
//
//
//
//        23. Difference between compile-time and runtime polymorphism?
//        Compile-time: Method overloading.
//
//
//        Runtime: Method overriding.
//
//
//
//        24. What is marker interface?
//        Interface with no methods (e.g., Serializable, Cloneable), used for metadata.
//
//
//
//        25. What is the difference between shallow copy and deep copy?
//        Shallow: Copies object but references same inner objects.
//
//
//        Deep: Copies object and its inner objects completely.
//
//
//
//
