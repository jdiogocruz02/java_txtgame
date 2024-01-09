package ram.model.menu;

import ram.Game;
import ram.model.Music;

import java.util.Arrays;
import java.util.List;

public class GameOver {

    private final List<String> entries;
    Music musica = new Music("GameOver.wav");
    private int currentEntry = 0;

    public GameOver() {
        this.entries = Arrays.asList("QUIT GAME");
        this.GameOverMusic();
    }
    public int getNumberEntries() {
        return this.entries.size();
    }

    public String getEntry(int i) {
        return entries.get(i);
    }
    public boolean isSelected(int i) {return currentEntry == i;}

    public boolean isQuit(){return isSelected(0);}

    public void GameOverMusic(){musica.startMusic();}
}
