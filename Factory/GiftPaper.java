package Factory;

public class GiftPaper {
    private Toy gift;

    public void wrap(Toy toy) {
        this.gift = toy;
    }

    public Toy unwrap() {
        Toy unwrapped = this.gift;
        this.gift = null;
        return unwrapped;
    }

    public String getTitle() {
        if (gift == null) {
            return "null";
        } else {
            return gift.getTitle().toLowerCase(); // Lowercase the title for consistency
        }
    }
}
