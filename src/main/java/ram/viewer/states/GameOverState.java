package ram.viewer.states;

import ram.controller.Controller;
import ram.controller.menu.GameOverController;
import ram.model.menu.GameOver;
import ram.viewer.Viewer;
import ram.viewer.menu.GameOverViewer;

public class GameOverState extends State<GameOver>{

    public GameOverState(GameOver model) {
        super(model);
    }

    @Override
    protected Viewer<GameOver> getViewer() {

        return new GameOverViewer(getModel());
    }

    @Override
    protected Controller<GameOver> getController() {

        return new GameOverController(getModel());
    }
}
