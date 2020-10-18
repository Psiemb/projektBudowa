package metody.ksiazkajavaoracle;

public class Power {
    public static void main(String[] args) {
        int e;
        int result;

        for (int i = 0; i <= 9; i++){
            result = 1;
            e = i;
            while (e > 0){
                result *= 2; //result = result *2;
                e--; //e = e - 1;
            }
            System.out.println("2 do potęgi " + i + " równa się " +result);


        }
    }
}
