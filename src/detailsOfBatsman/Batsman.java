package detailsOfBatsman;

import java.text.DecimalFormat;

public class Batsman {
	String name;
	int runs;
	int matches;
	float batting_avg;

	public void setDetails(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		this.computeBattingAverage();
	}

	public void computeBattingAverage() {
		if (runs < 0 || matches < 0)
			System.err.println("Error");
		else if (runs == 0 || matches == 0)
			System.err.println("Error");
		else {
			batting_avg = runs / (float) matches;
			this.getStatistics();
		}
	}

	public void getStatistics() {
		System.out.println("================================Batsman Details================================");
		System.out.println("The Batsman name--" + name);
		System.out.println("The Batsman runs--" + runs);
		System.out.println("The Batsman matches--" + matches);
		DecimalFormat df = new DecimalFormat("#.0000");
		String avg = df.format((double) (batting_avg));
		System.out.println("The Batsman Batting Average " +avg );
	}
}
