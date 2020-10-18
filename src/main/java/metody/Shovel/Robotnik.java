package metody.Shovel;

public class Robotnik {
    public String breakShovel(Shovel sho){
        if (sho.isBroken()){
            return "łopata złamana";
        }
        else {
            return "łopata dobra";
        }


    }
}
