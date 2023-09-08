package employee;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	private int id;
	private String firstname;
	private String Secondname;
	private String dob;
	private String email;
	private String department;
	private String salary;
	
	@Id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return Secondname;
	}
	public void setSecondname(String Secondname) {
		this.Secondname = Secondname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + Secondname + ", dob=" + dob
				+ ", email=" + email + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
