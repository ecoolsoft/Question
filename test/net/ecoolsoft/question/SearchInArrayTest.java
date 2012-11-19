package net.ecoolsoft.question;

import junit.framework.Assert;

import org.junit.Test;

public class SearchInArrayTest {
	@Test
	public void findInArrayFailedTest() {
		int[][] data = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
		int key = 14;
		SearchInArray sArray = new SearchInArray();
		boolean result = sArray.findInArray(data, key);
		Assert.assertFalse(result);
	}
	
	@Test
	public void findInArrayTest() {
		int[][] data = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
		int key = 11;
		SearchInArray sArray = new SearchInArray();
		boolean result = sArray.findInArray(data, key);
		Assert.assertTrue(result);
	}
}
