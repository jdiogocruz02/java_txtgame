package ram.viewer.states;

import ram.controller.Controller;
import ram.controller.game.RealmController;
import ram.model.menu.Menu;
import ram.model.realm.Realm;
import ram.viewer.Viewer;
import ram.viewer.game.GameViewer;

public class GameState extends State<Realm> {
    public GameState(Realm realm) {
        super(realm);
    }

    @Override
    protected Viewer<Realm> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Realm> getController() {
        return new RealmController(getModel());
    }

}
