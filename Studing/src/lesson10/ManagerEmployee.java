package lesson10;

public class ManagerEmployee extends Employee {
	void paySalary() {
		int newBalance = getBankAccount().getBalance() + getSalaryPerMonth();
		newBalance += newBalance * 0.25;
		getBankAccount().setBalance(newBalance);

	}
}
