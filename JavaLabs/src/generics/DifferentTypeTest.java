package generics;

import java.util.ArrayList;
import java.util.List;

class Test3<T> {
    // An object of type T is declared
    T obj;
    Test3(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

// Driver class to test above
class DifferentTypeTest {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test3<Integer> iObj = new Test3<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test3<String> sObj
                = new Test3<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

//        List list = new ArrayList();
//        list.add(10);
//        list.add("Lalitha");
//        list.add(2.5);

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        iObj = sObj; // This results an error
    }
}
