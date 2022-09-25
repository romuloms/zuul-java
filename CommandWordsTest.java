import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommandWordsTest {
  @Test
  public void testGetCommandWord() {
    // Command cmd = new Command(CommandWord.GO, "south");
    CommandWords cmdWords = new CommandWords();

    assertEquals(CommandWord.GO, cmdWords.getCommandWord("go"));
  }

  @Test
  public void testIsCommand() {
    CommandWords cmdWords = new CommandWords();

    assertEquals(true, cmdWords.isCommand("go"));
  }

}
