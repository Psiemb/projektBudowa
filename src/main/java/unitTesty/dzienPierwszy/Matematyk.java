package unitTesty.dzienPierwszy;

public class Matematyk {

    public int wartoscBezwzgledna(int a) {
        if(a > 0) {
            return a;
        }
        else if (a < 0) {
            return -a;
        }
        return 100;
    }
}
