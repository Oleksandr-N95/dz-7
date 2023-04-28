public enum SolarSystem {
    MERCURY(1, 0, 35, null),
    VENUS(2, 100, 40, MERCURY),
    EARTH(3, 180, 50, VENUS),
    MARS(4, 250, 70, EARTH),
    JUPITER(5, 300, 85, MARS),
    SATURN(6, 350, 90, JUPITER),
    URANUS(7, 400, 65, SATURN),
    NEPTUNE(8, 500, 80, URANUS);

    private int number, distanceOfPlanet, radius, distanceOfSun;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet = null;
    SolarSystem(int number, int distanceOfPlanet, int radius, SolarSystem previousPlanet) {
        this.number = number;
        this.distanceOfPlanet = distanceOfPlanet;
        this.distanceOfSun = previousPlanet.getDistanceOfSun() + previousPlanet.distanceOfSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
        if(previousPlanet != null) {
            this.previousPlanet.nextPlanet = this;
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
    public SolarSystem getPreviousPlanet(){
        return previousPlanet;
    }
    public SolarSystem getNextPlanet(){
        return nextPlanet;
    }
    public int getDistanceOfSun(){
        return distanceOfSun;
    }
}

