public class Main {
    public static void main(String[] args) {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 170, new Battery(16000));

        pr.increasePower();

        System.out.println("Name: " + pr.name);
        System.out.println("CPU Speed: " + pr.CPUSpeed);
        System.out.println("Power: " + pr.power);
        System.out.println("Battery Capacity: " + pr.robotBattery.Capacity);
    }        
}
