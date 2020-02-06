package test.RemoteControlTest.RemoteControl.Command;

import test.RemoteControlTest.RemoteControl.HomeSystem.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
