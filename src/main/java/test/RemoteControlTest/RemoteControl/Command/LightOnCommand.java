package test.RemoteControlTest.RemoteControl.Command;

import test.RemoteControlTest.RemoteControl.HomeSystem.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
