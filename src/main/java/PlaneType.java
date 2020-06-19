public enum PlaneType {
    CESSNA(3, 400),
    CONAIR(20,1600),
    PIPER(5,600);


    private final int capacity;
    private final int weightLimit;

    PlaneType(int capacity, int weightLimit) {
        this.capacity = capacity;
        this.weightLimit = weightLimit;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeightLimit() {
        return weightLimit;
    }
}
