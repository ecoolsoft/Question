package net.ecoolsoft.question;

import junit.framework.Assert;

import org.junit.Test;

public class WhiteSpaceReplaceTest {
	
	@Test
	public void replaceWhiteSpaceTest() {
		String str = "Hello World, OK!";
		char[] result = replace(str);
		char[] expected = "Hello%20World,%20OK!".toCharArray();
		Assert.assertEquals(String.valueOf(expected).trim(), String.valueOf(result).trim());
	}
	
	@Test
	public void eplaceWhiteSpaceStartTest() {
		String str = " Hello World, OK! ";
		char[] result = replace(str);
		char[] expected = "%20Hello%20World,%20OK!%20".toCharArray();
		Assert.assertEquals(String.valueOf(expected).trim(), String.valueOf(result).trim());
	}
	
	@Test
	public void eplaceWhiteSpaceAllSpaceTest() {
		String str = "     ";
		char[] result = replace(str);
		char[] expected = "%20%20%20%20%20".toCharArray();
		Assert.assertEquals(String.valueOf(expected).trim(), String.valueOf(result).trim());
	}
	
	@Test
	public void eplaceWhiteSpaceNullTest() {
		String str = null;
		char[] result = replace(str);
		char[] expected = null;
		Assert.assertEquals(expected, result);
	}
	
	private char[] replace(String str) {
		char[] input = null;
		if(str != null) {
			input = new char[str.length()*3];
			for(int i=0; i<str.length(); i++) {
				input[i] = str.charAt(i);
			}
		}
		WhiteSpaceReplace wsr = new WhiteSpaceReplace();
		wsr.replaceWhiteSpace(input);
		return input;
	}
}
