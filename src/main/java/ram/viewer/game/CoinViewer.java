package ram.viewer.game;

import ram.gui.GUI;
import ram.model.Elements.Coin;

public class CoinViewer implements ElementViewer<Coin> {

    @Override
    public void draw(Coin coin, GUI gui) {
        gui.drawCoin(coin.getPosition());
    }

}
