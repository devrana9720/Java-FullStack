//What is Exception in Java?
// An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
// It is an object which is thrown at runtime. When an exception occurs, the normal flow of the program is interrupted and the program terminates abnormally.
public class ExceptionDemo {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int nums[]=new int[4];

        try{
            j=18/i;
            System.out.println("nums[10] = " + nums[10]);

        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: ");
        }
        

// We can have multiple catch blocks to handle different types of exceptions.
//
// If we write `catch (Exception e)`, it catches Exception and all of its subclasses
// (such as ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.).
//
// If no exception occurs (for example, i != 0), the catch block is skipped completely.
//
// If we write `catch (ArithmeticException e)`, it will catch only ArithmeticException
// (or its subclasses). If some other exception occurs, it will not be caught by this
// catch block.
//
// System.out.println("j = " + j); executes after the try-catch block regardless,
// unless an uncaught exception terminates the program.

    System.out.println("j = " + j);

    //if you want throw our output if Exception come.

    try{
        j=18/i;
        if(j==0){
            throw new ArithmeticException("j is zero");
        }
    }catch(ArithmeticException e){
            System.out.println("ArithmeticException caught: " + e);
    }
        
    }
}
