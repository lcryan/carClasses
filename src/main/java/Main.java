public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Volvo", "CX90", 2022, "black", 2.0, "Klaus", 123675593);
        Car carTwo = new Car("Fiat", "500", 2019, "green", 1.4, "Five", 342768900);
        Car carThree = new Car("Toyota", "Aygo", 2016, "blue", 1.2, "Victor", 897309276);

        carOne.print();
        carTwo.print();
        carThree.print();

    }
}
