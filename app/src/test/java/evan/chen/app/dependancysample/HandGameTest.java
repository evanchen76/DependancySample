package evan.chen.app.dependancysample;

import org.junit.Assert;
import org.junit.Test;

import static evan.chen.app.dependancysample.HandGame.GAME_RESULT.YOU_WIN;
import static evan.chen.app.dependancysample.HandGame.HAND.SCISSORS;

public class HandGameTest {
    @Test
    public void handGameTest() throws Exception {
        //Arrange
        //遊戲者出剪刀
        HandGame.HAND myHand = SCISSORS;

        //假的電腦，固定出布
        IComputerPlayer player = new StubComputerPlayer();
        HandGame target = new HandGame(player);

        //預期回傳 遊戲者贏
        HandGame.GAME_RESULT expected = YOU_WIN;

        // Act
        HandGame.GAME_RESULT result = target.startGame(myHand);

        // Assert
        Assert.assertEquals(expected, result);
    }
}
