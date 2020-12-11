package jaknauczycsieprogramowania.file.imagefile;

import jaknauczycsieprogramowania.file.AbstractFile;
import jaknauczycsieprogramowania.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(int size,String name) {
        super(size, name);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;

    }
}