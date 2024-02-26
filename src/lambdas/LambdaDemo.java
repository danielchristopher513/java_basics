package lambdas;

public class LambdaDemo {
    public static void main(String[] args) {
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        Sayable s1 = () -> {System.out.println("you're saying something");};
        s1.say();
    }
}
