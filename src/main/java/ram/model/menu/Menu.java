package ram.model.menu;

import ram.model.Music;

import java.util.Arrays;
import java.util.List;

public class Menu {

    private final List<String> entries;
    private int currentEntry = 0;

    public Menu() {
        this.entries = Arrays.asList("START","CONTROLS","EXIT");
    }

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {return currentEntry == i;}

    public boolean isSelectedControls() {
        return isSelected(1);
    }
    public boolean isSelectedExit() {
        return isSelected(2);
    }

    public boolean isSelectedStart() {
        return isSelected(0);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }

    public int getEntry(){return this.currentEntry;}

    public void setEntry(int e){this.currentEntry= e;}

}
