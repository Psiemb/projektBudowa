package metody.ksiazkajavaoracle;

public class WhileDemo {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.print("Od pętli while ");
        while (ch <= 'Z'){
            System.out.print(ch +" ");
            ch++;
        }
        System.out.println();

        System.out.print("Od pętli for ");
        for (ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch +" ");
        }
    }
}
