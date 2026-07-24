package Generics;

//what is generics in java:-In java generics is a feature that allows you to define classes, interfaces, and methods with type parameters. 
// It enables you to create reusable code that can work with different data types while providing type safety at compile time. 
// Generics help eliminate the need for casting and allow for stronger type checks, making your code more robust and easier to maintain.

class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generic {
    
    public static void main(String[] args) {
        
        // Create a generic class instance for Integer type
        GenericClass<Integer> integerInstance = new GenericClass<>(10);
        System.out.println("Integer Value: " + integerInstance.getValue());

        // Create a generic class instance for String type
        GenericClass<String> stringInstance = new GenericClass<>("Hello Generics");
        System.out.println("String Value: " + stringInstance.getValue());
    }
    
}
