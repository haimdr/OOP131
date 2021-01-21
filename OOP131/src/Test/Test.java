package Test;

import comp.Director;
import comp.Employee;
import comp.Engineer;
import comp.Manager;
import comp.Secretary;

public class Test {
	public static void main(String[] args) {
		Employee[] employee = new Employee[10];

		employee[0] = new Secretary("Haim Atalai1", 320444D, "JERUSALEM");
		employee[1] = new Secretary("Haim Atalai2", 320444D, "JERUSALEM");
		employee[2] = new Manager("Haim Atalai3", 320222D, "Mobile");
		employee[3] = new Manager("Haim Atalai4", 320111D, "Financial");
		employee[4] = new Employee("haim atalai5", 320000D);
		employee[5] = new Employee("haim atalai6", 310999D);
		employee[6] = new Employee("haim atalai7", 310888D);
		employee[7] = new Director("Haim Atalai8", 310777D, "Financial", "DIR");
		employee[8] = new Engineer("Haim Atalai9", 310666D, "Java development");
		employee[9] = new Engineer("Haim Atalai10", 310555D, "UI development");
		printEmployee(employee);
		System.out.println(avrgeSalary(employee));
		System.out.println(avrgeSalaryMan(employee));
	}

	public static void printEmployee(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static double avrgeSalary(Employee[] employees) {
		double newSal = 0;
		for (Employee employee : employees) {
			newSal = +employee.getSalary();
		}
		return newSal / 10;
	}

	public static double avrgeSalaryMan(Employee[] employees) {
		double newSal = 0;
		double count = 0;
		for (Employee employee : employees) {
			if (employee instanceof Manager) {
				newSal = +employee.getSalary();
				count++;
			}
		}
		return newSal / count;
	}

}
