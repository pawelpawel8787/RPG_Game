package Hero;

import Monster.Dragon;
import Monster.Jin;
import Monster.Monsters;
import Monster.Skeleton;
import Monster.TypeOfMonster;
import Place.Places;
import Weapon.Bow;
import Weapon.MagicWand;
import Weapon.Weapons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by HP on 2017-11-28.
 */
public class Wizard extends Hero {

    public Wizard() {
        MagicWand magicWand = new MagicWand();
        setWeapon(magicWand);
        setExperience(0);
        setHitPoints(1000);
        setLevel(1);
    }

    public void travel(Places destination) {

        if (destination.equals(Places.CEMENTARY)) {
            Skeleton skeleton = new Skeleton();
            System.out.println("Zaatakował Cię szkielet!");
            attack(skeleton);
        } else if (destination.equals(Places.DARK_FOREST)) {
            Jin jin = new Jin();
            System.out.println("Zaatakował Cię Jin!");
            attack(jin);
        } else if (destination.equals(Places.DUNGEON)) {
            Dragon dragon = new Dragon();
            System.out.println("Zaatakował Cię Smok!");
            attack(dragon);
        }
    }

    public void levelUp() {
        int heroExperience = getExperience();
        int heroLevel = getLevel();
        int heroHitPoints = getHitPoints();
        int hitPointsPerLevel = 150;
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
        Random hitOrMissRandom = new Random();
        boolean hitToMonster = false;
        boolean hitToHero = false;

        if (monster.getTypeOfMonster().equals(TypeOfMonster.FLYING)) {
            System.out.println("Życie potwora: " + monster.getHitPoints());
            System.out.println("Życie bohatera: " + getHitPoints());
            do {
                hitToMonster = hitOrMissRandom.nextBoolean();
                if (hitToMonster == true) {
                    monster.setHitPoints(monster.getHitPoints() - MagicWand.getFlyingHit());
                    System.out.println("Trafiłeś! Życie potwora: " + monster.getHitPoints());
                } else {
                    System.out.println("Nie trafiłeś!");
                }
                hitToHero = hitOrMissRandom.nextBoolean();
                if (hitToHero == true) {
                    setHitPoints(getHitPoints() - monster.getMadeDamageToHero());
                    System.out.println("Potwór Cię trafił! Życie bohatera: " + getHitPoints());
                } else {
                    System.out.println("Potwór nie trafił! Twoja kolej na atak");
                }
            }
            while (!(monster.getHitPoints() <= 0 || getHitPoints() <= 0));

            if (monster.getHitPoints() > 0) {
                System.out.println("Zostałeś pokonany!");
            } else {
                System.out.println("Wygrałeś! Dostajesz " + monster.getGivenExperienceToHero() + " punktów doświadczenia!");
                setExperience(getExperience() + monster.getGivenExperienceToHero());
                levelUp();
                System.out.println("Twój bohater posiada aktualnie " + getLevel() + " level, " + getExperience() + " doświadczenia i " + getHitPoints() + " punktów życia.");
            }
        }
        else if (monster.getTypeOfMonster().equals(TypeOfMonster.MAGIC)) {
            System.out.println("Życie potwora: " + monster.getHitPoints());
            System.out.println("Życie bohatera: " + getHitPoints());

            do {
                hitToMonster = hitOrMissRandom.nextBoolean();
                if (hitToMonster == true) {
                    monster.setHitPoints(monster.getHitPoints() - MagicWand.getMagicalHit());
                    System.out.println("Trafiłeś! Życie potwora: " + monster.getHitPoints());
                } else {
                    System.out.println("Nie trafiłeś!");
                }
                hitToHero = hitOrMissRandom.nextBoolean();
                if (hitToHero == true) {
                    setHitPoints(getHitPoints() - monster.getMadeDamageToHero());
                    System.out.println("Potwór Cię trafił! Życie bohatera: " + getHitPoints());
                } else {
                    System.out.println("Potwór nie trafił! Twoja kolej na atak");
                }
            }
            while (!(monster.getHitPoints() <= 0 || getHitPoints() <= 0));

            if (monster.getHitPoints() > 0) {
                System.out.println("Zostałeś pokonany!");
            } else {
                System.out.println("Wygrałeś! Dostajesz " + monster.getGivenExperienceToHero() + " punktów doświadczenia!");
                setExperience(getExperience() + monster.getGivenExperienceToHero());
                levelUp();
                System.out.println("Twój bohater posiada aktualnie " + getLevel() + " level, " + getExperience() + " doświadczenia i " + getHitPoints() + " punktów życia.");
            }
        }
        else if (monster.getTypeOfMonster().equals(TypeOfMonster.PHYSICAL)) {
            System.out.println("Życie potwora: " + monster.getHitPoints());
            System.out.println("Życie bohatera: " + getHitPoints());

            do {
                hitToMonster = hitOrMissRandom.nextBoolean();
                if (hitToMonster == true) {
                    monster.setHitPoints(monster.getHitPoints() - MagicWand.getPhysicalHit());
                    System.out.println("Trafiłeś! Życie potwora: " + monster.getHitPoints());
                } else {
                    System.out.println("Nie trafiłeś!");
                }
                hitToHero = hitOrMissRandom.nextBoolean();
                if (hitToHero == true) {
                    setHitPoints(getHitPoints() - monster.getMadeDamageToHero());
                    System.out.println("Potwór Cię trafił! Życie bohatera: " + getHitPoints());
                } else {
                    System.out.println("Potwór nie trafił! Twoja kolej na atak");
                }
            }
            while (!(monster.getHitPoints() <= 0 || getHitPoints() <= 0));

            if (monster.getHitPoints() > 0) {
                System.out.println("Zostałeś pokonany!");
            } else {
                System.out.println("Wygrałeś! Dostajesz " + monster.getGivenExperienceToHero() + " punktów doświadczenia!");
                setExperience(getExperience() + monster.getGivenExperienceToHero());
                levelUp();
                System.out.println("Twój bohater posiada aktualnie " + getLevel() + " level, " + getExperience() + " doświadczenia i " + getHitPoints() + " punktów życia.");
            }
        }
    }
}
