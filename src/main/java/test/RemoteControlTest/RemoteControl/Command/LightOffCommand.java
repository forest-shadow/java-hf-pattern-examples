package test.RemoteControlTest.RemoteControl.Command;

import test.RemoteControlTest.RemoteControl.HomeSystem.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
