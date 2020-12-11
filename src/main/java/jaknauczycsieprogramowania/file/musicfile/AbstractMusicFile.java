package jaknauczycsieprogramowania.file.musicfile;

import jaknauczycsieprogramowania.file.AbstractFile;
import jaknauczycsieprogramowania.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(int size, String name, String bandName, String title) {
        super(size, name);

        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }

}