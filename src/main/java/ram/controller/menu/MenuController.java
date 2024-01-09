package ram.controller.menu;

import ram.Game;
import ram.controller.Controller;
import ram.gui.GUI;
import ram.model.menu.Controls;
import ram.model.realm.LoaderRealmBuilder;
import ram.model.menu.Menu;
import ram.viewer.states.ControlsState;
import ram.viewer.states.GameState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {

    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedControls()) game.setState(new ControlsState(new Controls()));
                if (getModel().isSelectedStart()) game.setState(new GameState(new LoaderRealmBuilder(game.getLevel()).createRealm()));
        }
    }
}


