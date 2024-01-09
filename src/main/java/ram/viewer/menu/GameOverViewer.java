package ram.viewer.menu;

import ram.gui.GUI;
import ram.model.Position;
import ram.model.menu.GameOver;
import ram.viewer.Viewer;

import javax.sound.sampled.Clip;

public class GameOverViewer extends Viewer<GameOver> {

    public GameOverViewer(GameOver model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(10,5),"GAME OVER","#ff1e0e");
        for (int i = 0; i < getModel().getNumberEntries(); i++) {

            gui.drawText(new Position(10, 10 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        }
    }
}
