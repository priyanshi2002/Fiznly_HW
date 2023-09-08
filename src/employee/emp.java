package employee;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {

	private String id;
	private String name;
	private String salary;
	private String department;
	@Id
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
