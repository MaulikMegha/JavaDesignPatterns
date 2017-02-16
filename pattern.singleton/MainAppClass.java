package pattern.singleton;

public class MainAppClass {

  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstant();
    System.out.println("I+J = "+singleton.getsum(10, 20)); // return : 30

    System.out.println("-------------------------------");

    SingletonUtility singletonUtility = SingletonUtility.getInstance(10,10); //return : 20
    System.out.println(singletonUtility.getSum());

    singletonUtility = SingletonUtility.getInstance(10,20); //return : 20
    System.out.println(singletonUtility.getSum());

  }

}
