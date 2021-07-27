package chap05.exam;
public class Won2Dollar extends Converter{

	
	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / 1200;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
}
