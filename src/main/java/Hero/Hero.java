package Hero;

import Monster.Monsters;
import Place.Places;
import Weapon.Weapons;


public abstract class Hero {

    private int hitPoints;
    private Weapons weapon;
    private int experience;
    private int level;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void travel(Places destination);

    public abstract void levelUp();

    public abstract void attack(Monsters monster);


}
