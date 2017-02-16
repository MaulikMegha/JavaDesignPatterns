package pattern.decorator;

public class MainAppClass {

  public static void main(String[] args) {
   
    Car sport = new SportCar(new BasicCar());
    sport.carData();

    System.out.println("*******************");

    Car luxury = new LuxuryCar(new SportCar(new BasicCar()));
    luxury.carData();
  }

}
/*

We use inheritance or composition to extend the behavior of an object but
this is done at compile time and its applicable to all the instances of the class.
We can’t add any new functionality of remove any existing behavior at runtime –
this is when Decorator pattern comes into picture.

                        |---------> Sport Car
Car ---> Basic Car -----|
                        |---------> Luxury Car


OutPut .....

Basi Car Data
Adding more data for Sport Car
*******************
Basi Car Data
Adding more data for Sport Car
Add more data for Luxury Car

*/