package ram.model.menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

public class Controls {

    private final String backtomenu;

    public Controls() {
        this.backtomenu = "Exit";
    }
    public String getBacktomenu() {
        return backtomenu;
    }
    public boolean isSelected() {
        return backtomenu.equals("Exit");
    }
}

