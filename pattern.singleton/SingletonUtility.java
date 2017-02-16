package pattern.singleton;

public class SingletonUtility {
  private static SingletonUtility singleton = null;
  private static int i;
  private static int j;
  private SingletonUtility(int x, int y){
      i = x;
      j = y;
  }
  public static SingletonUtility getInstance(int x, int y){
    if(singleton == null){
      singleton = new SingletonUtility(x,y);
      return singleton;
    }else{
      return singleton;
    }
  }

   //utility method
  //global use in project
  public static int getSum(){
    return i + j;  //Cannot use this in a static context
  }
}
