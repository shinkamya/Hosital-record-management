//Class named patient extending Person to manage the record of Patients
public class Patient extends Person {
	
	private int registrationId;
	private String disease;
	
	public Patient(String name, int age, int registrationId, String disease) {
		super(name, age);
		this.registrationId = registrationId;
		this.disease = disease;
	}
	
	public int getRegistrationId() {
		return registrationId;
	}

	@Override
	public String toString() {
		return "Patient [resgistrationId=" + registrationId + ", disease=" + disease + ", name=" + name + ", age="
				+ age + "]";
	}
}
