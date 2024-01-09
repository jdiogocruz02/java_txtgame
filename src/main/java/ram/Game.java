package ram;


import ram.gui.LanternaGUI;
import ram.model.Music;
import ram.model.menu.Menu;
import ram.viewer.states.MenuState;
import ram.viewer.states.State;


import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Game {
    private final LanternaGUI gui;
    private int level = 1;
    private State state;
    private Music music1 = new Music("z3r0-8bitSyndrome.wav");

    public Game() throws FontFormatException, IOException, URISyntaxException {
        this.gui = new LanternaGUI(30, 30);
        this.state = new MenuState(new Menu());
        music1.startMusic();
    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException {
        new Game().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void start() throws IOException {
        int FPS = 10;
        int frameTime = 1000 / FPS;

        while (this.state != null) {
            long startTime = System.currentTimeMillis();

            state.step(this, gui, startTime);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }

        gui.close();
    }
    public Music getMusic1(){
        return music1;
    }

    public int getLevel() {return level;}

    public void setLevel() {
        this.level++;
    }
}
