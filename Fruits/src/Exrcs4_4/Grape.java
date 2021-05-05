package Exrcs4_4;

public class Grape extends Fruit{
	private double price;
	private char size;
	
	public Grape(String name, double p, char s) {
		super(name);
		this.price = p;
		this.size = s;
		
		switch (s) {
		case 'S':
			System.out.println("The price for "+size + " grape is" + " RM " + TotalPrice());
			break;
		case 'M':
			System.out.println("The price for "+size + " grape is" + " RM " + TotalPrice(15.0));
			break;
		case 'L':
			System.out.println("The price for "+size + " grape is" + " RM " + TotalPrice(25.0));
			break;

		}
}
	
	public double TotalPrice() {
		return price;
	}
	
	public double TotalPrice (double p) {
		return p;
	}
}

