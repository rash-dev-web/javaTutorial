package section3;

public class MoneyTransferService {

	CurrencyConverterArray cc = new CurrencyConverterArray();

	double computeTransferAmount(int countryIndex, double amount) {
		return cc.computeTransferAmount(countryIndex, amount);
	}

	double computeTransferFee(int countryIndex, double amount) {
		return computeTransferAmount(countryIndex, amount) * 0.02;
	}

	public static void main(String[] args) {

		MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);
	}
}
