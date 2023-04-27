public enum System {
    MERCURY(1,0, "Mercury", 35, null, VENUS),
    VENUS(2, 100, "Venus", 40, MERCURY, EARTH),
    EARTH(3, 180, "Earth", 50, VENUS, MARS),
    MARS(4, 250, "Mars", 70, EARTH, JUPITER),
    JUPITER(5, 300, "Jupiter", 85, MARS, SATURN),
    SATURN(6, 350, "Saturn", 90, JUPITER, URANUS),
    URANUS(7, 400, "Uranus", 65, SATURN, NEPTUNE),
    NEPTUNE(8, 500, "Neptune", 80, URANUS, null);

    private final int number, distanceOfPlanet, radius;
    private final String distanceOfSun, previousPlanet, nextPlanet;

    System (int number, int distanceOfPlanet, String distanceOfSun, int radius, String previousPlanet, String nextPlanet){
        this.number = number;
        this.distanceOfPlanet = distanceOfPlanet;
        this.distanceOfSun = distanceOfSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getDistanceOfSun(){
        switch (distanceOfSun) {
            case "Mercury":
                return MERCURY.distanceOfPlanet + 300;
            case "Venus":
                return VENUS.distanceOfPlanet + 400;
            case "Earth":
                return EARTH.distanceOfPlanet + 450;
            case "Mars":
                return MARS.distanceOfPlanet + 550;
            case "Jupiter":
                return JUPITER.distanceOfPlanet + 650;
            case "Saturn":
                return SATURN.distanceOfPlanet + 700;
            case "Uranus":
                return URANUS.distanceOfPlanet + 800;
            case "Neptune":
                return NEPTUNE.distanceOfPlanet + 950;
            default:
                return -1;
        }
    }
    public int getNumber(){
        return number;
    }
    public int getDistanceOfPlanet(){
        return distanceOfPlanet;
    }
    public int getRadius(){
        return radius;
    }
    public String getPreviousPlanet(){
        return previousPlanet;
    }
    public String getNextPlanet(){
        return nextPlanet;
    }
}
