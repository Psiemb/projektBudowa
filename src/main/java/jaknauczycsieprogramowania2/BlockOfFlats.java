package jaknauczycsieprogramowania2;

import jaknauczycsieprogramowania2.flat.Flat;
import jaknauczycsieprogramowania2.inhabitant.Inhabitant;

import java.util.ArrayList;
import java.util.List;

public class BlockOfFlats {

    private Flat flat;
    private DevelopmentAround developmentAround;
    private Elevator elevator;
    private Laundry laundry;
    private PlayGround playGround;
    private StorageRoom storageRoom;
    private TrolleyRoom trolleyRoom;

    private List<Inhabitant> inhabitants = new ArrayList<>();

    public BlockOfFlats(Flat flat, Elevator elevator) {
        this.flat = flat;
        this.elevator = elevator;
    }

    public Flat getFlat() {
        return flat;
    }

    public DevelopmentAround getDevelopmentAround() {
        return developmentAround;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public Laundry getLaundry() {
        return laundry;
    }

    public PlayGround getPlayGround() {
        return playGround;
    }

    public StorageRoom getStorageRoom() {
        return storageRoom;
    }

    public TrolleyRoom getTrolleyRoom() {
        return trolleyRoom;
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }
}

