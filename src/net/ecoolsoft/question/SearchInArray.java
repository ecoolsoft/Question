package net.ecoolsoft.question;

public class SearchInArray {
	/**
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
	 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 * @param data 数组
	 * @param key 要查找的数字
	 * @return	找到返回true，未找到返回false
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
