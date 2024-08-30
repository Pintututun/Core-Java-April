package has_a_relationpart_2_April21;

public class Order {
private int orderId;
private String itemName;
private double itemPrice;
public Order(int orderId, String itemName, double itemPrice) {
	super();
	this.orderId = orderId;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
}
@Override
public String toString() {
	return "\nOrder \n--------\nOrderId=" + orderId + "\nItemName=" + itemName + "\nItemPrice=" + itemPrice + "";
}

}
