class adder{
    int num1;
    int num2;
    int num3;
    int add(int num1 ,int num2){
        return  num1+num2;
    }
    int add(int num1,int num2,int num3){
        return  num1+num2+num3;
    }
}
class  test{
    public static void main(String[] args) {
        adder ad=new adder();
        System.out.println(ad.add(1,3));
        System.out.println(ad.add(1,2,3));
    }
}
