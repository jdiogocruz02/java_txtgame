package ram.controller.menu;

import ram.Game;
import ram.controller.Controller;
import ram.gui.GUI;
import ram.model.Music;
import ram.model.menu.GameOver;
import ram.model.menu.Menu;
import ram.viewer.states.MenuState;

import java.io.IOException;

public class GameOverController extends Controller<GameOver> {


    public GameOverController(GameOver model) {
        super(model);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case SELECT:
               if(getModel().isQuit()) game.setState(null);
        }
    }
}
