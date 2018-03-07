package bridge;

public class Morsecode {

	MorseCodeFunc morseCodeFunc;
	
	
	public Morsecode(MorseCodeFunc morseCodeFunc) {
		super();
		this.morseCodeFunc = morseCodeFunc;
	}

	public void setMorseCodeFunc(MorseCodeFunc morseCodeFunc) {
		this.morseCodeFunc = morseCodeFunc;
	}
	
	public void dot() {
		morseCodeFunc.dot();
//		System.out.print("*");
		
	}
	public void dash() {
		morseCodeFunc.dash();
//		System.out.print("-");
	}
	public void space() {
		morseCodeFunc.space();
//		System.out.print(" ");
	}
}
