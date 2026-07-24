//What is Exception in Java?
// An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
// It is an object which is thrown at runtime. When an exception occurs, the normal flow of the program is interrupted and the program terminates abnormally.
// public class ExceptionDemo {
//     public static void main(String[] args) {
        // int i=0;
        // int j=0;
        // int nums[]=new int[4];

        // try{
        //     j=18/i;
        //     System.out.println("nums[10] = " + nums[10]);

        // }
        // catch(ArithmeticException e){
        //     System.out.println("ArithmeticException caught: " + e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("ArrayIndexOutOfBoundsException caught: ");
        // }
        

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

    // System.out.println("j = " + j);

    // //if you want throw our output if Exception come.

    // try{
    //     j=18/i;
    //     if(j==0){
    //         throw new ArithmeticException("j is zero");
    //     }
    // }catch(ArithmeticException e){
    //         System.out.println("ArithmeticException caught: " + e);
    // }


    //Throw keyword:-if we want to throw our own exception we can use throw keyword.
    // throw new RuntimeException("This is a runtime exception");
    // System.out.println("This line will not be executed because the exception is thrown above.");


    //Throws keyword:-if we want to throw our own exception we can use throws keyword.
    //Differnce between throw and throws keyword in Java:
    // 1. throw is used to explicitly throw an exception, while throws is used in the method signature to declare that a method can throw one or more exceptions.
    // 2. throw is followed by an instance of an exception, while throws is followed by one or more exception classes.
    // 3. throw is used within a method body, while throws is used in the method declaration.
    // 4. throw is used to throw a single exception, while throws can be used to declare multiple exceptions that a method can throw.


    // throw new Exception("This is a checked exception");
        
//     }
// }




//custom exception in java:-when we want to create our own exception we can create custom exception in java.
// Custom exception class should extend Exception class or its subclasses.
// Custom exception class should have a constructor that takes a string message as an argument and passes it to the superclass constructor.

// class TooyoungerException extends RuntimeException{
//     TooyoungerException(String message){
//         super(message);
//     }
// }
// public class ExceptionDemo {
//     public static void main(String[] args) {
//         int age=17;
//         if(age<18){
//             throw new TooyoungerException("Age is less than 18");
//         }
//         else{
//             System.out.println("Age is greater than or equal to 18");
//         }

//     }
// }
