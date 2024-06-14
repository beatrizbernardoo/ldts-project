package l04gr07.view.ElementsView;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import l04gr07.model.Game.FieldElements.IceCube;
import l04gr07.model.Game.FieldElements.IceShot;

public class IceCubeView extends ElementsViewer{
    private IceCube iceCube;
    public IceCubeView(IceCube iceCube, TextGraphics graphics) {
        super(graphics);
        this.iceCube = iceCube;
    }

    public IceCube getIceCube(){return iceCube;}
    @Override
    public void draw() {
        graphics.setForegroundColor(TextColor.Factory.fromString("#33abf9"));
        graphics.setBackgroundColor(TextColor.Factory.fromString("#a6bfe1"));
        graphics.putString(new TerminalPosition(iceCube.getPosition().getx(), iceCube.getPosition().gety()), "I");
    }
}
