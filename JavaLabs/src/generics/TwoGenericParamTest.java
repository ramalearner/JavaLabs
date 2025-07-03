package generics;


import java.util.ArrayList;

class Test2<T, U, V extends String>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U
    V obj3;

    // constructor
    Test2(T obj1, U obj2 , V obj3)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }


    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Driver class to test above
class TwoGenericParamTest
{
    public static void main (String[] args)
    {
        Test2 <String, Integer, String> obj =
                new Test2<String, Integer, String>("GfG", 15, "10");

        obj.print();

        // Calling generic method with Integer argument
        genericMethod(11);

        // Calling generic method with String argument
        genericMethod("GeeksForGeeks");

        // Calling generic method with double argument
        genericMethod(1.0);

//        Test<int> obj = new Test<int>(20);

        ArrayList<int[]> a = new ArrayList<>();

    }

    static <T> void genericMethod(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
}