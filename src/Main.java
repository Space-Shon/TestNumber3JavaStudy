import Abstract.*;
import Exceptions.IncapabilityComponents;
import Exceptions.LackOfEnergy;
import PersonComputer.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Processor processor = new AMDRyzen4500(65);
        List<RAM> ramList = List.of(
                new KINGSTONFURYBEASTBLACK(5),
                new KINGSTONFURYBEASTBLACK(5)
        );
        PowerUnit powerUnit = new BEQUIETSYSTEMPOWER10(-850);
        GPU gpu = new MSIGEFORCERTX4070(200);
        ROM rom = new WDBLUE(10);
        SystemCooling systemCooling = new DEEPCOOLGAMMAARCHER(95);
        Motherboard motherboard;
        try {
            motherboard = new ASROCKA520MHVS(processor, ramList, gpu, systemCooling, rom);
        } catch (IncapabilityComponents e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        MyPC myPC;
        try {
            myPC = new MyPC(motherboard, powerUnit);
        } catch (LackOfEnergy e) {
            throw new RuntimeException(e);
        }
    }
}