package Abstract;

import Exceptions.IncapabilityComponents;

import java.util.List;

public class Motherboard extends ComputerComponent{
    private Processor processor;
    private Socket socket;
    private List<RAM> ram;
    private GPU gpu;
    private SystemCooling systemCooling;
    private typeRam typeRam;
    private ROM rom;

    public Motherboard(Processor processor, List<RAM> ram, GPU gpu, SystemCooling systemCooling, ROM rom) throws IncapabilityComponents {
        super(processor.getEnergy() + gpu.getEnergy());
        CheckCompatibility(ram, processor);
        this.processor = processor;
        this.ram = ram;
        this.gpu = gpu;
        this.systemCooling = systemCooling;
        this.rom = rom;
    }
    private boolean CheckCompatibility(List<RAM> ram, Processor processor) throws IncapabilityComponents {
        if(this.socket != processor.getSocket()){
            throw new IncapabilityComponents("Процессор не подходит");
        }
        ram = ram.stream().filter(s->s.getType() != this.typeRam).toList();
        if(ram.size() != 0){
            throw new IncapabilityComponents("Оперативная память не подходит");
        }
        return true;
    }
}
