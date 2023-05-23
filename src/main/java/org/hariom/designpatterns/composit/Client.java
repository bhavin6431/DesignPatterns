package org.hariom.designpatterns.composit;

public class Client {
	public static void main(String args[]) {
		Developer dev1 = new Developer("Dev1", "Developer");
		Developer dev2 = new Developer("Dev2", "Developer");
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(dev1);
		engDirectory.addEmployee(dev2);

		Manager man1 = new Manager("Kushagra Garg", "SEO Manager");
		Manager man2 = new Manager("Vikram Sharma ", "Kushagra's Manager");

		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);

		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);

		directory.showEmployeeDetails();

	}

}
