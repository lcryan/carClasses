public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Volvo", "CX90", 2022, "black", 2.0);
        Car carTwo = new Car("Fiat", "500", 2019, "green", 1.4);
        Car carThree = new Car("Toyota", "Aygo", 2016, "blue", 1.2);

        System.out.println("Congratulations ! You have chosen a " + carOne.brandName + " " + carOne.type + " from " + carOne.manufacturingYear + "." + " It is " + carOne.color + " and its engine size " + carOne.engineSize + ".");
        System.out.println("Congratulations ! You have chosen a " + carTwo.brandName + " " + carTwo.type + " from " + carTwo.manufacturingYear + "." + " It is " + carTwo.color + " and its engine size " + carTwo.engineSize + ".");
        System.out.println("Congratulations ! You have chosen a " + carThree.brandName + " " + carThree.type + " from " + carThree.manufacturingYear + "." + " It is " + carThree.color + " and its engine size " + carThree.engineSize + ".");
    }
}
