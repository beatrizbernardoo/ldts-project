package l04gr07.view.ElementsView;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import l04gr07.model.Game.FieldElements.Fruit;

public class FruitView extends ElementsViewer{
    private Fruit fruit;
    public FruitView(Fruit fruit, TextGraphics graphics) {
        super(graphics);
        this.fruit = fruit;
    }
    public Fruit getFruit() {return fruit;}

    @Override
    public void draw() {
        graphics.setForegroundColor(TextColor.Factory.fromString("#800080"));
        graphics.setBackgroundColor(TextColor.Factory.fromString("#a6bfe1"));
        graphics.putString(new TerminalPosition(fruit.getPosition().getx(), fruit.getPosition().gety()), "@");
    }
}
