import Abstract.Motherboard;
import Abstract.PC;
import Abstract.PowerUnit;
import Exceptions.LackOfEnergy;

public class MyPC extends PC {
    public MyPC(Motherboard motherboard, PowerUnit powerUnit) throws LackOfEnergy {
        super(motherboard, powerUnit);
        System.out.println("Компьютер собран");
    }
}
