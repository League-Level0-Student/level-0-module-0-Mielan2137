import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
public static void main(String[] args) {
	Robot lion=new Robot();
	lion.penDown();
	lion.setSpeed(100);
	for (int i = 0; i < 50; i++) {
		lion.move(100);
		lion.turn(360/50);
	}
}
}