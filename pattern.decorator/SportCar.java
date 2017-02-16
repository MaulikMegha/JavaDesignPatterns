package pattern.decorator;

public class SportCar extends CarDecorator{

  public SportCar(Car car) {
    super(car);   
  }

  public void carData(){
    super.carData();
    System.out.println("Adding more data for Sport Car");
  }

}
