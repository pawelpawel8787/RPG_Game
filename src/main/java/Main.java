import Hero.Amazon;
import Hero.Warrior;
import Hero.Wizard;
import Monster.Dragon;
import Monster.Jin;
import Monster.Skeleton;
import Place.Places;

/**
 * Created by HP on 2017-11-28.
 */
public class Main {

    public static void main(String[] args) {


        Amazon lara = new Amazon();
        Wizard jane = new Wizard();
        Warrior thor = new Warrior();

        Dragon dragon = new Dragon();
        Skeleton skeleton = new Skeleton();
        Jin jin = new Jin();


      //  Lara.travel(Places.CEMENTARY);
        jane.travel(Places.DUNGEON);

    }

}
