package chap05.exam;

public class Dictionary extends PairMap{
	int a;
	static int b = 0;
	public Dictionary(int a) {
		this.a = a;
		this.keyArray = new String[a];
		this.valueArray = new String[a];
	}

	@Override
	String get(String key) {
		for(int i=0;i<a;i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return "null";
	}

	@Override
	void put(String key, String value) {
		int cnt = 0;
		if(b != 0) {
			for(int i=0;i<b;i++) {
				if(keyArray[i].contains(key)) {
					valueArray[i] = value;
					cnt++;
				}
			}
		}
		if(cnt == 0) {
			keyArray[b] = key;
			valueArray[b] = value;
			b++;
		}
	}

	@Override
	String delete(String key) {
		for(int i=0;i<b;i++) {
			if(keyArray[i].equals(key)) {
				valueArray[i] = "null";
			}
		}
		return "null";
	}

	@Override
	int length() {
		return b+1;
	}
}