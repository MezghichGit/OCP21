package day14_13092026.generics;

public class Container<T> {
	
	T t;
	
	public Container(T t)
	{
		this.t = t;
	}
	
	public void display()
	{
		System.out.println(this.t);
	}

}
