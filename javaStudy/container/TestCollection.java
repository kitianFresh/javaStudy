import java.util.*;
public class TestCollection {
	public static void main(String args[]){
		/*
		Collection c = new ArrayList();
		c.add("hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(100));
		System.out.println(c);
		System.out.println(c.remove(new Name("f1","l1")));//�������дequals�������ͻ����false.remove���������equals
		System.out.println(c);
		*/
		Collection c = new HashSet();
		c.add(new Name("f1","l1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("ffff3","l3"));
		for(Iterator i=c.iterator();i.hasNext();){
			Name name = (Name)i.next();
			if(name.getFirstname().length()<3){
				i.remove();
				//c.remove(name);������쳣����Ϊ��ʱ��name����i������
			}
		}
		System.out.println(c);
	}
}

class Name {
	String firstname,lastname;
	Name(String firstname,String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getLastname(){return lastname;}
	public String getFirstname(){return firstname;}
	public String toString(){return firstname+" "+lastname;}
	//equals��������д�ض�������hashCode()��������д
	
	public boolean equals(Object o){
		if(o instanceof Name){
			Name name = (Name)o;
			return firstname.equals(name.firstname)&&
					lastname.equals(name.lastname);
		}
		return super.equals(o);
	}
	public int hashCode(){
		return firstname.hashCode();
	}
	
}