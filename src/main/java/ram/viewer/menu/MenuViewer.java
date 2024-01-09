package ram.viewer.menu;


import ram.gui.GUI;
import ram.model.Position;
import ram.model.menu.Menu;
import ram.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }


    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(6, 5), "THE RAM APOCALYPSE", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(new Position(12, 8 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        for(int j = 0; j < 8; j++){
            for(int k = 0; k < 8;k++){
                gui.drawText(new Position(11+j,14+k),"&","#0c6624");
            }
        }

        gui.drawText(new Position(12,17),"&&","#000000");
        gui.drawText(new Position(16,17),"&&","#000000");
        gui.drawText(new Position(14,18),"&&","#1ee656");
        gui.drawText(new Position(13,19),"&","#1ee656");
        gui.drawText(new Position(13,20),"&","#1ee656");
        gui.drawText(new Position(16,19),"&","#1ee656");
        gui.drawText(new Position(16,20),"&","#1ee656");

    }
}
