package car;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 1234;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 46;
    double currentFuel = 23;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumOfPeopleInTheCar = 3;

    public Car(int maxSpeed, double weight, boolean isTheCarOn) {
        this.maxSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
    }


    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumOfPeopleInTheCar) {
            numberOfPeopleInCar++;
            System.out.println("someone got in");
        } else System.out.println("too many people");
    }

    public void getOut() {
        if (numberOfPeopleInCar != 0) {
            numberOfPeopleInCar--;
            System.out.println(numberOfPeopleInCar + "- num of people");
        } else System.out.println(numberOfPeopleInCar + "- empty");
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        if (isTheCarOn == false) {
            isTheCarOn = true;
        }

    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(100, 2000, true);
        System.out.println("birthdayPresent");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        birthdayPresent.printVariables();

        Car tommyCar = new Car(12, 2, false);
        tommyCar.upgradeMaxSpeed();
        tommyCar.getMaxSpeed();


    }

}
