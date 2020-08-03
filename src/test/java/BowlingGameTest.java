import org.junit.jupiter.api.Test;

import static javax.naming.directory.BasicAttribute.arrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BowlingGameTest {
    @Test
    void should_get_pins_number_without_strike_or_spare_in_first9_frame(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit=new int[]{2,5};
        //When
        int score = bowl.throwtwice(throwhit);
        //Then
        assertEquals(7, score);
    }

    @Test
    void should_get_10_and_next_frame_score_if_spare(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit=new int[]{8,2,3,6};
        //When
        int score = bowl.throwtwice(throwhit);
        //Then
        assertEquals(19, score);
    }

    @Test
    void should_get_10_and_next_two_frames_score_if_strike(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit = new int[]{10,0,8,1,5,2};
        //When
        int score = bowl.throwtwice(throwhit);
        //Then
        assertEquals(26, score);
    }
}
