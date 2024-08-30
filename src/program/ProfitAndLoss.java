package program;

public class ProfitAndLoss {
public static void main(String [] args)
{
	double costPrice=Double.parseDouble(args[0]);
	double sellingPrice=Double.parseDouble(args[1]);
	if(costPrice>sellingPrice)
	{
		double loss=costPrice-sellingPrice;
		double lossPercent=(loss/costPrice)*100;
		System.out.println("LOSS="+loss+"AND LOSS PERCENTAGE="+lossPercent);
	}
	else 
	{
		double profit=sellingPrice-costPrice;
		double profitPercent=(profit/costPrice)*100;
		System.out.println("PROFIT="+profit+"AND PROFIT PERCENTAGE="+profitPercent);
		
	}
	
	
}
}
