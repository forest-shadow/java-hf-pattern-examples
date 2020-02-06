package test.RemoteControlTest.SimpleRemoteControl.Command;

import test.RemoteControlTest.SimpleRemoteControl.HomeSystem.Light;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}