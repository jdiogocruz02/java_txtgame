package ram.viewer.menu;

import ram.gui.GUI;
import ram.model.menu.Controls;
import ram.model.Position;
import ram.viewer.Viewer;

public class ControlsViewer extends Viewer<Controls> {

    public ControlsViewer(Controls controls) {
        super(controls);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(10,5),"CONTROLS","#FFFFFF");

        gui.drawText(new Position(2,10), "Arrow up - move up", "#FFFFFF");
        gui.drawText(new Position(2,12),"Arrow down - move down","#FFFFFF");
        gui.drawText(new Position(2,14), "Arrow left - move left", "#FFFFFF");
        gui.drawText(new Position(2,16),"Arrow right - move right","#FFFFFF");
      
        gui.drawText(new Position(2,20),"esc - leave to menu","#FFFFFF");


        gui.drawText(new Position(12, 25),
                getModel().getBacktomenu(),
                getModel().isSelected() ? "#FFD700" : "#FFFFFF");
    }
}
