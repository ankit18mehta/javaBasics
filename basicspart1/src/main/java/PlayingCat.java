public class PlayingCat {

    public  static boolean isCatPlaying(boolean summer, int temprature){
        if((temprature<=35 && temprature>=25) || (summer==true && (temprature<=45 && temprature>=25 ) ))
        {
            return true;
        }

                return false;


    }

    public static void main(String[] args) {
        System.out.println( isCatPlaying(true, 10));
        System.out.println( isCatPlaying(false, 36));
        System.out.println( isCatPlaying(true, 35));

    }
}
