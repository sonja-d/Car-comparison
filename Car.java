public class Car {
  private String model;
  private int buildYear;
  private float comsuption;
  private String color;
  private double carSpeed;
  private int CarSeat;

  public void setModel(String modelValue){
    this.model = modelValue;
  }
  public String getModel(){
    return this.model;
  }

  public void setBuildYear(int year) {
    this.buildYear = year;
  }
  public int getBuildYear(){
    return this.buildYear;
  }

  public void setModel(Float fuel) {
    this.comsuption = fuel;
  }
  public Float getComsuption () {
    return this.comsuption;
  }

  public void setColor(String carColor) {
    this.color = carColor;
  }
  public String getColor() {
    return this.color;
  }

  public void setCarSpeed( Double speed) {
    this.carSpeed = speed;
  }
  public Double getCarSpeed() {
    return this.carSpeed;
  }

  public void setCarSeat( int seats){
    this.CarSeat = seats;
  }
  public int getCarSeat() {
    return this.CarSeat;
  }


  public void printInConsole() {
    System.out.println("Model: " + this.getModel());
    System.out.println("Build year: " + this.buildYear);
    System.out.println("Comsuption amount: " + this.comsuption + " per 100km");
    System.out.println("Car color: " + this.color);
    System.out.println("Car speed: " + this.carSpeed);
    System.out.println("Car seats: "+ this.CarSeat);
    System.out.println();
  }
}