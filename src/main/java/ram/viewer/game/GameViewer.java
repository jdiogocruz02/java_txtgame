package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Element;
import ram.model.Position;
import ram.model.realm.Realm;
import ram.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Realm> {
    public GameViewer(Realm realm){super(realm);}

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }
    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElements(gui, getModel().getZombies(), new ZombieViewer());
        drawElement(gui, getModel().getSurvivor(), new SurvivorViewer());
        drawElements(gui,getModel().getTrees(),new TreeViewer());
        drawElements(gui,getModel().getCoins(),new CoinViewer());
        drawElement(gui,getModel().getNuke(),new NukeViewer());
        drawElements(gui,getModel().getBushes(),new BushViewer());

        gui.drawText(new Position(0, 0), "HEALTH: " + getModel().getSurvivor().getHealth(), "#FFD700");
        gui.drawText(new Position(15,0),"COINS LEFT: "+ getModel().getSurvivor().getCoins(), "#FFD700");
    }
}
