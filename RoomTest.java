import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTest {
  // @Test
  // public void testGetExit() {

  // }

  @Test
  public void testGetLongDescription() {
    Room room = new Room("no laboratorio");

    assertEquals("You are no laboratorio.\n" + "Exits:",
     room.getLongDescription());
  }

  @Test
  public void testGetShortDescription() {
    Room room = new Room("no laboratorio");

    assertEquals("no laboratorio", room.getShortDescription());
  }

  // @Test
  // public void testSetExit() {
    
  // }
}
