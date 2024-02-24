package interfaces;

public class TStudent {

    int rollno;
    String name;
    float fee;

    public TStudent(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    public void display(){
        System.out.println(rollno+name+fee);
    }
}
class Test1{
    public static void main(String[] args) {
        TStudent t1 = new TStudent(111,"abdul",123.0f);
        t1.display();

    }
}
