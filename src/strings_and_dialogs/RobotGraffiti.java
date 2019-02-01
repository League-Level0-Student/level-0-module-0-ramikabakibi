package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
Robot yourmom = new Robot();	
yourmom.penDown();
yourmom.setSpeed(300);
yourmom.move(200);
yourmom.setAngle(90);
for (int i = 0; i < 180; i++) {	
yourmom.move(1);
yourmom.turn(1);


}
yourmom.setAngle(135);
yourmom.move(125);
yourmom.hide();
}
}
