import java.util.*;
import java.lang.Math;

public class Warrior extends Character{

    public double random(){
        double random_a = 0;
        double random_b = 10;
        double random = Math.floor(Math.random()*(random_b-random_a+1)+random_a);
        return  random;
    }

    public boolean attack(){
        if (random() > 0 && random() <= 6){
            return true;
        }else {
            return false;
        }
    }
}
