public class Plane {

    private String name;
    private PlaneType planeType;

    public Plane(String name, PlaneType planeType){
        this.name = name;
        this.planeType = planeType;
    }

    public String getName() {
        return name;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getNumberOfSeats() {
        return planeType.getCapacity();
    }

    public int getWeightLimit() {
        return planeType.getWeightLimit();
    }
}
