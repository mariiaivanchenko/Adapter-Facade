package ua.edu.ucu.task3;


public class Main {
    public static void main(String[] args) {
        BrandReader reader = new BrandReader("XrsxWuMlGpflXQxmtOsu+nbvNKIESoX2AfsWmKiee6o=");
        try {
            Facade facade = new Facade(reader, "porsche.ua");
            Brand brand = facade.extractFacade();
            System.out.print("Brand name: " + brand.getName() + "\n");
            System.out.print("Brand description: " + brand.getDescription() + "\n");
            System.out.print("Brand logo: " + brand.getLogo() + "\n");
        }catch (Exception e) {
            System.out.println("Error occured: " + e.toString());
        }        
    }
}
