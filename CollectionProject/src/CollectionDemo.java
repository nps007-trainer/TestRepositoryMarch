
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudentName().compareTo(o2.getStudentName());
	}
	
}


public class CollectionDemo {

	public static  int getHigherMarks(HashMap<String, Integer> map) {
		int g=0;
		for(Entry<String, Integer> m: map.entrySet()) {
			if(m.getValue()>g) {
				g=m.getValue();
			}
		}
		return g;
	}
	public static void main(String[] args) {
	
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		map1.put("Satej", 45);
		map1.put("Avinash", 56);
		map1.put("Pravin", 52);
		map1.put("Rishabh",65);
		
		System.out.println(map1);
	int marks=	getHigherMarks(map1);
		for(Entry<String, Integer> m: map1.entrySet()) {
			if(m.getValue()==marks)
			System.out.println(m.getKey() + ":"+m.getValue() );
		}
	
	}

}
