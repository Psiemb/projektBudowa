package jaknauczycsieprogramowania.drive;

import jaknauczycsieprogramowania.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);

}