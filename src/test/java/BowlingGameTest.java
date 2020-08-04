import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BowlingGameTest {
    @Test
    void should_get_pins_number_without_strike_or_spare_in_first9_frame(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit=new int[]{2,5};
        //When
        int score = bowl.throwNomalFrame(throwhit);
        //Then
        assertEquals(7, score);
    }

    @Test
    void should_get_10_and_next_frame_score_if_spare(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit=new int[]{8,2,3,6};
        //When
        int score = bowl.throwNomalFrame(throwhit);
        //Then
        assertEquals(19, score);
    }

    @Test
    void should_get_10_and_next_two_frames_score_if_strike(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit = new int[]{10,0,8,1,5,2};
        //When
        int score = bowl.throwNomalFrame(throwhit);
        //Then
        assertEquals(26, score);
    }

    @Test
    void should_get_number_of_pins_without_spare_or_strike_on_tenth_time(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit = new int[]{5,3};
        //When
        int score = bowl.throwLastFrame(throwhit);
        //Then
        assertEquals(8, score);
    }

    @Test
    void should_get_number_of_pins_and_next_throw_when_spare_on_tenth_time(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit = new int[]{7,3,7};
        //When
        int score = bowl.throwLastFrame(throwhit);
        //Then
        assertEquals(17, score);
    }

    @Test
    void should_get_number_of_pins_and_next_two_throw_when_strike_on_tenth_time(){
        //Given
        Bowling bowl = new Bowling();
        int[] throwhit = new int[]{10,0,7,9};
        //When
        int score = bowl.throwLastFrame(throwhit);
        //Then
        assertEquals(26, score);
    }

    @Test
    void should_get_score_when_10_frame_done_without_strike_or_spare(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(40,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_without_hit(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(0,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_strike_only(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{0,0,10,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(26,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_spare_only(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{0,0,8,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(18,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_strike_on_last_frame(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,10,10};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(30,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_spare_on_last_frame(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,1,10,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(20,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_strike_and_spare(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{2,2,2,2,10,0,4,3,2,5,5,5,2,2,2,2,2,2,2,2,0,0};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(76,socres);
    }

    @Test
    void should_get_score_when_10_frame_done_with_strike_all(){
        //Given
        Bowling bowl = new Bowling();
        int[] hitNumber = new int[]{10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,10};
        //When
        int socres = bowl.getScore(hitNumber);
        //Then
        assertEquals(300,socres);
    }
}
