/**
 * Created by wenbinli on 3/20/17.
 */
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotLegs;
    private String robotArms;

    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    public String getRobotHead() {return this.robotHead;}

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    public String getRobotTorso() {return this.robotTorso;}

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    public String getRobotArms() {return this.robotArms;}

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    public String getRobotLegs() {return this.robotLegs;}
}
