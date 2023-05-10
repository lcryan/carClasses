public class Car {
    String brandName;
    String type;
    int manufacturingYear;
    String color;
    double engineSize;
    String nameOwner;
    long driverLicenceNumber;

    public Car(String brandName, String type, int manufacturingYear, String color, double engineSize, String nameOwner, long driverLicenceNumber) {
        this.brandName = brandName;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
        this.engineSize = engineSize;
        this.nameOwner = nameOwner;
        this.driverLicenceNumber = driverLicenceNumber;
    }
    public void print() {
        System.out.println("Congratulations! You have chosen a " + brandName + " " + type + " made in " + manufacturingYear + "." + "It is " + color + " and its engine size is " + engineSize + "." + " The previous owner was " + nameOwner + "." + " His driver's licence number is " + driverLicenceNumber + ".");
    }
}
