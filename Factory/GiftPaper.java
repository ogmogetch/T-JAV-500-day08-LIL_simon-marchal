package Factory;

public class GiftPaper {
    public String gift; // Public field for gift

    public void wrap(String gift) {
        this.gift = gift;
    }

    public String unwrap() {
        String unwrapped = this.gift;
        this.gift = null;
        return unwrapped;
    }
}
