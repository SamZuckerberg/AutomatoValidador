package validator;

public abstract class Calculator implements CalculatorInterface {

	@Override
	public float sum(float entry1, float entry2) {
		return (entry1 + entry2);
	}

	@Override
	public float subtraction(float entry1, float entry2) {
		return (entry1 - entry2);
	}
	@Override
	public float multiply(float entry1, float entry2) {
		return (entry1 * entry2);
	}

	@Override
	public float divide(float entry1, float entry2) {
		return (entry1 / entry2);
	}
	
}