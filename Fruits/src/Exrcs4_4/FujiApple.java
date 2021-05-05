package Exrcs4_4;

public class FujiApple extends Apple{
	private String colour;
	private String taste;
	private char size;
	
	public FujiApple(String name, int q, double p, String c, String t ) {
		super(name, q, p);
		colour=c;
		taste=t;

	}
	
	public String getColour() {
		return colour;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public char getSize() {
		return size='L';
	}

	public String toString() {
		return "Fuji Apple is good for our health !";
	}
}
