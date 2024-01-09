package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Nuke;

public class NukeViewer implements ElementViewer<Nuke>{

    @Override
    public void draw(Nuke nuke, GUI gui) {
        gui.drawNuke(nuke.getPosition());
    }
}
