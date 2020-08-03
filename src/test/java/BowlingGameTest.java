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
        int socre = bowl.throwtwice(throwhit);
        //Then
        assertEquals(7, socre);
    }

    @Test
    void should_get_10_and_next_frame_score_if_spare(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit=new int[]{8,2,3,6};
        //When
        int socre = bowl.throwtwice(throwhit);
        //Then
        assertEquals(19, socre);
    }
}
