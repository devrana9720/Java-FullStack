import java.util.Objects;
//What is a sealed class in Java?
// A sealed class is a class that restricts which other classes or interfaces may extend or implement it.
//if we use the sealed keyword then it inherited with the help of permits keyword. The permits keyword is used to specify the classes that are allowed to extend or implement the sealed class.
//and which class inherits the sealed class must be declared as final or sealed or non-sealed.
// sealed class A{

// }
// final class B extends A{

// }
// final class C extends A{

// }
// public class Sealed {
//     public static void main(String[] args) {
//         System.out.println("Sealed class in Java");
//     }
// }

//what is record class in Java?
// A record class is a special kind of class in Java that is used to model immutable data
// It is a concise way to define classes that primarily hold data and provide automatic implementations of common methods such as equals(), hashCode(), and toString().

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Sealed {
    public static void main(String[] args) {
        System.out.println("Record class in Java");
    }
}

