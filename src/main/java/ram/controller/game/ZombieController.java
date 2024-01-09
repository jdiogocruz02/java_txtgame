package ram.controller.game;

import ram.Game;
import ram.gui.GUI;
import ram.model.Elements.Zombies;
import ram.model.Position;
import ram.model.realm.Realm;

import java.io.IOException;

public class ZombieController extends GameController{
    private long lastMovement;
    public ZombieController(Realm realm) {
        super(realm);

        this.lastMovement = 0;
    }
    private void moveZombie(Zombies zombies, Position position) {
        if (getModel().isEmpty(position)) {
            zombies.setPosition(position);
            if (getModel().getSurvivor().getPosition().equals(position))
                getModel().getSurvivor().decreaseHealth();
        }
    }


    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 275) {
            for (Zombies zombies : getModel().getZombies()) {
                    moveZombie(zombies, zombies.getPosition().getRandomNeighbour(zombies.getPosition(), getModel().getSurvivor()));
            }
            this.lastMovement = time;
        }
    }

    public long getLastMovement(){return lastMovement;}
}
