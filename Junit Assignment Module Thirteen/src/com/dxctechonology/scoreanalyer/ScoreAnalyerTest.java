package com.dxctechonology.scoreanalyer;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScoreAnalyerTest {
	private static ScoreAnalyer analyer;

	@BeforeEach
	void setUp() throws Exception {
		analyer = new ScoreAnalyer();
	}

	@AfterEach
	void tearDown() throws Exception {
		analyer = null;
	}

	@Test
	@DisplayName("Check Linked list and its size")
	void testScoreAnalyer() {
		boolean result = false;
		if (analyer != null) 
			if (analyer.getRunsData() != null) 
				if (analyer.getRunsData().size() == 0)
					result = true;
		assertTrue(result);
	}

	@Test
	@DisplayName("Adding only one batsman runs and testing")
	void testAddRunsToList() {
		boolean result = false;
		analyer.addRunsToList(12);
		if(analyer.getRunsData().size() == 1)
			if (analyer.getRunsData().contains(12))
				result = true;
		assertTrue(result);
	}

	@Test
	@DisplayName("Adding only three batsman runs and testing")
	void testAddThreeRunsToList() {
		boolean result = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(67);
		analyer.addRunsToList(12);
		analyer.addRunsToList(34);
		analyer.addRunsToList(67);
		if(analyer.getRunsData().size() == 3)
			if (analyer.getRunsData().containsAll(list))
				result = true;
		assertTrue(result);
	}

	@Test
	@DisplayName("Checking Run Rate")
	void testCalRunRate() {
		analyer.addRunsToList(12);
		analyer.addRunsToList(45);
		analyer.addRunsToList(10);
		assertEquals(1.34, analyer.calRunRate());
	}

	@Test
	@DisplayName("checking for the lowest run scored by batsman")
	void testLowestRun() {
		analyer.addRunsToList(12);
		analyer.addRunsToList(45);
		analyer.addRunsToList(10);
		assertEquals(10, analyer.lowestRun());
	}

}
