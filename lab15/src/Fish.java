public class Fish {

    private String color; //stores the color of the fish
    private String location; //stores the location of the fish
    private boolean isAlive; //stores whether the fish is alive or dead

    public Fish(String color, String location, boolean isAlive) {
        this.color = color;
        this.location = location;
        this.isAlive = isAlive;
    }

    public Fish() {
        this("Silver", "Ocean", true);
    }

    public void swim() {
        System.out.println("Swimming!");
    }

    public void feed() {
        System.out.println("Feeding!");
    }

    public void die() {
        isAlive = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
