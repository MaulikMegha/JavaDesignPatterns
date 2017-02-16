package pattern.command;

public class MainAppClass {

  public static void main(String[] args) {
    Light light = new Light();
    RemoteControl remote = new RemoteControl();

    Command command = new LightOn(light);
    //switch on
    remote.setCommand(command);
    remote.pressButton();


    command = new LightOff(light);
    //switch off
    remote.setCommand(command);
    remote.pressButton();
  }

}
/*

two concrete commands. One will turn on the lights, another turns off lights: LightOn, LightOff
Light is our receiver class
Our invoker in this case is the remote control.

When Would I Use This Pattern?
The Command Pattern is useful when:
  A history of requests is needed
  You need callback functionality
  Requests need to be handled at variant times or in variant orders
  The invoker should be decoupled from the object handling the invocation.

Client --------- Create() ---------------> Command
                                              |<-------- execute() ---- Invoker
                                              |
              Receiver<----- action() --------|
                                              |

*/