package SOLID_Principles.S_and_O;

public class Client_SendNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		Invoice i = new Invoice(p);
		SendNotification s = new Gmail_Notification();
		s.Send_Message(i);
		SendNotification s1 = new Send_SMS();
		s1.Send_Message(i);
	}

}
