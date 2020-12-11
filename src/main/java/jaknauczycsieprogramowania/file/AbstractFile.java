package jaknauczycsieprogramowania.file;

public abstract class AbstractFile implements File {
    protected String name;
    protected int size;

    protected AbstractFile(int size, String name) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
