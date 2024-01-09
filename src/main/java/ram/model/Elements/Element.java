package ram.model.Elements;

import ram.model.Position;

public class Element {

    private Position position;
    public Position getPosition(){return this.position;}
    public Element(int x,int y){this.position = new Position(x,y);}

    public void setPosition(Position position){this.position = position;}


}

