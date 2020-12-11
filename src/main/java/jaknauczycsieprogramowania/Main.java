package jaknauczycsieprogramowania;

import jaknauczycsieprogramowania.drive.Drive;
import jaknauczycsieprogramowania.drive.HDDDrive;
import jaknauczycsieprogramowania.drive.SSDDrive;
import jaknauczycsieprogramowania.file.File;
import jaknauczycsieprogramowania.file.imagefile.JPGImageFile;
import jaknauczycsieprogramowania.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
      //  System.out.println(Monitor.getMaxHeight());

        Monitor monitor = new Monitor();
        Drive drive = new HDDDrive();
        Computer computer = new Computer(monitor, drive);

        System.out.println(computer.getMonitor().getResolution());
        System.out.println();
        System.out.println(monitor.getResolution());
        System.out.println();


        drive.addFile(new MP3MusicFile(3,"asd","re","ert",43));
        drive.addFile(new JPGImageFile(2,"asd",5));
        //       ssdDrive.listFiles();
        drive.listFiles();

            File file = drive.findFile("dsf");
            System.out.println(file.getSize());


    }
}