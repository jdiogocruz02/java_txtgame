package ram.controller.game;

import ram.Game;
import ram.gui.GUI;
import ram.model.Music;
import ram.model.menu.GameOver;
import ram.model.menu.Menu;
import ram.model.menu.Win;
import ram.model.realm.LoaderRealmBuilder;
import ram.model.realm.Realm;
import ram.viewer.states.GameOverState;
import ram.viewer.states.GameState;
import ram.viewer.states.MenuState;
import ram.viewer.states.WinState;

import java.io.IOException;

public class RealmController extends GameController {
    private final SurvivorController survivorController;
    private final ZombieController zombieController;

    public RealmController(Realm realm){
        super(realm);
        this.survivorController = new SurvivorController(realm);
        this.zombieController = new ZombieController(realm);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT) {game.setState(new MenuState(new Menu())); }
        if(getModel().getSurvivor().getHealth() <= 0){
            game.getMusic1().stopMusic();
            game.setState(new GameOverState(new GameOver()));
        }
        if(getModel().getSurvivor().getNuke()){
            game.setLevel();
            if(game.getLevel() == 12){
                game.getMusic1().stopMusic();
                Music musicwin = new Music("win.wav");
                musicwin.startMusic();
                game.setState(new WinState(new Win()));
            }
            else{
            game.setState(new GameState(new LoaderRealmBuilder(game.getLevel()).createRealm()));
            }
        }
        else {
            survivorController.step(game, action, time);
            zombieController.step(game, action, time);
        }
    }
}
