package credit_card_type_program;

public class CardType {
private Customer customer;
private String cardType;

public CardType(Customer customer, String cardType) {
	super();
	this.customer = customer;
	this.cardType = cardType;
}

@Override
public String toString() {
	return "" + customer + " is Eligible for " + cardType + " Card";
}

}
