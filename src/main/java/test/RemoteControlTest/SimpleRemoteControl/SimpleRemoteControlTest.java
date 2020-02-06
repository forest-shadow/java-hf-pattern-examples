package test.RemoteControlTest.SimpleRemoteControl;

import test.RemoteControlTest.SimpleRemoteControl.HomeSystem.GarageDoor;
import test.RemoteControlTest.SimpleRemoteControl.HomeSystem.Light;
import test.RemoteControlTest.SimpleRemoteControl.Command.GarageDoorOpenCommand;
import test.RemoteControlTest.SimpleRemoteControl.Command.LightOnCommand;

public class SimpleRemoteControlTest {
  public static void main(String[] args) {
    Light light = new Light();
    GarageDoor garageDoor = new GarageDoor();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

    simpleRemoteControl.setCommand(lightOnCommand);
    simpleRemoteControl.buttonWasPressed();
    simpleRemoteControl.setCommand(garageDoorOpenCommand);
    simpleRemoteControl.buttonWasPressed();
  }
}