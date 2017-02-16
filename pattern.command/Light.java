package pattern.command;

public class Light {
  private boolean bulb;
  public void setLightOn(){
    this.bulb = true;
  }
  public void setLightOff(){
    this.bulb = false;
  }
  public boolean getLightOnOff(){
    return this.bulb;
  }

}
