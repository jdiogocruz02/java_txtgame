package ram.controller.menu;

import ram.Game;
import ram.controller.Controller;
import ram.gui.GUI;
import ram.model.Music;
import ram.model.menu.Menu;
import ram.model.menu.Win;
import ram.viewer.states.MenuState;

import java.io.IOException;

public class WinController extends Controller<Win> {
    public WinController(Win model) {
        super(model);
    }


    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case DOWN:
                getModel().getQuit();
                break;
            case SELECT:
                if (getModel().isSelected()) game.setState(null);
        }
    }
}
