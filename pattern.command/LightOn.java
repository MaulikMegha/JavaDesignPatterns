package pattern.command;

public class LightOn implements Command{
  Light light;

  public LightOn(Light light){
    this.light = light;
  }

  @Override
  public void callSwitch() {
    this.light.setLightOn();
    System.out.println("Switch On**");
  }

}
