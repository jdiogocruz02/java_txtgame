package ram.viewer.menu;

import ram.gui.GUI;
import ram.model.Position;
import ram.model.menu.Win;
import ram.viewer.Viewer;

public class WinViewer extends Viewer<Win> {

    public WinViewer(Win model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        String txt = "congratulations\"";
        String txt1 = "you saved ram,its nuked";
        String txt2 = "and free of zombies,people";
        String txt3 = "can now live here, the new";
        String txt4 = "land free of zombies\"\"\"";
        gui.drawText(new Position(4,5),"!!!!!! YOU WIN !!!!!!","#FFD700");
        gui.drawText(new Position(1,10),txt,"#FFFFFF");
        gui.drawText(new Position(1,11),txt1,"#FFFFFF");
        gui.drawText(new Position(1,12),txt2,"#FFFFFF");
        gui.drawText(new Position(1,13),txt3,"#FFFFFF");
        gui.drawText(new Position(1,14),txt4,"#FFFFFF");
        gui.drawText(new Position(12, 20),
                getModel().getQuit(),
                getModel().isSelected() ? "#FFD700" : "#FFFFFF");
    }
}
