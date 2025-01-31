package SOLID_Principles.S_and_O;

public class Invoice {
	private Pen p;

	public Invoice(Pen p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	public int CreateInvoice() {
		return (int) (p.price * (1.18) + 2);
	}


}
