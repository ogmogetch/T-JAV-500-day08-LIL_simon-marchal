package Factory;

public class Elf {
    private Toy currentToy;
    private int giftPapers;

    public boolean pickToy(Factory factory, String toyName) {
        if (currentToy != null) {
            return false; // Elf already has a toy
        }

        try {
            currentToy = factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true; // A new toy has been picked up
        } catch (NoSuchToyException e) {
            System.out.println("I didn't find any " + toyName + ".");
            return false; // No such toy exists
        }
    }

    public boolean pickPapers(Factory factory, int nb) {
        giftPapers += nb;
        return true;
    }

    public Toy pack() {
        if (currentToy != null) {
            if (giftPapers > 0) {
                giftPapers--;
                Toy packedToy = currentToy;
                currentToy = null;
                System.out.println("And another kid will be happy!");
                return packedToy;
            } else {
                System.out.println("Wait... I can't pack it with my shirt.");
            }
        } else {
            if (giftPapers > 0) {
                System.out.println("I don't have any toy, but I've some paper!");
            } else {
                System.out.println("I don't have any toy or paper!");
            }
        }
        return null;
    }
}
