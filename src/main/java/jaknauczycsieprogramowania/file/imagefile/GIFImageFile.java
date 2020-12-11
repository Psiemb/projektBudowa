package jaknauczycsieprogramowania.file.imagefile;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(int size, String name) {
        super(size, name);
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }

    public int getVersion() {
        return 2;
    }

}
