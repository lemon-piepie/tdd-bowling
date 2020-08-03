public class Bowling {
    int throwtwice(int[] throwhit){
        if ((throwhit[0]+throwhit[1]) == 10){
            return (10+throwhit[3]+throwhit[4]);
        }
        return (throwhit[0]+throwhit[1]);
    }
}
