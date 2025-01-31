package SOLID_Principles.S_and_O;

public class Pen_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		Invoice i = new Invoice(p);
		System.out.println(i.CreateInvoice());

	}

}
