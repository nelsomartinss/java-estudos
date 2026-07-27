package Lessons.MemoryBehavior;

public class BoxingUnboxingWrapperClasses {
    void main(){

        int x = 20;
        System.out.print(x);

        Object obj = x; // Boxing
        System.out.print(obj);

        int y = (int) obj;
        System.out.print(y); // Unboxing

        // Wrapper class
        int secondX = 20;
        System.out.print(secondX);

        Integer obj2 = secondX;
        System.out.print(obj2);

        Integer secondY = obj2 * 2;
        System.out.print(secondY);
        // Wrapper classes are designed to treat primitive types as classes transparently to the compiler.
    }
}
