package week4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        assertEquals("They should be the same",p1.toString(),p2.toString());
        assertEquals("max health",p1.getMaxHP(),p2.getMaxHP());
        assertEquals("health ",p1.getHP(),p2.getHP());
        assertEquals("damage",p1.getDamageDealt(),p2.getDamageDealt());
    }
}
