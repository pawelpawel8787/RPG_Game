package Hero;

import Monster.Monsters;
import Place.Places;
import Weapon.Sword;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 2017-11-28.
 */
public class Warrior extends Hero {

    public Warrior() {
        Sword sword = new Sword();
        setWeapon(sword);
        setExperience(0);
        setHitPoints(1000);
        setLevel(1);
    }


    public void travel(Places destination) {

    }


    public void levelUp() {
        int heroExperience = getExperience();
        int heroLevel = getLevel();
        int heroHitPoints = getHitPoints();
        int hitPointsPerLevel = 300;
        int maxLevel = 100;

        List<Integer> intervalsOfExperience = new ArrayList<Integer>(maxLevel);
        for (int i = 1; i < maxLevel; i++) {
            intervalsOfExperience.add(i * 100);
        }

        for (int result : intervalsOfExperience
                ) {
            if (heroExperience >= result) {
                heroLevel++;
                heroHitPoints += hitPointsPerLevel;
                setLevel(heroLevel);
                setHitPoints(heroHitPoints);
                System.out.println("Zdobyłeś " + heroLevel + " level! Masz +" + hitPointsPerLevel + " do życia.");
            }
        }
    }

    public void attack(Monsters monster) {

    }
}
