package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Element;

public interface ElementViewer <T extends Element> {
    void draw (T element, GUI gui);
}
