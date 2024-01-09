package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Survivor;

public class SurvivorViewer implements ElementViewer<Survivor> {
    @Override
    public void draw(Survivor survivor, GUI gui) {gui.drawSurvivor(survivor.getPosition());}
}
