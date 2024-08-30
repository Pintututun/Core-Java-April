package credit_card_type_program;

public class CardsOnOffer {
public static CardType getOfferedCard(Customer object)
{
	
if(object.getCreditPoints()>=100&&object.getCreditPoints()<=500)
	return new CardType(object,"Silver");
else if(object.getCreditPoints()>500&&object.getCreditPoints()<=1000)
	return new CardType(object,"Gold");
else if(object.getCreditPoints()>1000)
	return new CardType(object,"Platinum");
else 
	return new CardType(object,"EMI");
}
}
