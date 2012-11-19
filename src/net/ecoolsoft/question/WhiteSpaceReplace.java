package net.ecoolsoft.question;

public class WhiteSpaceReplace {
	/**
	 * 将字符数组中的空格替换成“%20”
	 * 模拟C++，认为数组长度足够
	 * @param input
	 */
	public void replaceWhiteSpace(char[] input) {
		if(input == null || input.length == 0) {
			return;
		}
		//遍历数组，查找空格个数
		int num = 0;
		int i = 0;
		for(i=0; i<input.length && input[i] != '\u0000'; i++) {
			if(input[i] == ' ') {
				++num;
			}
		}
		//两个指针，分别指向原字符数组末尾和新字符数组末尾
		int indexEnd = i-1;
		int indexNewEnd = indexEnd + num * 2;
		for(int j=indexEnd; j>=0; j--) {
			/*if(input[j] == ' ') {
				for(int k=indexEnd; k>j; k--) {
					input[indexNewEnd--] = input[k];
				}
				input[indexNewEnd--] = '0';
				input[indexNewEnd--] = '2';
				input[indexNewEnd--] = '%';
				indexEnd = j-1;
			}*/
			if(input[j] != ' ') {
				input[indexNewEnd--] = input[j];
			} else {
				input[indexNewEnd--] = '0';
				input[indexNewEnd--] = '2';
				input[indexNewEnd--] = '%';
				indexEnd = j-1;
			}
		}
		output(input);
	}
	
	/**
	 * 输出字符数组
	 * @param input
	 */
	public void output(char[] input) {
		System.out.println(input);	
	}
}
