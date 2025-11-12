package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1: health += health * 0.1; break;
            case 2: health += health * 0.3; break;
            case 3: health += health * 0.4; break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.2;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data =\n";
        info += "Health = " + health + "\n";
        info += "Level = " + level + "\n";
        return info;
    }
}

