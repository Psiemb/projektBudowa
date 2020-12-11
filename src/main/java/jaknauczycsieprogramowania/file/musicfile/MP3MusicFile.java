package jaknauczycsieprogramowania.file.musicfile;

public class MP3MusicFile extends AbstractMusicFile {
    private int quality;

    public MP3MusicFile(int size,String name, String bandName, String title, int quality) {
        super(size, name, bandName, title);

        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String getName() {
        return "Dla plików MP3 getName nie działa";
    }


}
