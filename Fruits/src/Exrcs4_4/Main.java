package Exrcs4_4;

public class Main {

	public static void main(String[] args) {
		Fruit F = new Fruit("Fruit");
		System.out.println();
		
		System.out.println(">>>>>>>>>> APPLE <<<<<<<<<<");
		Apple A = new Apple("Apple",6 ,3.00);
		System.out.println(A+"\n");
		
		System.out.println(">>>>>>>>>> GRANNY SMITH <<<<<<<<<<");
		GrannySmith GS = new GrannySmith("Granny Smith", 3, 5.99, "Green", "Sour");
		System.out.println(GS+"\n");
		
		System.out.println(">>>>>>>>>> FUJI APPLE <<<<<<<<<<");
		FujiApple FA = new FujiApple("Fuji Apple", 10, 4.00, "Red", "Sweet");
		System.out.println("Color: "+FA.getColour());
		System.out.println("Size: "+FA.getSize());
		System.out.println("Taste: "+FA.getTaste());
		System.out.println(FA+"\n");					
		
		System.out.println(">>>>>>>>> GRAPE <<<<<<<<<<");
		Grape G = new Grape("Grape", 10.0, 'L');
		System.out.println(G);
	}

}
