package Factory;

public class TeddyBear extends Toy {
    public TeddyBear() {
        setTitle("Teddy Bear");
    }

    @Override
    public void play() {
        // Implementation for playing with a teddy bear
        System.out.println("Playing with a Teddy Bear...");
    }
}
