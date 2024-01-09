package ram.model.menu;

import ram.model.Music;

import java.util.Arrays;
import java.util.List;

public class Win {
        private final String quit;

        public Win() {
            this.quit = "EXIT";
        }
        public String getQuit() {
            return quit;
        }
        public boolean isSelected() {
            return quit.equals("EXIT");
        }
}

