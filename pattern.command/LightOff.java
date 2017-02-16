package pattern.command;

public class LightOff implements Command {
  Light light;

  public LightOff(Light light){
    this.light = light;
  }

  @Override
  public void callSwitch() {
   this.light.setLightOff();
   System.out.println("Switch Off~~");
  }

}
