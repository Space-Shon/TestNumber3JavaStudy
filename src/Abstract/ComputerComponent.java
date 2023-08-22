package Abstract;

public class ComputerComponent {
    private int energy;
    public ComputerComponent(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
