package ram.model.realm;

import ram.gui.GUI;
import ram.model.Elements.*;

import java.util.List;

public abstract class RealmBuilder {
    public Realm createRealm() {
        Realm realm = new Realm(getWidth(), getHeight());

        realm.setSurvivor(createSurvivor());
        realm.setZombies(createZombies());
        realm.setWalls(createWalls());
        realm.setCoins(createCoins());
        realm.setTrees(createTrees());
        realm.setNuke(createNuke());
        realm.setBushes(createBushes());

        return realm;
    }
    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Zombies> createZombies();
    protected abstract List<Tree> createTrees();
    protected abstract Nuke createNuke();
    protected abstract List<Coin> createCoins();
    protected abstract Survivor createSurvivor();
    protected abstract List<Bush> createBushes();
}
