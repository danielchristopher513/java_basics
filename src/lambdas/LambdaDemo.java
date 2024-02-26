package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static int someMethod(String str){
        System.out.println("hi"+ str);
        return  28;
    }
    public static void main(String[] args) {
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        Sayable s1 = () -> {System.out.println("you're saying something");};
        s1.say();
        Predicate<Integer> pr = (tInt) -> (tInt>18);
        System.out.println(pr.test(19));
        Printable prt = (pmsg) -> {
            System.out.println(pmsg);
        };
        prt.print("my msg");
        Function<String,Integer> solution = (name) -> {
            System.out.println("how are you "+name);
            return  20;
        };
        int val =   solution.apply("daniel");
        System.out.println("the value is "+val);

        Function<String,Integer> sal =  LambdaDemo::someMethod;
        int val1 = sal.apply("chris");
        }

    }
