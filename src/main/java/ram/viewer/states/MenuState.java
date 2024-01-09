package ram.viewer.states;


import ram.controller.Controller;

import ram.controller.menu.MenuController;
import ram.model.menu.Menu;
import ram.viewer.menu.MenuViewer;
import ram.viewer.Viewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu model) {
        super(model);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
