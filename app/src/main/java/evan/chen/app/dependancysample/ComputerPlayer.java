package evan.chen.app.dependancysample;

import java.util.Random;

import static evan.chen.app.dependancysample.HandGame.HAND.PAPER;
import static evan.chen.app.dependancysample.HandGame.HAND.SCISSORS;
import static evan.chen.app.dependancysample.HandGame.HAND.STONE;

/**
 * Created by 3758 on 2017/6/22.
 */

public class ComputerPlayer implements IComputerPlayer {

    @Override
    public HandGame.HAND getRandom() {
        Random rn = new Random();
        int answer = rn.nextInt(2);

        if ( answer == 0 ){
            return PAPER;
        }else if ( answer == 1 ){
            return SCISSORS;
        }else {
            return STONE;
        }
    }
}
