package chap05.exam;

public class StringStack implements Stack{
	private int a;
	public String stack[] = new String[a];

	public StringStack(int a) {
		this.a = a;
	}

	@Override
	public int length() {
		return stack.length;
	}

	@Override
	public int capacity() {
		return this.a - stack.length;
	}

	@Override
	public String pop() {
		for(int i=a-1;i>=0;i--)
			System.out.println(stack[i]);
		return null;
	}

	@Override
	public boolean push(String val) {
		if(val.equals("그만") || this.a==stack.length) {
			pop();
			return false;
		}
		return true;
	}

}
