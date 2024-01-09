package ram.viewer.states;

import ram.controller.Controller;
import ram.controller.menu.ControlsController;
import ram.model.menu.Controls;
import ram.viewer.menu.ControlsViewer;
import ram.viewer.Viewer;

public class ControlsState extends State<Controls>{

    public ControlsState(Controls model) {
        super(model);
    }

    @Override
    protected Viewer<Controls> getViewer() {
        return new ControlsViewer(getModel());
    }

    @Override
    protected Controller<Controls> getController() {
        return new ControlsController(getModel());
    }
}
