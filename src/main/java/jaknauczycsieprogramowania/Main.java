package jaknauczycsieprogramowania;

import jaknauczycsieprogramowania.drive.Drive;
import jaknauczycsieprogramowania.drive.HDDDrive;
import jaknauczycsieprogramowania.drive.SSDDrive;
import jaknauczycsieprogramowania.file.File;
import jaknauczycsieprogramowania.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
      //  System.out.println(Monitor.getMaxHeight());

//        Monitor monitor = new Monitor();
        Drive drive = new HDDDrive();
        //Computer computer = new Computer(monitor, ssdDrive);
        drive.addFile(new MP3MusicFile("dsf",324,"re","ert",43));
       // ssdDrive.listFiles();
        File file = drive.findFile("dsf");
        System.out.println(file.getSize());

    }
}