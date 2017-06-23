package evan.chen.app.dependancysample;

import static evan.chen.app.dependancysample.HandGame.HAND.PAPER;

/**
 * Created by 3758 on 2017/6/22.
 */

public class StubComputerPlayer implements IComputerPlayer {
    @Override
    public HandGame.HAND getRandom() {
        return PAPER;
    }
}