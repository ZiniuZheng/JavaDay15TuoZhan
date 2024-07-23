package tuozhan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 需求：
 * 		(1)定义List集合，存入多个字符串
 * 		(2)删除集合元素字符串中包含0-9数字的字符串（只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串）
 * 		(3)然后利用迭代器遍历集合元素并输出
 */
public class Test2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("419开心玩");
		list.add("51去哪玩");
		list.add("61吃什么棒棒糖");
		list.add("都成年了还矫情");
		list.add("还是好好敲代码吧");
		list.add("324543");
		list.add("324543");
		
		for(int i=0;i<list.size();i++) {//遍历集合，拿到每一个字符串
			String s = list.get(i);
			char[] charArray = s.toCharArray();
			for(int j=0;j<charArray.length;j++) {
				char c = charArray[j];
				if(c >= '0' && c <= '9') {//有数字，就删除
					list.remove(i);
					i--;
					break;
				}
			}
		}
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String next = it.next();
			for(int i=0;i<next.length();i++) {
				char c = next.charAt(i);
				if(c >= '0' && c <= '9') {//有数字，就删除
					it.remove();
					break;
				}
			}
		}
	}
}
