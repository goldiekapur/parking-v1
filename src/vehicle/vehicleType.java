package vehicle;

public enum vehicleType{
    Car , Bus , Bike;
    int numberOfObj = 0;

    public int getNumberOfObj() {
        return numberOfObj;
    }

    public void setNumberOfObj(int numberofObj) {
        this.numberOfObj = numberofObj;
    }
}