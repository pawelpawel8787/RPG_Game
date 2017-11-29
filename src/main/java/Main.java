import Hero.Amazon;
import Hero.Warrior;
import Monster.Dragon;
import Monster.Jin;
import Monster.Monsters;
import Monster.Skeleton;
import Place.Places;

/**
 * Created by HP on 2017-11-28.
 */
public class Main {

    public static void main(String[] args) {


        Amazon Lara = new Amazon();
        Dragon dragon = new Dragon();
        Skeleton skeleton = new Skeleton();
        Jin jin = new Jin();


        Lara.travel(Places.DUNGEON);
    }

}
