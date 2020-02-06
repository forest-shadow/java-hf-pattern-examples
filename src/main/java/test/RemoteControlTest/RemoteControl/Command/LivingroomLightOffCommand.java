package test.RemoteControlTest.RemoteControl.Command;

import test.RemoteControlTest.RemoteControl.HomeSystem.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
