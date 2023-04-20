package encap;

public class EncapsulationConcept {
	
	private double salary;
	private String name;
	private int empid;
	
	private double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setName("Medha");
		obj.setEmpid(12345);
		obj.setSalary(10000);
		
		System.out.println("Name: " +obj.getName());
		System.out.println("Empid: " + obj.getEmpid());
		System.out.println("Selary" + obj.getSalary());
		

	}

}
