package ram.controller.game;

import ram.Game;
import ram.gui.GUI;
import ram.model.Elements.Coin;
import ram.model.Position;
import ram.model.menu.Menu;
import ram.model.realm.Realm;
import ram.viewer.states.MenuState;

public class SurvivorController extends GameController {
    public SurvivorController(Realm realm) {super(realm);}
    public void moveSurvivorLeft(){moveSurvivor(getModel().getSurvivor().getPosition().getLeft());}
    public void moveSurvivorRight(){moveSurvivor(getModel().getSurvivor().getPosition().getRight());}
    public void moveSurvivorUp(){moveSurvivor(getModel().getSurvivor().getPosition().getUp());}
    public void moveSurvivorDown(){moveSurvivor(getModel().getSurvivor().getPosition().getDown());}
    private void moveSurvivor(Position position){
        if (getModel().isEmpty(position)) {
            getModel().getSurvivor().setPosition(position);
            if (getModel().isZombies(position)) getModel().getSurvivor().decreaseHealth();
            if(getModel().isCoins(position)){
                getModel().getSurvivor().decreaseCoins();
                for(Coin coin: getModel().getCoins()){
                    if(coin.getPosition().equals(getModel().getSurvivor().getPosition()))
                        coin.setPosition(new Position(50,50));
                }
            }
            if(getModel().getSurvivor().getCoins() == 0)
                if(getModel().isNuke(position)) getModel().getSurvivor().NukeCaught();
        }
    }
    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveSurvivorUp();
        if (action == GUI.ACTION.RIGHT) moveSurvivorRight();
        if (action == GUI.ACTION.DOWN) moveSurvivorDown();
        if (action == GUI.ACTION.LEFT) moveSurvivorLeft();
    }

}
