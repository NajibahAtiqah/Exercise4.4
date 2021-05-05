package Exrcs4_4;

public class Apple extends Fruit {
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) {//constructor with 3 arguments
		super(name);
		this.price=p;
		this.quantity=q;
				
		if(quantity <= 3) {
			TotalPrice();
			System.out.println("Fruit: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: " +"RM "+price);
			System.out.println("Total Paid: "+"RM "+TotalPrice());
		}
		else if(quantity >3 && quantity <= 10) {
			double np= 2.50;
			TotalPrice(np);
			System.out.println("Fruit: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: " +"RM "+np);
			System.out.println("Total Paid: "+"RM "+TotalPrice(np));
		}
		else {
			double np=2.00;
			double dd=0.1;
			totalPrice(np,dd);
			System.out.println("Type: "+name);
			System.out.println("Quantity: "+quantity);
			System.out.println("Price/unit: "+"RM "+np);
			System.out.println("Discount Received: "+dd*100+"%");
			System.out.println("Total Paid: RM "+totalPrice(np,dd));
		}
		
	}
	
	public double TotalPrice() {
		return this.price*this.quantity;
	}
	
	public double TotalPrice(double np) {
		return np*this.quantity;
	}
	
	public double totalPrice(double np,double dd) {
		return (np*quantity)*dd;
	}
	
	public String toString() {
		return "An Apple is good for our health!";
	}
}
