public class PatrolRobot extends Robot{
    
    public Battery robotBattery;

    public PatrolRobot(String name, int cpuspeed, int power, Battery robotBattery){
        this.name = name;
        this.CPUSpeed = cpuspeed;
        this.power = power;
        this.robotBattery = robotBattery;
    }
    public void increasePower(){
        power += 20;
    }
}
