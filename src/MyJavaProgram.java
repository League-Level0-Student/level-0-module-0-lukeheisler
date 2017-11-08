import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot ralph=new Robot("batman");
		for (int i = 0; i < 666; i++) {
			ralph.setRandomPenColor();
			ralph.setSpeed(50);
			ralph.penDown();
			ralph.turn(90);
			ralph.move(69);
			ralph.penUp();
			ralph.move(69);
		}
		
	}
}
