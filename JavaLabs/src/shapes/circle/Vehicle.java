package shapes.circle;

public interface Vehicle {
    // 1. While a derived class extends from a base class, a class *implements* interface
    // 2. A class can implement 0/1/more interfaces
    // 3. A class can only extend 0/1 class
    // 4. A can extend B, B can extend C => Multi level inheritance
    // 5. A implements B,C => Multiple inheritance

    // 6. It can variables, methods
    // 7. Difference between declaration of a method vs definition of a method
    // 8. [] => Optional, <> => Mandatory, {} => body
    // 9. Signature of method => [access Specifier] [static] <returnType> <methodName>(0+ args)
    // 10. Declaration of method => Only specifies signature of the method but no body and ends with semi colon

    // 11. Definition of method => Both signature and body are specified and ends with }
    // 12. methods of interface unless specified are always public and non-static
    // 13. member variables of interface are always public static final


    String getEngineType();

    public static final String modelYear = "2025";

    // From Java 8, you can also provide default implementations
    default String runType() {
        return "On-Road";
    }
}
