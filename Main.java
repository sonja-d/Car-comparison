public class Main {
 public static void main(String[] args) {
     System.out.println("Here we start");

     Car audi = new Car();
     audi.setModel("Audi");
     audi.setBuildYear(2021);
     System.out.println(audi.getModel() + audi.getBuildYear());

     Car bmw = new Car();
     bmw.setModel("BMW");
     bmw.setBuildYear(2015);
     System.out.println(bmw.getModel() + bmw.getBuildYear());


 }
}