import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
	public static void main(String[] args) {
		Robot ralph=new Robot("batman");
		ralph.turn(180);
		ralph.penDown();
		ralph.move(100);
		for (int i = 0; i < 180; i++) {
			ralph.turn(1);
			ralph.move(1);
		}
		ralph.move(100);
		
	}
}
