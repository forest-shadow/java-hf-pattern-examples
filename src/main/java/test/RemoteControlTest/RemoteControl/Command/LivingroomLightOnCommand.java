package test.RemoteControlTest.RemoteControl.Command;

import test.RemoteControlTest.RemoteControl.HomeSystem.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
