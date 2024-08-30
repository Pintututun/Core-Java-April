package details_of_Pancard;

public class PanCard {
private String panId;

public PanCard() {
	super();
	this.panId = "ABIER123458";
	Person pe=new Person(this);
}
public void display()
{
	System.out.println("PanId:"+panId);
}


}
