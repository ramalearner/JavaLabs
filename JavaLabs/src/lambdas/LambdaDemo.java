package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaDemo {
    // I. Structured Programming
    // 1. Executes code from algo point of view
    // 2. Focus is more on the logic side
    // 3. Maintenance is difficult => Code is so intertwined
    // 4. Understanding the flow in bigger flow is complicated
    // 5. Programming Langs => C, C++, Python
    // 6. Not close to real world
    // II. Object Oriented Programming Systems (OOPS)
    // 1. You are imagining the solution as interactions between different kinds of people
    // 2. Movie has prod, dir, actors, technicians
    // 3. Easy to manage the code
    // Programming langs => Java, C++, Python
    // III. Functional programming
    // 1. Has the ability to pass code as arg
    // 2. It uses functional interface
    //
    // Primary concepts
    // Class => Template for create an object. It has instance variables / static variables and instance methods / static methods => Abstract entity
    // Object => Specific instance of the class => Concrete entity
    // Interface => Defines the contract of what all methods (which is called API) that its implementer will support
    // Abstract Class => You cannot create objects of class. This may have 0 or more abstract methods. Class level must be defined as abstract.
    // Final Class => Non-extendable class

    public static void main(String []args) {
        HelloLambda hl = new HelloLambda(); // Traditional object creation and call is OOPS
        hl.something1();

        Lambda1 l1 = () -> System.out.println("Welcome to functional programming"); // Dynamically define code and call them
        Lambda1 l11 = () -> System.out.println("Welcome to next gen programming"); // Dynamically define code and call them
        Lambda3 l3 = () -> { System.out.println("Welcome to functional programming yet again"); }; // Dynamically define code and call them
        Lambda2 addLambda = (int x, int y) -> { int i = x+y; System.out.println(i); return i; };
        Lambda2 multiplyLambda = (int x, int y) -> { int i = x*y; System.out.println(i); return i; };

        l1.anything();
        l11.anything();

        l3.something2();

        System.out.println(addLambda.something3(10,20));
        System.out.println(multiplyLambda.something3(30,40));

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        Thread t = new Thread(r1);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside a thread");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("Inside a thread"));

        Thread t3 = new Thread(() -> {
            for (int i=0; i<10; i++) {
                System.out.println(i);
        };
        });

        String [] team = { "Rama", "Teja", "Hari", "Pandu", "Usha", "Amrutha"};
        Arrays.stream(team).toList().forEach(s -> System.out.println(s));

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Sitaphal");
        fruits.add("Sapota");

        for(String f:fruits) {
            System.out.println(f);
        }

        fruits.forEach(s -> System.out.println(s));
        fruits.forEach(System.out::println);

        Consumer<String> method1 = (n) -> System.out.println("Hello Lambdas"); ;
        fruits.forEach(method1);

        Consumer<String> method2 = System.out::println;
        fruits.forEach(method2);

//        ArrayList<String> a=new ArrayList<>();
//        a.add("Dallas");
//        a.add("Frisco");
//        a.add("Bangalore");
//
//        Consumer<String> obj=(message)-> System.out.println("Demo of Consumer"+message);
//        a.forEach(obj);

    }
}

class HelloLambda {
    void something1() {
        System.out.println("Welcome to lambdas, not quiet yet");
    }
}

// Functional interface
// It has one and only one method

@FunctionalInterface
interface Lambda1 {
    void anything();
}

@FunctionalInterface
interface Lambda3 {
    void something2();
}
// Functional interface
// It has one and only one method
@FunctionalInterface
interface Lambda2 {
    int something3(int x, int a);
}