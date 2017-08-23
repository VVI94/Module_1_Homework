package Phones;

public class LetsMakeCalls {

	public static void main(String[] args) {
		GSM vvi = new GSM();
		GSM inu = new GSM();
		
		vvi.model = "Sony Xperia Xperformance";
		
		inu.model = "Samsung Galaxy S4";
		
		vvi.insertSimCard("0889603880");
		inu.insertSimCard("0883390933");
		
		vvi.call(inu,55);
		
		double price = vvi.getSumForCall();
		System.out.println(price);
		
		vvi.printInfoForTheLastOutgoingCall();
		inu.printInfoForTheLastIncomingCall();

	}

}
