package cool.paul.nxt;

import lejos.nxt.Motor;

public class Kraftwerksnetz {
	public static void main(String[] args) {
		Motor.A.setSpeed(300);
		Motor.B.setSpeed(300);

		Motor.A.rotate(1750, true);
		Motor.B.rotate(1750);

		Motor.A.rotate(-1750, true);
		Motor.B.rotate(-1750);
	}
}
