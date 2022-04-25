public class Main {
 public static void main(String[] args) {
     System.out.println("Here we start");
     System.out.println();

     Car audi = new Car();
     audi.setModel("Audi");
     audi.setBuildYear(2021);
     audi.setComsuption(6.5f);
     audi.setColor("green");
     audi.setCarSpeed(410.54);
     audi.setCarSeat(5);
     audi.printInConsole();

     Car bmw = new Car();
     bmw.setModel("BMW");
     bmw.setBuildYear(2015);
     bmw.setComsuption(7.5f);
     bmw.setColor("red");
     bmw.setCarSpeed(310.56);
     bmw.setCarSeat(5);
     bmw.printInConsole();

     Car lada = new Car("Lada", 1998, 10.3f, "blue", 300.33, 4);
     lada.printInConsole();
 }
}