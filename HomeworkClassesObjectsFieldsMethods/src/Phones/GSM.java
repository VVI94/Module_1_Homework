package Phones;

public class GSM {
	String model;	
	CallHistory history = new CallHistory();
	SimCard simCard;
	

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			simMobileNumber = simMobileNumber.trim();
			
			if (simMobileNumber.substring(0, 2).equals("08") && simMobileNumber.length() == 10) {
				this.simCard = new SimCard();
				this.simCard.simMobileNumber = simMobileNumber;
				this.simCard.hasSimCard = true;
			}
		} else {
			System.out.println("Невалиден номер на СИМ картата");
		}
	}

	void removeSimCard() {
		this.simCard.hasSimCard = false;
		this.simCard.simMobileNumber = "";
	}

	void call(GSM reciever, int duration) {

		if (isValidCall(reciever, duration)) {
			Call call = new Call();
			call.duration = duration;
			call.reciever = reciever;
			call.caller = this;
			
			
			history.lastOutgoingCall = call;
			history.lastIncomingCall = call;
			history.outgoingCallsDuration += duration;

			this.history.lastOutgoingCall = call;
			reciever.history.lastIncomingCall = call;
			this.history.outgoingCallsDuration += duration;

		}
	}

	private boolean isValidCall(GSM reciever, int duration) {
		return (reciever != null) && (duration > 0 && duration < 60)
				&& (reciever.simCard.hasSimCard && this.simCard.hasSimCard)
				&& (!(reciever.simCard.simMobileNumber.equals(this.simCard.simMobileNumber)));

	}

	float getSumForCall() {
		return (this.history.outgoingCallsDuration * Call.priceForAMinute); // *new Call().priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if(this.history.lastOutgoingCall != null) {
		System.out.println("Последно изходящо повикване: ");
		System.out.println("От " + this.history.lastOutgoingCall.caller.simCard.simMobileNumber);
		System.out.println("Kъм " + this.history.lastOutgoingCall.reciever.simCard.simMobileNumber);
		System.out.println("Продължителност: " + this.history.lastOutgoingCall.duration);
		} else {
			System.out.println("Няма последно обаждане.");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (this.history.lastIncomingCall !=null) {	
		System.out.println("Последно входящо повикване: ");
		System.out.println("От " + this.history.lastIncomingCall.caller.simCard.simMobileNumber);
		System.out.println("Kъм " + this.history.lastIncomingCall.reciever.simCard.simMobileNumber);
		System.out.println("Продължителност " + history.lastIncomingCall.duration);
		} else {
			System.out.println("Няма последно обаждане.");
		}
	}

}
