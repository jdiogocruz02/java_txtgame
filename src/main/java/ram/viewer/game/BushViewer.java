package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Bush;


public class BushViewer implements ElementViewer<Bush> {

    @Override
    public void draw(Bush bush, GUI gui) {
        gui.drawBush(bush.getPosition());
    }
}