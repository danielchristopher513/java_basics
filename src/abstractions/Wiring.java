package abstractions;

public class Wiring {
    public static void main(String[] args) {
        ISwitchBoardListener  isbl = new GEAppliances();
        //HavellsAppliances();
        isbl.switchOne();
        isbl.switchTwo();
        isbl.switchThree();
    }
}
