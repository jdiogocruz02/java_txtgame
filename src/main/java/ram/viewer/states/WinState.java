package ram.viewer.states;

import ram.controller.Controller;
import ram.controller.menu.WinController;
import ram.model.menu.Win;
import ram.viewer.Viewer;
import ram.viewer.menu.WinViewer;

public class WinState extends State<Win>{
    public WinState(Win model) {
        super(model);
    }

    @Override
    protected Viewer<Win> getViewer() {
        return new WinViewer(getModel());
    }

    @Override
    protected Controller<Win> getController() {
        return new WinController(getModel());
    }
}
