public class Car {
    int maxSpeed =100;
    int minSpeed =0;
    double weight =4079.00;
    boolean isTheCarOn=true;
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
        //Lets use getters for two print statements here for now
        System.out.println("Max Speed: " +getMaxSpeed());
        System.out.println("Min Speed: " +getMinSpeed());
        System.out.println("Weight of the car: "+ weight);
        System.out.println("State of the car: "+ isTheCarOn);
        System.out.println("Condition Level: "+condition);
        System.out.println("Number of passenger: "+numberOfPeopleInCar);
    }

    public void wreckCar(){
        condition='C';
    }

    public void getIn(){
        if(numberOfPeopleInCar<6 && numberOfPeopleInCar>0){
            numberOfPeopleInCar++;}
        else{
            System.out.println("The car is at full capacity of passsenger");}
    }

    public void stepOut(){
        if(numberOfPeopleInCar>0){
            numberOfPeopleInCar--;
        }
    }

    public double milesLeft(){
        double milesLeft=currentFuel*mpg;
        return milesLeft;
    }

    public double maxMilesPerFillUp(){
        return maxFuel*mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn){isTheCarOn=true;}
        else{
            System.out.println("The car's already on");}
    }

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed()+10);
        //using getters & setters to change Max speed with this new method
    }

    //Few getters & one setter:
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public int getMinSpeed(){
        return this.minSpeed;
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
        //System.out.println("Miles left with current fuel amount: "+sportsCar.milesLeft());
        //System.out.println("Miles after fill up: " +sportsCar.maxMilesPerFillUp());
        //sportsCar.printAllVariables();
        Car maxCar= new Car(); //Make this a normal car with default no args constructors
        maxCar.getIn();
        maxCar.getIn();
        //maxCar.turnTheCarOn();
        maxCar.printAllVariables();
    }
}
