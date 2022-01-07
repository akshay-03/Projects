package school.management.system;

/**
 * 
 * @author Akshay
 * This class is responsible for keeping the track
 * of teacher's name, id and salary.
 */

public class Teacher {


		private int id;
		private String name;
		private int salary;
		private int salaryEarned;
		
	/**
	 * Creates a new teacher object.
	 * @param id id for the teacher.
	 * @param name name of the teacher.
	 * @param salary salary of the teacher.
	 */

		public Teacher(int id, String name, int salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.salaryEarned = 0;
		}
		
		/**
		 * 
		 * @return the id.
		 */
		
		public int getId() {
			return id;
		}
		
		
		/**
		 * 
		 * @return the name of the teacher.
		 */
		
		public String getName( ) {
			return name;
		}
		
		/**
		 * 
		 * @return the salary.
		 */
		
		public int getSalary() {
			return salary;
		}
		
		/**
		 * set the salary.
		 * @param salary
		 */
		
		public void setSalary(int salary) {
			
			this.salary = salary;
		}
		
		/**
		 * Adds to the salary earned.
		 * Removes from the total money earned by
		 * the school
		 * @param salary
		 */
		public void receiveSalary(int salary) {
			
			salaryEarned += salary;
			School.updateTotalMoneySpent(salary);
			
		}

		@Override
		public String toString() {
			return "Teacher [name=" + name + ", salaryEarned=" + salaryEarned + "]";
		}
		
		

}
