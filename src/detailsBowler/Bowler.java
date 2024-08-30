package detailsBowler;

import java.util.Scanner;

public class Bowler {
private String name;
private int wickets;
private int matches;
private int balls_bowled;
private int runs_conceded;
public void setDetails()
{ 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name--");
	name=sc.nextLine();
	System.out.print("Enter the number of wickets--");
	wickets=sc.nextInt();
	System.out.print("Enter the number of matches--");
	matches=sc.nextInt();
	System.out.print("Enter the number of balls bowled--");
	balls_bowled=sc.nextInt();
	System.out.print("Enter the number of runs conceded--");
	runs_conceded=sc.nextInt();
	sc.close();
	
}
public String computeBowlingAverage()
{
	if(wickets<0||matches<0||balls_bowled<0||runs_conceded<0)
	{
		return "Error";
	}
	else if((runs_conceded<0||balls_bowled<0)&&matches==0)return "Error";
	else if(runs_conceded>0&&matches>0)
	{
		return this.showStatistics();
	}
	else return "Error";
}
public String showStatistics()
{
	double bowling_average=runs_conceded/wickets;
	return ""+bowling_average;
}
public String toString()
{
	return "Name="+name+"\nWickets="+wickets+"\nMatches="+matches+"\nBalls bowled="+balls_bowled+"\nRuns conceded"+runs_conceded+"";
}

}
