public class Car {
    String carBrand;
    String carType;
    int weight;
    String driverClass;

    public Car(String carBrand, String carType, int weight, String driverClass) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.weight = weight;
        this.driverClass = driverClass;
    }
    class  Lorry extends Car  {
        public Lorry(String carBrand, String carType, int weight, String driverClass) {
            super(carBrand, carType, weight, driverClass);
            int loadCapacity;
        }
    }
    class SportCar extends Car {
        private final int maxVelocity;
        public SportCar(String carBrand, String carType, int weight, String driverClass) {
            super(carBrand, carType, weight, driverClass);
            int maxVelocity = 0;
            this.maxVelocity = maxVelocity;
        }
    }

    public  static void metodToString(int power, String manufacturer, String PiB, int drivingExperience,
                                      String carBrand, String carType, int weight, String driverClass){
        Engine answerEngine = new Engine(power, manufacturer);
        Driver answerDriver = new Driver(PiB, drivingExperience);
        Car answerCar = new Car (carBrand, carType, weight, driverClass);
        System.out.println(answerEngine.power + " " + answerEngine.manufacturer );
        System.out.println(answerDriver.PiB + " " + answerDriver.drivingExpirience);
        System.out.println(answerCar.carBrand + " " + answerCar.carType + " " + answerCar.weight
                + " " + answerCar.driverClass);
    }

    public  static void start(){
        System.out.println("Поїхали");
    }
    public  static void stop(){
        System.out.println("Зупиняємося");
    }
    public  static void turnRight(){
        System.out.println("Поворот праворуч");
    }
    public  static void turnLeft(){
        System.out.println("Поворот ліворуч");
    }

}




