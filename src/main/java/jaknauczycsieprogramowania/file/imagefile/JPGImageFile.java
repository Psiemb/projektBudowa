package jaknauczycsieprogramowania.file.imagefile;

public class JPGImageFile extends AbstractImageFile {
    private int compression;

    public JPGImageFile(int size, String name, int compression) {
        super(size, name);

        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }

}