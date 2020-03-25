// Method Overload Lec - Practice (External Methods)

public class MethodDem02Overloading {

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }

    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }

    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }

    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + " " + name + "!");
    }

    // CODE ALONG SECTION
    // TODO: create a main function

    // TODO: Call version 1 so that it prints "Hello World!" three times.

    // TODO: Call version 2.

    // TODO: Call version 3 so that is says "Hello" on one line and "Goodbye!" on the second line.

    // TODO: Call version 4 so that is says, "Salutations my friend!"

    public static void main(String[] args){
        System.out.println("Version 1");
        sayHello(3);

        System.out.println("Version 2");
        sayHello();

        System.out.println("Version 3");
        sayHello("\nGoodbye!");

        System.out.println("Version 4");
        sayHello("Salutations my", "friend!");
    }
}
