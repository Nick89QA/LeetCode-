package OopAbstraction;

public class Main {
    public static void main(String[] args) {

        printCarInfo(new BMW(), "BMW");
        printCarInfo(new Volvo(), "VOLVO");

    /*    Cars volvo = new Volvo();
        System.out.println(" The color of Volvo car is " + volvo.color());
        volvo.condition();
        System.out.println(" The weight of Volvo car is " + volvo.kg());
        System.out.println(" Engine size of Volvo car is " + volvo.engineSize());

        Cars bmw = new BMW();
        System.out.println(" BMW color is " + bmw.color());
        bmw.condition();
        System.out.println(" Weight of BMW car is " + bmw.kg());
        System.out.println(" Engine size " + bmw.engineSize());*/
    }

    static void printCarInfo(Cars car, String brand) {
        System.out.println(brand + " color is " + car.color());
        car.condition();
        System.out.println(" weight of " + brand + " car is " + car.kg());
        System.out.println(" Engine size of " + brand + " car is " + car.engineSize());
    }


}

