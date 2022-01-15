package section3;

public class CurrencyConverterArray {

	double[] exchangeRates ;//= {75, 3, 3, 595, 18, 107, 2};
	
	void setExchangeRates(double[] exchangeRates) {
		this.exchangeRates = exchangeRates;
	}
	
	void updateExchangeRates(int index, double value) {
		exchangeRates[index] = value;
	}

	void printCurrencies() {

		for(double rate: exchangeRates) {
			System.out.println(rate);
		}
		System.out.println("Size: " + exchangeRates.length);

	}
	
	public static void main(String[] args) {
		
		CurrencyConverterArray cc = new CurrencyConverterArray();
		cc.setExchangeRates(new double[] {75, 3, 3, 595, 18, 107, 2});
		cc.printCurrencies();
		
		cc.updateExchangeRates(0, 76);
		cc.printCurrencies();
	}

}
