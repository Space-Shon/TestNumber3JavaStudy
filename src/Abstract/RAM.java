package Abstract;

public class RAM extends ComputerComponent{
    private typeRam type;

    public RAM(int energy) {
        super(energy);
    }

    public typeRam getType() {
        return type;
    }

    public void setType(typeRam type) {
        this.type = type;
    }
}
