package metody.ksiazkajavaoracleRozdizal6;

public class PassOb {
    public static void main(String[] args) {
     Block ob1 = new Block(10,2,5);
     Block ob2 = new Block(10,2,5);
     Block ob3 = new Block(4,5,5);

        System.out.println("ob1 ma takie same rozwmiary jak ob2: " +
                            ob1.sameBlock(ob2));
        System.out.println("ob1 ma takie same rozwmiary jak ob3: " +
                ob1.sameBlock(ob3));
        System.out.println("ob1 ma takie same rozwmiary jak ob3: " +
                ob1.sameVolume(ob3));
    }
}

class Block{

    int a, b,c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    //Zwraca true, jesli ob definiuje taki sam blok
    boolean sameBlock(Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    //Zwraca tue, jeśli ob ma taka samą objętość
    boolean sameVolume(Block ob2){
        if(ob2.volume ==volume) return true;
        else return false;
    }
}