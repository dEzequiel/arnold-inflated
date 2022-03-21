package edu.poniperro.domain;

/**
 * An enum (also known as enumeration and enumerated data type)
 * lets you create an ordered list of constants as a type.
 */
public enum Planeta {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    EARTH (5.976e+24, 6.37814e6),
    MARS (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27, 7.1492e7),
    SATURN (5.688e+26, 6.0268e7),
    URANUS (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private double radio = 0f;
    private double masa = 0f;

    /**
     * Constructor parameters should be equal to the ones passed
     * into the enum constants.
     *
     * @param masa
     * @param radio
     */
    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return this.masa;
    }

    public double getRadio() {
        return this.radio;
    }
}
