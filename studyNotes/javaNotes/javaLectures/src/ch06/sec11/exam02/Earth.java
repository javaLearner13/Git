package ch06.sec11.exam02;

public class Earth {
    //기호상수 = constant
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * Math.pow(EARTH_RADIUS, 2);
    }

//    double hi = EARTH_RADIUS/2;


}
