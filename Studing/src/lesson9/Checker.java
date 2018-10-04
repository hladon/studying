package lesson9;

public class Checker {
	public int companyNamesValidaytedCount=0;
	public boolean checkCompanyName(String companyName){
		companyNamesValidaytedCount++;
		return companyName!="Google" ||companyName!="Amazon";
	}
}
