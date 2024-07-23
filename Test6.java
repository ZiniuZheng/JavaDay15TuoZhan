package tuozhan;

import java.util.HashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		int[] arr = {12,34,45,7512,12,34,23,45}; //统计出，每个数出现的次数
		//准备Map集合，来存储键值对关系
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//1.遍历数组
		for(int i=0;i<arr.length;i++) {
			//取出每一个元素
			int j = arr[i];
			
			//首先判断我有没有存储过这个键
			boolean containsKey = map.containsKey(j);
			if(!containsKey) {//不包含，说明是第一次出现，应该存这个键，后面值1
				map.put(j,  1);
			}else {//包含，说明已经出现过了，应该取出原来的键对应的值，然后对值+1操作后，再存储回去
				Integer integer = map.get(j)+1;
				map.put(j, integer);
			}
		}
		
		System.out.println(map);
	}
}
