public class Shark extends Fish {

    public void feed() {
        System.out.println("Where\'s the fish?");
    }

    public void feed(Fish fish) {
        fish.die();
        System.out.println("Eating fish");
    }
}
