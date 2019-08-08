public class Planet {

    private double mass;
    private double radius;
    private String name;
    private double distFromSun;


    public Planet(double mass, double radius, String name, double distFromSun) throws PlutoNotAPlanetException {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
        this.distFromSun = distFromSun;
        if (name.equals("pluto")) {
            throw new PlutoNotAPlanetException("Sorry Pluto...");
        }
    }

    public double getVolume() {
        double volume = 4/3 * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public double getDensity() {
        double density = mass / getVolume();
        return density;
    }

    public double getDistFromSun() {
        return distFromSun;
    }

    public double distToPlanet(Planet otherPlanet) {
        return Math.abs(distFromSun - otherPlanet.distFromSun);
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.printf("This is the planet %s. It is %.2f AU from the Sun. It has a density of %.2f kg/m^3.", getName(), getDistFromSun(), getDensity());
    }

}
