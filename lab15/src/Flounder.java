public class Flounder extends Fish {
    boolean isCamouflaged;

    Flounder() {
        // Hidden call to super() here
        this.isCamouflaged = false;
    }

    public void setColor(String newColor) {
        super.setColor(newColor);
        isCamouflaged = true;
    }
}
