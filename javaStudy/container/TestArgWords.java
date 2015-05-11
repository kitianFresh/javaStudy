import java.util.*;
public class TestArgWords {
	public static int one = 1;
	public static void main(String args[]){
		/*
		Map m = new HashMap();
		for(int i=0;i<args.length;i++){
			int freq = (Integer)m.get(args[i]) == null ? 0 :(Integer)m.get(args[i]);
			m.put(args[i],freq==0 ? one : freq + 1);
		}
		System.out.println(m);
		*/
		
		/*****
		泛型的产生主要是因为类型不明确
		1.装入集合的类型都被当做Object对待，从而失去自己的实际类型
		2.从集合中取出时往往需要转型，效率低，易产生错误
		泛型使用,直接指明了对象类型
		1.在定义集合的同时定义集合对象的类型
		2.可在定义Collection是制定，也可以在循环时用Iterator制定本
		****/
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(int i=0;i<args.length;i++){
			int freq = m.get(args[i]) == null ? 0 :m.get(args[i]);
			m.put(args[i],freq==0 ? one : freq + 1);
		}
		System.out.println(m);
	}
}