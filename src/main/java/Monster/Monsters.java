package Monster;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public abstract class Monsters {

    private int hitPoints;
    private int givenExperienceToHero;
    private int madeDamageToHero;
    private TypeOfMonster typeOfMonster;


    public int getMadeDamageToHero() {
        return madeDamageToHero;
    }

    public void setMadeDamageToHero(int madeDamageToHero) {
        this.madeDamageToHero = madeDamageToHero;
    }

    public int getGivenExperienceToHero() {
        return givenExperienceToHero;
    }

    public void setGivenExperienceToHero(int givenExperienceToHero) {
        this.givenExperienceToHero = givenExperienceToHero;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public TypeOfMonster getTypeOfMonster() {
        return typeOfMonster;
    }

    public void setTypeOfMonster(TypeOfMonster typeOfMonster) {
        this.typeOfMonster = typeOfMonster;
    }

    @Override
    public String toString() {
        return "Potwór";
    }
}
