package Exrcs4_4;

public class GrannySmith extends Apple {
	private String colour;
	private String taste;
	
	public GrannySmith(String name, int q, double p, String c, String t) {
		super(name, q, p);
		this.colour = c;
		this.taste = t;
	}

	
	public String GrannyColour() {
		return this.colour;
	}
	
	public String GrannyTaste() {
		return this.taste;
		
	}
	
	public double CalPrice() {
		return super.price * super.quantity;
	
	}
	
	public String toString() {
		return "Granny Smith is good for our health!";
	}
}
