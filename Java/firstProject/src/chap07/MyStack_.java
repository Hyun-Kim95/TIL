package chap07;

public class MyStack_<T> implements IStack{
	Object[] stck = new Object[10];
	static int i;

	@Override
	public Object pop() {
		if (i == 0)
			return null;
		i--;
		return (T)stck[i];
	}

	@Override
	public boolean push(Object ob) {
		if(i == 10)
			return false;
		stck[i] = ob;
		i++;
		return true;
	}
}