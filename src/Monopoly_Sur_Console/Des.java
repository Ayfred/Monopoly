package Monopoly_Sur_Console;

import java.util.Random;

public class Des {
    static Random rd = new Random();
    
    public static int lancer(){
        return rd.nextInt(5) + 1;
    }
}
