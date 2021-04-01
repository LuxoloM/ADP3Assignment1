package za.ac.cput;

public class Car {

    private String carName;
    private int carModel;


    public Car(String carName, int carModel) {

        this.carName = carName;
        this.carModel = carModel;
    }

    public String geCarName() {
        return carName;
    }

    public int getCarModel() {
        return carModel;
    }
}
