package generics;

// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T> {

    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

// Driver class to test above
class Geeks {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
