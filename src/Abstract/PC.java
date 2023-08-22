package Abstract;

import Exceptions.LackOfEnergy;

public class PC {
    private Motherboard motherboard;
    private PowerUnit powerUnit;

    public PC(Motherboard motherboard, PowerUnit powerUnit) throws LackOfEnergy {
        if(motherboard.getEnergy() + powerUnit.getEnergy() > 0){
            throw new LackOfEnergy("Не хватка энергии");
        }
        this.motherboard = motherboard;
        this.powerUnit = powerUnit;
    }
}
