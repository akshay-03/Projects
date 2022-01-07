package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher lizzy = new Teacher(1,"Lizzy",500);
		Teacher randall = new Teacher(2,"Randall",700);
		Teacher melissa = new Teacher(3,"Melissa",600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(melissa);
		teacherList.add(randall);
		teacherList.add(lizzy);
		
		
		Student akshay = new Student(1,"Akshay",8);
		Student govind = new Student(2,"Govind",9);
		Student pavneet = new Student(3,"Pavneet",5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(pavneet);
		studentList.add(govind);
		studentList.add(akshay);
		
		
		School dps = new School(teacherList, studentList);
		
		
		akshay.payFees(5000);
		govind.payFees(6000);
		System.out.println("DPS has earned $" +dps.getTotalMoneyEarned());
		
		System.out.println("-------Making School Pay Salary------");
		randall.receiveSalary(randall.getSalary());
		System.out.println("DPS has spent for salary to " + randall.getName()
		+ " and now has $" + dps.getTotalMoneyEarned());
		
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("DPS has spent for salary to " + lizzy.getName()
		+ " and now has $" + dps.getTotalMoneyEarned());
		
		System.out.println(akshay);
		System.out.println(randall);


	}

}
