package tuozhan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/*
 * 需求：
 * 		(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * 		(2)然后利用迭代器和增强for循环分别遍历集合元素并输出
 * 		(3)如：15 18 20 40 46 60 65 70 75 91
 */
public class Test1 {
	
	public static void main(String[] args) {
		// 1.创建随机数对象
		Random random = new Random();
		//创建集合对象
		List<Integer> list = new ArrayList<Integer>();
		
		//为什么用while循环，因为不知道循环次数
		while(list.size() != 10) {
			int num = random.nextInt(100) + 1;
			//如果集合中不存在才添加到集合中
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		
		//用迭代器遍历
		//1.获取迭代器对象
		Iterator<Integer> it = list.iterator();
		
		//判断副本中下一个是否存在
		while(it.hasNext()) {
			//走到这里说明存在
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		Collections.sort(list);
		
		for(Integer integer: list) {
			System.out.print(integer + " ");
		}
	}
}
	
	/*
	public static void sort(List<Integer> list) {
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-1-i;j++) {
				//取出左边
				Integer left = list.get(j);
				//取出右边
				Integer right = list.get(j + 1);
				//如果左边比右边大，就交换位置
				if(left > right) {
					int temp = left;
					left = right;
					right = temp;
					list.set(j,  right);
					list.set(j+1, right);
				}
			}
		}
	}
	
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {//为什么-1
			for(int j=0;j<arr.length-1-i;j++) {//为什么-i
				int k = arr[j]; //取出左边的
				int l = arr[j + 1];
				
				if(k > l) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
*/
