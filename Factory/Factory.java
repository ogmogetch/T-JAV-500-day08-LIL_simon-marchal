package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public Toy create(String toyType) throws NoSuchToyException {
        if (toyType.equalsIgnoreCase("teddy")) {
            return new TeddyBear();
        } else if (toyType.equalsIgnoreCase("gameboy")) {
            return new Gameboy();
        } else {
            throw new NoSuchToyException("No such toy: " + toyType);
        }
    }

    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> papers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }
}
