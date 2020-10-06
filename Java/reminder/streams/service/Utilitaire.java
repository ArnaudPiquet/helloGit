import java.util.Random;

public class Utilitaire{
    public int getRandom(int min, int max){
        Random rand = new Random();
        return (rand.nextInt(max-min+1) + min);
    }
}