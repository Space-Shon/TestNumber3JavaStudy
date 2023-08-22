package PersonComputer;

import Abstract.*;
import Exceptions.IncapabilityComponents;

import java.util.List;

public class ASROCKA520MHVS extends Motherboard {
    typeRam typeRam = Abstract.typeRam.DDR4;
    Socket socket = Abstract.Socket.AM5;

    public ASROCKA520MHVS(Processor processor, List<RAM> ram, GPU gpu, SystemCooling systemCooling, ROM rom) throws IncapabilityComponents {
        super(processor, ram, gpu, systemCooling, rom);
    }
}
