package Factory;

public class Gameboy extends Toy {
    public Gameboy() {
        setTitle("Gameboy");
    }

    @Override
    public void play() {
        // Implementation for playing with a Gameboy
        System.out.println("Playing with a Gameboy...");
    }
}
