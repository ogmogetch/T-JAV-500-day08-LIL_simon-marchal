package Factory;

public class GiftPaper {
    private Toy toy;

    public void wrap(Toy toy) {
        this.toy = toy;
    }

    public Toy unwrap() {
        Toy wrappedToy = this.toy;
        this.toy = null;
        return wrappedToy;
    }
}
