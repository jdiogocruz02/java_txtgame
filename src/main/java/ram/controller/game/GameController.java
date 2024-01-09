package ram.controller.game;

import ram.controller.Controller;
import ram.model.realm.Realm;

public abstract class GameController extends Controller<Realm> {
    public GameController(Realm realm){super(realm);}

}
