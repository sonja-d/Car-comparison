import java.io.ObjectOutputStream.PutField;

public class Main {
 public static void main(String[] args) {
     System.out.println("Here we start");
     System.out.println();

     Car audi = new Car( true,"Audi", 2022, 8f, 350, 40);
     audi.printInConsole();
     System.out.println("Calculation travel distance and fuel consumtions for audi");
     audi.travelDistance(1650);
     System.out.println();
     
     Car lada = new Car(false,"Lada", 1998, 10.5f, 400, 25);
     lada.printInConsole();
     System.out.println("Calculation travel distance and fuel consumtions for lada");
     lada.travelDistance(2500);
     System.out.println();
     
     Car bmw = new Car(true, "BMW", 2019, 9f, 300, 40);
     bmw.printInConsole();
     System.out.println("Calculation travel distance and fuel consumtions for bmw");
     bmw.travelDistance(537);
     System.out.println();
     
     Car peugeot = new Car(true, "Peugeot 308", 2018, 5f, 240, 30);
     peugeot.printInConsole();
     System.out.println("Calculation travel distance and fuel consumtions for peugeot");
     peugeot.travelDistance(763);
     System.out.println();

    }
}