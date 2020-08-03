public class Bowling {
    int throwtwice(int[] throwhit){
        if ((throwhit[0]+throwhit[1]) == 10){
            return (10+throwhit[2]+throwhit[3]);
        }else if ((throwhit[0]+throwhit[1]) == 10 && throwhit[1] == 0){
            return (10+throwhit[2]+throwhit[3]+throwhit[4]+throwhit[5]);
        }
        return (throwhit[0]+throwhit[1]);
    }

    int throwlast(int[] throwhit){
        if ((throwhit[0]+throwhit[1]) == 10){
            return (10+throwhit[2]);
        }
        return (throwhit[0]+throwhit[1]);
    }
}
