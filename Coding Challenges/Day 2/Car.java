public class Car {
    int maxSpeed =100;
    int minSpeed =0;
    double weight =4079.00;
    boolean isTheCarOn=false;
    char condition ='A';

    double maxFuel=16;      //say gallons
    double currentFuel=8;   //say gallons
    double mpg=26.4;           //say miles per gallong average

    int numberOfPeopleInCar=1;

    public Car(){
        //I will just retype the default java constructor so I can use both constructors based on scenarios
    }


    //f(x)=x+1;
    //Say, x=5;
    //f(5)=5+1=6; (Mathematical expression between parameters and expression)

    //Lets make a simple constructor to initialize minSpeed and maxSpeed of Car when we create a new instance of the car
    public Car(int minSpeed, int maxSpeed){
        this.minSpeed=minSpeed;
        this.maxSpeed=maxSpeed;
    }


    public void printAllVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar(){
        condition='C';
    }

    public void getIn(){
        numberOfPeopleInCar++;
    }

    public void stepOut(){
        numberOfPeopleInCar--;
    }

    public double milesLeft(){
        double milesLeft=currentFuel*mpg;
        return milesLeft;
    }

    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }

    public static void main(String[] args) {
        Car familyCar= new Car();
        //familyCar.printAllVariables();
        Car aliceCar =familyCar;
        familyCar.wreckCar();
        //aliceCar.printAllVariables();
        Car sportsCar= new Car(0,1000);
        sportsCar.getIn();
        sportsCar.stepOut();
        System.out.println("Miles left with current fuel amount: "+sportsCar.milesLeft());
        System.out.println("Miles after fill up: " +sportsCar.maxMilesPerFillUp());
        //sportsCar.printAllVariables();
    }
}
