import Adaptee.PlasticToyDuck;
import Adaptee.ToyDuck;
import Target.Bird;
import Target.Sparrow;

public class Client {
    public static void main(String[] args) {
        // Gerçek bir kuş nesnesi oluşturuyoruz
        Sparrow sparrow = new Sparrow();

        System.out.println("--- Serçe Testi ---");
        testBird(sparrow);

        System.out.println("\n--------------------------\n");

        // Adapte edilecek oyuncak ördek nesnesini oluşturuyoruz
        ToyDuck toyDuck = new PlasticToyDuck();

        // Oyuncak ördeği Bird arayüzüne adapte ediyoruz.
        // ToyDuckAdapter, bir Bird gibi davranır.
        Bird toyDuckAdapter = new ToyDuckAdapter(toyDuck);

        System.out.println("--- Oyuncak Ördek Adaptör Testi ---");
        testBird(toyDuckAdapter);
    }

    // Bu metot sadece Bird arayüzünü kabul eder.
    // Adaptee (ToyDuck) sınıfından haberi yoktur.
    public static void testBird(Bird bird) {
        bird.fly();
        bird.makeSound();
    }
}
