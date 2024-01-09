package ram.gui;


import ram.model.Position;


import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;
    void drawText(Position position, String text, String color);
    void clear();
    void refresh() throws IOException;
    void close() throws IOException;
    void drawZombie(Position position);
    void drawSurvivor(Position position);
    void drawWall(Position position);
    void drawCoin(Position position);
    void drawTree(Position position);
    void drawBush(Position position);
    void drawNuke(Position position);
    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
}

