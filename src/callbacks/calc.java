package callbacks;


public class calc {
    public int add(int a, int b){
        return a+b;
    }

    public void addKid(int a, int b, MobilePhone mobilePhone){
        try {
            Thread.sleep(5000);
            int c = a + b;
            mobilePhone.sumResult(c);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
