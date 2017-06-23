package evan.chen.app.dependancysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IComputerPlayer computerPlayer = new ComputerPlayer();

        HandGame handGame = new HandGame(computerPlayer);
        HandGame.HAND myHand = HandGame.HAND.PAPER;
        HandGame.GAME_RESULT result = handGame.startGame(myHand);

        if ( result == HandGame.GAME_RESULT.PEACE){
            Log.d("Game", "PEACE");
        }

        if ( result == HandGame.GAME_RESULT.YOU_WIN){
             Log.d("Game", "YOU_WIN");
        }

        if ( result == HandGame.GAME_RESULT.YOU_LOSE){
            Log.d("Game", "YOU_LOSE");
        }
    }
}
