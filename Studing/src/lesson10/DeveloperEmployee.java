package lesson10;

public class DeveloperEmployee extends Employee {
	private String[] frameworks = new String[10];

	void paySalary() {
		int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
		getBankAccount().setBalance(newBalance);

	}
}
