package chap05.exam;

public class StringStack implements Stack{

	int i = 0;
	public String stack[];

	public StringStack(String[] stack, int i) {
		this.stack = stack;
		this.i = i;
	}

	@Override
	public int length() {
		return this.stack.length;
	}

	@Override
	public int capacity() {
		return this.stack.length - i - 1;
	}

	@Override
	public String pop() {
		for(int i=stack.length-1;i>=0;i--)
			System.out.println(this.stack[i]);
		return null;
	}

	@Override
	public boolean push(String val) {
		if(val.equals("그만")) {
			pop();
			return false;
		}  else if (i == stack.length) {
			System.out.println("꽉찼습니다.");
		} else {
			this.stack[i] = val;
			i++;
		}
		return true;
	}
}