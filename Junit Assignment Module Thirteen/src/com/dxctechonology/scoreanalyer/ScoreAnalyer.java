package com.dxctechonology.scoreanalyer;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyer {
	double avg = 0;
	double total = 0;
	public ScoreAnalyer() {
	}

	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public LinkedList<Integer> getRunsData() {
		return runsData;
	}

	public void setRunsData(LinkedList<Integer> runsData) {
		this.runsData = runsData;
	}

	public void addRunsToList (int runs) {
		runsData.add(runs);
	}

	public double calRunRate () {
		for(int i = 0; i < runsData.size(); i++) {
			total = total + runsData.get(i);
			avg = total / 50;
		}
		return avg;
	}

	public int lowestRun() {
		return Collections.min(runsData);
	}

	public void displayRuns(){
		for (Integer runs : runsData) {
			System.out.println(runs);
		}
	}
}
