package test.RemoteControlTest.SimpleRemoteControl.Command;

import test.RemoteControlTest.SimpleRemoteControl.HomeSystem.GarageDoor;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.up();
  }
}