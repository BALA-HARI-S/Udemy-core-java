public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temparature){

        if (summer){

            if (temparature >= 25 && temparature <= 45){

                return true;

            } else {

                return false;
            }

        } else if ( temparature >= 25 && temparature <= 35) {

            return true;

        } else {

            return false;

        }
    }
}
