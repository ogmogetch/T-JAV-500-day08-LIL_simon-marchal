package Factory;

import java.util.List;

public class Elf {
    private Toy currentToy;
    private List<GiftPaper> giftPapers;

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
        List<GiftPaper> newPapers = factory.getPapers(nb);
        if (newPapers != null) {
            giftPapers.addAll(newPapers);
            return true;
        }
        return false;
    }

    public Toy pack() {
        if (currentToy != null) {
            if (!giftPapers.isEmpty()) {
                GiftPaper paper = giftPapers.get(0);
                paper.wrap(currentToy);
                giftPapers.remove(paper);
                currentToy = null;
                return paper.unwrap();
            } else {
                System.out.println("Wait... I can't pack it with my shirt.");
            }
        } else {
            if (!giftPapers.isEmpty()) {
                System.out.println("I don't have any toy, but hey at least it's paper!");
            } else {
                System.out.println("I don't have any toy or paper!");
            }
        }
        return null;
    }
}
