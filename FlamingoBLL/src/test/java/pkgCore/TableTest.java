package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eSuit;
import pkgException.DeckException;

public class TableTest {

	@Test
	public void TestTable() {
	    
	    Table table = new Table();

        Player player1 = new Player("Mike", 1005);
        Player player2 = new Player("Jobs", 1008);

        table.AddPlayerToTable(player1);
        table.AddPlayerToTable(player2);
        
        Player getPlayer = table.GetPlayerFromTable(player1);
        assertEquals(getPlayer.getPlayerID(), player1.getPlayerID());
        
        table.RemovePlayerFromTable(player2);
	}

}
