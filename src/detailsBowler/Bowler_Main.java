package detailsBowler;

import java.util.Scanner;

public class Bowler_Main {
public static void main(String[] args) {
	Bowler obj=new Bowler();
	obj.setDetails();
	String bowling_avg =obj.computeBowlingAverage();
	System.out.println("======================================================================");
	System.out.println(obj);
	System.out.println("Bowling Average="+bowling_avg);
}
}
