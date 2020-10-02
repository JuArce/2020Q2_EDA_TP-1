package model;

import java.util.Objects;

public class BusStop {
    private final Coord coord;
    private final Integer directionId;
    private final String busName;

    public BusStop(Double lng, Double lat, Integer directionId, String busName) {
        coord = new Coord(lat, lng);
        this.directionId = directionId;
        this.busName = busName;
    }

    public Coord getCoord() {
        return coord;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public String getBusName() {
        return busName;
    }

    @Override
    public String toString() {
        return busName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStop busStop = (BusStop) o;
        return coord.equals(busStop.coord) &&
                (directionId.equals(busStop.directionId))&&
                busName.equals(busStop.busName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord, directionId, busName);
    }
}
