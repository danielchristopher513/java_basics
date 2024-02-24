package abstractions;

public class HavellsAppliances implements ISwitchBoardListener{
    @Override
    public void switchOne() {
        System.out.println("havells light  is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("havells fan  is on");

    }

    @Override
    public void switchThree() {
        System.out.println("havells AC  is on");


    }
}
