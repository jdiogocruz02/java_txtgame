package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Tree;

public class TreeViewer implements ElementViewer<Tree> {
    @Override
    public void draw(Tree tree, GUI gui) {
        gui.drawTree(tree.getPosition());
    }
}
