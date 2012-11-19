package net.ecoolsoft.question;

public class WhiteSpaceReplace {
	/**
	 * ���ַ������еĿո��滻�ɡ�%20��
	 * ģ��C++����Ϊ���鳤���㹻
	 * @param input
	 */
	public void replaceWhiteSpace(char[] input) {
		if(input == null || input.length == 0) {
			return;
		}
		//�������飬���ҿո����
		int num = 0;
		int i = 0;
		for(i=0; i<input.length && input[i] != '\u0000'; i++) {
			if(input[i] == ' ') {
				++num;
			}
		}
		//����ָ�룬�ֱ�ָ��ԭ�ַ�����ĩβ�����ַ�����ĩβ
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
	 * ����ַ�����
	 * @param input
	 */
	public void output(char[] input) {
		System.out.println(input);	
	}
}
