package evan.chen.app.dependancysample;

import static evan.chen.app.dependancysample.HandGame.GAME_RESULT.PEACE;
import static evan.chen.app.dependancysample.HandGame.GAME_RESULT.YOU_LOSE;
import static evan.chen.app.dependancysample.HandGame.GAME_RESULT.YOU_WIN;
import static evan.chen.app.dependancysample.HandGame.HAND.PAPER;
import static evan.chen.app.dependancysample.HandGame.HAND.SCISSORS;
import static evan.chen.app.dependancysample.HandGame.HAND.STONE;

/**
 * Created by 3758 on 2017/6/22.
 */

public class HandGame {
    private IComputerPlayer handGameComputerPlayer;

    public HandGame(IComputerPlayer handGameComputerPlayer) {
        this.handGameComputerPlayer = handGameComputerPlayer;
    }

    public GAME_RESULT startGame(HAND yourHand){

        HAND computerHand = handGameComputerPlayer.getRandom();

        if ( yourHand.equals(computerHand)){
            return PEACE;
        }

        if ( yourHand == PAPER && computerHand == STONE ){
            return YOU_WIN;
        }

        if ( yourHand == PAPER && computerHand == SCISSORS ){
            return YOU_LOSE;
        }

        if ( yourHand == STONE && computerHand == SCISSORS ){
            return YOU_WIN;
        }

        if ( yourHand == STONE && computerHand == PAPER ){
            return YOU_LOSE;
        }

        if ( yourHand == SCISSORS && computerHand == PAPER ){
            return YOU_WIN;
        }

        if ( yourHand == SCISSORS && computerHand == STONE ){
            return YOU_LOSE;
        }

        throw new RuntimeException();
    }

    public enum HAND{
        PAPER,
        SCISSORS,
        STONE
    }

    public  enum GAME_RESULT{
        PEACE,
        YOU_WIN,
        YOU_LOSE
    }
}

