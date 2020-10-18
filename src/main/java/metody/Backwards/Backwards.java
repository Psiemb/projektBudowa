package metody.Backwards;

public class Backwards {

    String str;

    Backwards(String givenSentence) {
        str = givenSentence;
    }

    public void backwardsMethod(int idexOfMark) {
        if (idexOfMark != str.length() - 1) backwardsMethod(idexOfMark + 1);

        System.out.print(str.charAt(idexOfMark));
    }
}
