package example.spring.aop;

public class NegativePriceException extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int negPrice;

	public NegativePriceException(int negPrice) {
		this.negPrice = negPrice;
	}

	@Override
	public String toString() {
		return "NegativePriceException negPrice ===> " + negPrice + ".  " + serialVersionUID;
	}	
	
}
