package tuozhan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("李亚鹏", "王菲");
		map.put("霍启刚", "郭晶晶");
		map.put("刘强东","章泽天");
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> entry: entrySet) {
			String husband = entry.getKey(); //获取到丈夫
			String wife = entry.getValue();
			System.out.println("丈夫: " + husband + ", 妻子: " + wife);
		}
	}
}
