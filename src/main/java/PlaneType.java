public enum PlaneType {
    CESSNA(100, 400),
    CONAIR(400,1600),
    PIPER(150,600);


    private final int capacity;
    private final int weightLimit;

    PlaneType(int capacity, int weightLimit) {
        this.capacity = capacity;
        this.weightLimit = weightLimit;
    }
}
