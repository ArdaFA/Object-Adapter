import Adaptee.ToyDuck;
import Target.Bird;

public class ToyDuckAdapter implements Bird {
  // adapter class
  // this class behaves like a Bird to adapt ToyDuck
  // adapter holds only the instance that it will be adapted
  private ToyDuck toyDuck;

  public ToyDuckAdapter(ToyDuck toyDuck){
    this.toyDuck=toyDuck;
  }
  // @override
  public void fly(){
    // toys cannot fly, so override the function
    System.out.println("Toys cannot fly!");
  }

  //@override
  public void makeSound(){
    toyDuck.squeak();
  }
}
