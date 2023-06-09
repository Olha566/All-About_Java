public class Recursion {
    public static void main(String[] args) {
        sayHello(3);
    }
    public static void sayHello(int counter) {
        if (counter > 0) {
            System.out.println("Hello");
            sayHello(-4);
        } else System.out.println(counter);


    }
}






