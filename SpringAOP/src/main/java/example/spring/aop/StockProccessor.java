package example.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StockProccessor {
	
	@Autowired(required = false)
	@Qualifier("myStock")
	private Stock stockRef;

	public StockProccessor() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StockProccessor(Stock stockRef) {
		super();
		this.stockRef = stockRef;
	}
	
	public void changePrice(int price) throws NegativePriceException {
		if(price < 0)
			throw new NegativePriceException(price);
		stockRef.setPrice(price);
	}

	@Override
	public String toString() {
		return "StockProccessor [stockRef==>" + stockRef + "]";
	}
	
	
}
