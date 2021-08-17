package chap07;

import java.util.Vector;

public class MyStack_<E> implements IStack<E> {
	Vector<E> data;

	public MyStack_() {
		data = new Vector<E>();
	}

	@Override
	public E pop() {
		E result = null;
		int i = data.size() - 1;
		if (i >= 0) {
			result = data.get(i);
			data.remove(i);
		}
		return result;
	}

	@Override
	public boolean push(E ob) {
		return data.add(ob);
	}
}