package OopAbstraction;

public abstract class Cars {
    abstract double engineSize();

    abstract void condition();

    abstract int kg();

    abstract String color();

}

class Volvo extends Cars {

    @Override
    double engineSize() {
        return 3.2;
    }

    @Override
    void condition() {
        System.out.println(" Car is new ");
    }


    @Override
    int kg() {
        return 1650;
    }

    @Override
    String color() {
        return "Red";
    }
}

class BMW extends Cars {

    @Override
    double engineSize() {
        return 4.4;
    }

    @Override
    void condition() {
        System.out.println(" Like new ");
    }

    @Override
    int kg() {
        return 1900;
    }

    @Override
    String color() {
        return "Blue";
    }
}
