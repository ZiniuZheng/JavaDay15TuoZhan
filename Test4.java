package tuozhan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//添加元素，修改值的功能
		map.put("姓名", "林青霞");
		map.put("年龄", "25岁");
		map.put("身高", "160");
		String put = map.put("姓名", "潘长江");
		System.out.println(put);
		
		//删除功能
		String remove = map.remove("年龄"); //删除指定的键对应的关系，并且将此对应的值返回
		System.out.println(map);
		//查询功能
		String string = map.get("姓名");
		System.out.println(string);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//拿到所有的值
		Collection<String> values = map.values();
		for(String string2: values) {
			System.out.println(string2);
		}
		
		//第一种遍历Map的方法
		//拿到丈夫
		Set<String> keySet2 = map.keySet();
		
		//通过遍历丈夫，拿到每一个丈夫，让每一个丈夫找媳妇
		for(String husband: keySet2) {
			String wife = map.get(husband);
			System.out.println("丈夫: " + husband + ", 老婆: " + wife);
		}
	}
}
