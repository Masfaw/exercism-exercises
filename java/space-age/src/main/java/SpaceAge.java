class SpaceAge {
    double ageInSeconds;
    double earthYears;

    static double mercuryOrbit = 0.2408467;
    static double venusOrbit = 0.61519726;
    static double marsOrbit = 1.8808158;
    static double jupiterOrbit = 11.862615;
    static double saturnOrbit = 29.447498;
    static double uranusOrbit = 84.016846;
    static double neptuneOrbit = 164.79132;


    SpaceAge(double seconds) {
        ageInSeconds = seconds;
        earthYears = seconds / 365.25 / 60 / 60 / 24;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return earthYears / mercuryOrbit;
    }

    double onVenus() {
        return earthYears / venusOrbit;
    }

    double onMars() {
        return earthYears / marsOrbit;
    }

    double onJupiter() {
        return earthYears / jupiterOrbit;
    }

    double onSaturn() {
        return earthYears / saturnOrbit;
    }

    double onUranus() {
        return earthYears / uranusOrbit;
    }

    double onNeptune() {
        return earthYears / neptuneOrbit;
    }
}
