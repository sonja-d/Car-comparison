public class Car {
  private String model;
  private int buildYear;
  private float consuption;
  private double carSpeed;
  private boolean power;
  private int fuelCapacity;


  public Car (boolean power, String model, int buildYear, float comsuption, double carSpeed, int fuelCapacity) {
    this.setPower(power);
    this.setModel(model);
    this.setBuildYear(buildYear);
    this.setConsuption(comsuption);
    this.setCarSpeed(carSpeed);
    this.setFuelCapacity(fuelCapacity);
  }

  public void setModel(String modelValue) {
    this.model = modelValue;
  }
  
  public String getModel() {
    return this.model;
  }

  public void setBuildYear(int year) {
    this.buildYear = year;
  }
  public int getBuildYear(){
    return this.buildYear;
  }

  public void setConsuption(Float fuel) {
    this.consuption = fuel;
  }

  public Float getComsuption() {
    return this.consuption;
  }

  public void setCarSpeed(Double speed) {
    if (this.isOn()){
      this.carSpeed = speed;
    }
  }
  public Double getCarSpeed() {
    return this.carSpeed;
  }

  public void setPower(boolean power){
    this.power = power;
  }

  public boolean getPower(){
    return this.power;
  }

  public boolean isOn() {
    return this.power;
  }

  public Car buildYear(int buildYear) {
    setBuildYear(buildYear);
    return this;
  }

  public Car comsuption(float consuption) {
    setConsuption(consuption);
    return this;
  }

  public Car carSpeed(double carSpeed) {
    setCarSpeed(carSpeed);
    return this;
  }

  public Car power(boolean power) {
    setPower(power);
    return this;
  }

  public void setFuelCapacity(int fuelCapacity) {
    this.fuelCapacity = fuelCapacity;
  }
  public int getFuelCapacity(){
    return this.fuelCapacity;
  }

  public void travelDistance(float distance) {
    System.out.println("Travel distance: " + distance );
    double chargingTimes = distance/this.calculateMaxTravelDistance();
    System.out.println("For this distance you need how many tanks: " + chargingTimes);
    System.out.println("Number of full recharges (including starting one): " + (int) Math.ceil(chargingTimes));
    double fuelLeft = this.fuelCapacity - (chargingTimes - (int) chargingTimes) * this.fuelCapacity;
    System.out.println("Fuel left in the tank: " + String.format( "%.2f", fuelLeft) + "l");
  }

  private double calculateMaxTravelDistance() {
    return (this.fuelCapacity/this.consuption) * 100;
  }

  public void printInConsole() {
    System.out.println("Model: " + this.getModel());
    System.out.println("Build year: " + this.getBuildYear());
    System.out.println("Comsuption amount: " + this.getComsuption() + " per 100km");
    if(this.isOn()) {
      System.out.println("Car speed: " + this.getCarSpeed());
    } else {
      System.out.println("Car is off.");
    }
    System.out.println("Fuel capacity: " + this.getFuelCapacity());
    System.out.println();
  }
}