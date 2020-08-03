import java.util.Arrays;

public class Bowling {
    int finalscore = 0;

    int throwNomalFrame(int[] throwhit){
        if ((throwhit[0]+throwhit[1]) == 10 && throwhit[1] == 0){
            return (10+throwhit[2]+throwhit[3]+throwhit[4]+throwhit[5]);
        }else if ((throwhit[0]+throwhit[1]) == 10){
            return (10+throwhit[2]+throwhit[3]);
        }
        return (throwhit[0]+throwhit[1]);
    }

    int throwLastFrame(int[] throwhit){
        if ((throwhit[0]+throwhit[1]) == 10 && throwhit[1] == 0){
            return (10+throwhit[2]+throwhit[3]);
        }else if ((throwhit[0]+throwhit[1]) == 10){
            return (10+throwhit[2]);
        }
        return (throwhit[0]+throwhit[1]);
    }

    public int getScore(int[] hitNumber) {
        int[] score = new int[10];
        int[] scoreForLastAndMore = new int[4];
        scoreForLastAndMore = Arrays.copyOfRange(hitNumber,18,22);
        //System.arraycopy(hitNumber,20,scoreForLastAndMore,0,4);
        System.out.println(scoreForLastAndMore);
        for (int i=0; i<18; i+=2){
            int [] scoreFor3Frame = new int[6];
            scoreFor3Frame = Arrays.copyOfRange(hitNumber, i ,i+6);
            //System.arraycopy(hitNumber,i,scoreFor3Frame,0,6);
            score[i/2] = this.throwNomalFrame(scoreFor3Frame);
        }
        score [9] = this.throwLastFrame(scoreForLastAndMore);

        for (int j = 0; j < 10; j++){
            this.finalscore += score[j];
        }
        return this.finalscore;
    }

}
