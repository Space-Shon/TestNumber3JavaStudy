package Abstract;

public class Processor extends ComputerComponent {
    public Processor (int energy) {
        super(energy);
    }
    private Socket socket;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
