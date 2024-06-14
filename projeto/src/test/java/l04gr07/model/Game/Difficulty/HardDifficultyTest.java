package l04gr07.model.Game.Difficulty;

import l04gr07.model.Game.Difficulty.HardDifficulty;
import l04gr07.model.Game.Field.Field;
import l04gr07.model.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HardDifficultyTest {
    @Test
    public void testCreateField() {
        HardDifficulty hardDifficulty = new HardDifficulty();
        Field field = hardDifficulty.createField();
        assertNotNull(field);
        assertEquals(2, field.getIceCube().getPosition().getx());
        assertEquals(2, field.getIceCube().getPosition().gety());
        Position p1Position= field.getPlayer1().getPosition();
        assertNotNull(p1Position);
        assertEquals(5, p1Position.getx());
        assertEquals(6, p1Position.gety());
        Position p2Pos = field.getPlayer2().getPosition();
        assertNotNull(p2Pos);
        assertEquals(7, p2Pos.getx());
        assertEquals(6, p2Pos.gety());
    }
}
