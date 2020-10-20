package Tokenizacja;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Towar {

    //TODO: pierw pola, potem konstruktory, potem gettery i settery potem Twoje metody, potem @Override'owane metody (np toSTring)

    public Towar(){

        this.cena = 0.0;
        this.nazwa = " ";
        this.dataWydania = new GregorianCalendar().getTime();

    }
    public Towar(double cena, String nazwa){
        this();
        this.cena = cena;
        this.nazwa = nazwa;
    }
    public Towar(double cena, String nazwa, int rok, int m, int dz){
        this(cena, nazwa);
        GregorianCalendar kalendarz = new GregorianCalendar(rok, m-1, dz);
        this.dataWydania = kalendarz.getTime();
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(int r, int m, int dz) {
        GregorianCalendar kalendarz = new GregorianCalendar(r, m-1, dz);
        this.dataWydania = kalendarz.getTime();

        this.dataWydania = dataWydania;
    }
    public void setDataWydania(Date dataWydania) {

        this.dataWydania = dataWydania;
    }
    public String toString(){
        GregorianCalendar kalendarz = new GregorianCalendar();
        kalendarz.setTime(this.dataWydania);
        return this.cena+" zł; nazwa "+this.nazwa+" "
                +kalendarz.get(Calendar.YEAR)+" rok"+kalendarz.get(Calendar.MONTH)+" m"+
                +kalendarz.get(Calendar.DAY_OF_MONTH)+" dz";
    }
    public static  void  zapiszDoPliku(Towar[] towar, PrintWriter outS){
        outS.println(towar.length);
        GregorianCalendar kalendarz = new GregorianCalendar();

        for (int i = 0; i < towar.length; i++)
        {
            kalendarz.setTime(towar[i].getDataWydania());
            outS.println(towar[i].getCena()+"|"+towar[i].getNazwa()+"|"+towar[i].getDataWydania()+"|" +kalendarz.get(Calendar.YEAR)+"|"+(kalendarz.get(Calendar.MONTH)+1)+"|"+
                    +kalendarz.get(Calendar.DAY_OF_MONTH)+"|");
        }

    }
    public static Towar[] odczytajZPliku(BufferedReader inS) throws IOException
    {
        int dl = Integer.parseInt(inS.readLine());
        Towar[] towar = new Towar[dl];

        for (int i = 0; i < dl; i++){
            towar[i]= new Towar();
        }
        return towar;

    }
    private double cena;
    private String nazwa;
    private Date dataWydania;
}
