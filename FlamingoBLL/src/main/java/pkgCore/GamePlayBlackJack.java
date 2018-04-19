package pkgCore;

import java.util.HashMap;
import java.util.UUID;
import pkgEnum.eGameType ;

public class GamePlayBlackJack extends GamePlay {

	private HashMap<UUID, HandBlackJack> hmGameHands = new HashMap<UUID, HandBlackJack>();
	
	public GamePlayBlackJack(Table t) {
		super(eGameType.BLACKJACK);
		this.setT(t);
		
		t.CreateDeck(pkgEnum.eGameType.BLACKJACK);		
		
		this.AddPlayersToGame(t.GetTable());
		
		for (Player pAdd: t.GetTable())
		{
			hmGameHands.put(pAdd.getPlayerID(), new HandBlackJack());
		}	
	}
	
	
	

}
