package ram.controller.menu;

import ram.Game;
import ram.controller.Controller;
import ram.gui.GUI;
import ram.model.menu.Controls;
import ram.model.menu.Menu;
import ram.viewer.states.MenuState;

import java.io.IOException;

public class ControlsController extends Controller<Controls> {


    public ControlsController(Controls controls) {
        super(controls);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
       switch (action) {
           case DOWN:
               getModel().getBacktomenu();
               break;
           case SELECT:
            if (getModel().isSelected()) game.setState(new MenuState(new Menu()));
        }
    }
}
