/**
	This solution is error prone and easy to misuse:
	It has magic numbers.
	you need an in depth of the internals of the setPreset method in order to use it correctly,
	otherwise you cannot select a proper speed.
*/
public class CruiseControl {
	
	private double targetSpeedKmh;
	
	void setPreset(int speedPreset) {
		if (speedPreset == 2) {
			setTargetSpeedKmh(16944);
		} else if (speedPreset == 1) {
			setTargetSpeedKmh(7667);
		} else if (speedPreset == 0) {
			setTargetSpeedKmh(0);
		}
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
	}
}