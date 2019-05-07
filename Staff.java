//Class named staff to handle all the the staff record 
public class Staff  extends Person{

	private int id;
	private int salary;
	
	public Staff(String name, int age, int id2, int salary) {
		super(name, age);
		this.id = id2;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

}
