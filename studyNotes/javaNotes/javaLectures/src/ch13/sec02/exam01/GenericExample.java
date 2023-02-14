package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        //meaning a class can be a parameter too

        product1.setKind(new Tv());
        product1.setModel("smart TV");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        System.out.println("tvModel = "+tvModel);

        Product<Car, String> product2 = new Product<>();
        //meaning a class can be a parameter too

        product2.setKind(new Car());
        product2.setModel("smart Car");

        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println("carModel = "+carModel);


    }
}
