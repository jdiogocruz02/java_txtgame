package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Zombies;

public class ZombieViewer implements ElementViewer<Zombies>{
    @Override
    public void draw(Zombies zombies, GUI gui) {gui.drawZombie(zombies.getPosition());}
}
