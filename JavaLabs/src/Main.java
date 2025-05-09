public class Main {
    public static void main(String[] args) {
        int i = 10;
//        i++; // i = i+1
//        ++i; // i = i+1
//        i--; // i = i-1
//        --i; // i = i-1

        int j = i++;
        System.out.println(i);
        System.out.println(j);
        // j=10, i = 11
        // Above will print 10, 11
        j = ++i;

        System.out.println(i);
        System.out.println(j);
        // Above will print 12, 12

        i = i + 10;
        i += 10; // Same as above

        i = i - 10;
        i -= 10;
        // Iteration means round
        // Only in the first round, first part gets executed
        // Then it checks the condition and then goes inside for block
        // Before starting second round onwards, it executes third part and then checks the second condition
        // Rounds will continue until condition breaks (condition is false)
        for(int x = 1; x <= 10; x+=2) {
            System.out.println(x);
        }

        for(int x = 0; x <= 100; x+=10) {
            System.out.println(x);
        }

        // Do above using while loop
        int x = 0; // First part before the loop
        // Second part, is in the loop condition
        // third part is inside the loop
        while(x<=100) {
            System.out.println(x);
            x+=10;
        }

        // do-while
        int y = 10;
        do {
            System.out.println(y);
            y+=10;
        } while(y<=100);
    }
}

// Create a new class called PlayMath
// Write code similar to above using --