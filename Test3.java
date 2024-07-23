package tuozhan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("419好玩吗");
		set.add("你猜");
		set.add("猜你妹");
		set.add("猜你妹");
		
		String[] array = set.toArray(new String[set.size()]);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String next = it.next();
		}
		
		Set<Demo> set1 = new HashSet<Demo>();
		
		Demo demo = new Demo(24, 12);
		Demo demo2 = new Demo(24, 12);
		
		set1.add(demo);
		
		boolean contains = set1.contains(demo2); //如果只走Equals应该返回true，如果走了HashCode就应该返回false
		System.out.println(contains);
	}
}

class Demo{
	int age;
	int number;
	public Demo(int age, int number) {
		super();
		this.age = age;
		this.number = number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return age == other.age && number == other.number;
	}
	
}
