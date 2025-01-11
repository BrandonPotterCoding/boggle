import java.util.Random;
import java.util.ArrayList;

public class Diebag {
	
	private ArrayList<Die> currentset;
	
	public Diebag() {
		setDiebag();
	}
	
	public Die drawDie() {
		if(currentset.isEmpty()) {
			System.out.println("Error: no dice left");
			return null;
		}
		Random rand= new Random();
		int randInt= rand.nextInt(currentset.size());
		Die pulled= currentset.get(randInt);
		currentset.remove(randInt);
		return pulled;		
	}

	public void resetDieBag() {
		setDiebag();
	}


	private void setDiebag() {
		
		currentset= new ArrayList<Die>();
		currentset.add(new Die("aaafrs".toUpperCase()));
		currentset.add(new Die("aaeeee".toUpperCase()));
		currentset.add(new Die("aafirs".toUpperCase()));
		currentset.add(new Die("adennn".toUpperCase()));
		currentset.add(new Die("aeeeem".toUpperCase()));
		currentset.add(new Die("aeegmu".toUpperCase()));
		currentset.add(new Die("aegmnn".toUpperCase()));
		currentset.add(new Die("afirsy".toUpperCase()));
		currentset.add(new Die("bjkqxz".toUpperCase()));
		currentset.add(new Die("ccenst".toUpperCase()));
		currentset.add(new Die("ceiilt".toUpperCase()));
		currentset.add(new Die("ceilpt".toUpperCase()));
		currentset.add(new Die("ceipst".toUpperCase()));
		currentset.add(new Die("ddhnot".toUpperCase()));
		currentset.add(new Die("dhhlor".toUpperCase()));
		currentset.add(new Die("dhlnor".toUpperCase()));
		currentset.add(new Die("dhlnor".toUpperCase()));
		currentset.add(new Die("eiiitt".toUpperCase()));
		currentset.add(new Die("emottt".toUpperCase()));
		currentset.add(new Die("ensssu".toUpperCase()));
		currentset.add(new Die("fiprsy".toUpperCase()));
		currentset.add(new Die("gorrvw".toUpperCase()));
		currentset.add(new Die("iprrry".toUpperCase()));
		currentset.add(new Die("nootuw".toUpperCase()));
		currentset.add(new Die("ooottu".toUpperCase()));
		
	}
}
	

