/**
	We have now added variables to represet the preset and speed options.
	These variables are static final-- they're constants.
	The modifiers make sure that the variables exist once and only once (static).
	and can't be changed (final)
*/
class CruiseControl {
	
	static final int STOP_PRESET = 0;
	static final int PLANETARY_SPEED_PRESET = 1;
	static final int CRUISE_SPEED_PRESET = 2;
	
	static final double CRUISE_SPEED_KMH = 16944;
	static final double PLANETARY_SPEED_KMH = 7667;
	static final double STOP_SPEED_KMH = 0;
	
	private double targetSpeedKmh;
	
	void setPreset(int speedPreset) {
		if (speedPreset == CRUISE_SPEED_PRESET) {
			setTargetSpeedKmh(CRUISE_SPEED_KMH);
		} else if (speedPreset == PLANETARY_SPEED_PRESET) {
			setTargetSpeedKmh(PLANETARY_SPEED_KMH);
		} else if (speedPreset == STOP_PRESET) {
			setTargetSpeedKmh(STOP_SPEED_KMH);
		}
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
	}
}