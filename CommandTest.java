import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommandTest {
  @Test
  public void testGetCommandWord() {
    Command cmd = new Command(CommandWord.GO, "south");
    // cmd.getCommandWord();
    assertEquals(CommandWord.GO, cmd.getCommandWord());
  }

  @Test
  public void testGetSecondWord() {
    Command cmd = new Command(CommandWord.GO, "south");
    // cmd.getCommandWord();
    assertEquals("south", cmd.getSecondWord());
  }

  @Test
  public void testHasSecondWord() {
    Command cmd = new Command(CommandWord.GO, "south");
    assertEquals(true, cmd.hasSecondWord());
  }

  @Test
  public void testIsUnknown() {
    Command cmd = new Command(CommandWord.GO, "south");
    assertEquals(false, cmd.isUnknown());
  }
}
