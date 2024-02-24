package exceptions;


import java.io.IOException;

class TestExceptionPropagation2{
    void m()throws IOException {
        int  c = 10 +  20;
        someOtherMethod();
        throw new java.io.IOException("device error");//checked exception
    }

    private void someOtherMethod() {
        int j = 20+ 30;
        for (int i=0; i<3;i++){
            int k = i  * j;
            System.out.println(i);
        }
    }

    void n()  throws IOException{

        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }

}
