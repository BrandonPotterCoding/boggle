import java.util.Random;

public class Die {

	private char side1;
	private char side2;
	private char side3;
	private char side4;
	private char side5;
	private char side6;
	private boolean hasQ=false;
	private int index;
	
	public Die(String s1) {
//		if(s1.contains("Q")) {
//			hasQ=true;
//			index=s1.indexOf('Q');
//		}
		side1=s1.charAt(0);
		side2=s1.charAt(1);
		side3=s1.charAt(2);
		side4=s1.charAt(3);
		side5=s1.charAt(4);
		side6=s1.charAt(5);
//		if(hasQ) {
//			switch(index) {
//			case(0):{
//				side1+="u";
//				break;
//				}
//			case(1):{
//				side2+="u";
//				break;
//			}
//			case(2):{
//				side3+="u";
//				break;
//			}
//			case(3):{
//				side4+="u";
//				break;
//			}
//			case(4):{
//				side5+="u";
//				break;
//			}
//			case(5):{
//				side6+="u";
//				break;
//			}
//			default:
//
//			}
//		}
	}
	
	public char dieSide() {
		Random rand=new Random();
		int randInt= rand.nextInt(6);
		switch(randInt) {
		case(0):
			return side1;
		case(1):
			return side2;
		case(2):
			return side3;
		case(3):
			return side4;
		case(4):
			return side5;
		case(5):
			return side6;
		}
		return '@';
	}
}
