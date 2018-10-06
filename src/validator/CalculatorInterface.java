package validator;

public interface CalculatorInterface {
	
	/**
	 * Sum the values
	 * 
	 * @param entry1
	 * @param entry2
	 * @return float
	 */
	public float sum(float entry1, float entry2);
	
	/**
	 * Sub the values
	 * 
	 * @param entry1
	 * @param entry2
	 * @return float
	 */
	public float subtraction(float entry1, float entry2);
	
	/**
	 * Multiply the values
	 * 
	 * @param entry1
	 * @param entry2
	 * @return float
	 */
	public float multiply(float entry1, float entry2);
	
	/**
	 * Divide the values
	 * 
	 * 
	 * @param entry1
	 * @param entry2
	 * @return float
	 */
	public float divide(float entry1, float entry2);
}
