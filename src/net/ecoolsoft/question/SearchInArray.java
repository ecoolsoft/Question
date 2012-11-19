package net.ecoolsoft.question;

public class SearchInArray {
	/**
	 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
	 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
	 * ����������һ����ά�����һ���������ж��������Ƿ��и�������
	 * @param data ����
	 * @param key Ҫ���ҵ�����
	 * @return	�ҵ�����true��δ�ҵ�����false
	 */
	public boolean findInArray(int[][] data, int key) {
		if(data == null || data.length == 0) {
			return false;
		}
		int i = 0;
		int j = data[0].length-1;
		while(i<data.length && j>=0) {
			if(data[i][j] == key) {
				return true;
			} else if(data[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}
}
