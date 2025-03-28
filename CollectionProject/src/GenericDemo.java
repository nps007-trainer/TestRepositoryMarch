class GenericClass<T>{
	T x,y ;
	public void print() {
		System.out.println(x);
		System.out.println(y);
	}
}

class GenericPair<T,U>{
	T x;
	U y;
}

public class GenericDemo {

	public static void main(String[] args) {
GenericClass<Integer> objInt=new GenericClass();
objInt.x=12;
objInt.y=3;

GenericClass<String> objStr=new GenericClass();
objStr.x="Ashish";
objStr.y="Y";

GenericPair<Integer,String> obj1=new GenericPair();
obj1.x=12;
obj1.y="Ashish";
	}

}
