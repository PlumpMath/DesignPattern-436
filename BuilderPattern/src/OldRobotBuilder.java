/**
 * Created by wenbinli on 3/20/17.
 */
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;
    public OldRobotBuilder() {
        this.robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tin Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
