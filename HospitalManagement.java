import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {

	private List<Staff> staffs;
	private List<Patient> patients;

	public HospitalManagement() {
		this.staffs = new ArrayList<Staff>();
		this.patients = new ArrayList<Patient>();
	}

	public void addPatient() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter patient details:-");

		System.out.println("Patient's registration id:");
		int registrationId = Integer.parseInt(in.readLine());

		System.out.println("Patient's name:");
		String name = in.readLine();

		System.out.println("Patient's age:");
		int age = Integer.parseInt(in.readLine());

		System.out.println("Patient's disease:");
		String disease = in.readLine();

		patients.add(new Patient(name, age, registrationId, disease));
	}

	public void addStaff() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter staff's details:-");

		System.out.println("Staff's id:");
		int id = Integer.parseInt(in.readLine());

		System.out.println("Staff's name:");
		String name = in.readLine();

		System.out.println("Staff's age:");
		int age = Integer.parseInt(in.readLine());

		System.out.println("Staff's salary:");
		int salary = Integer.parseInt(in.readLine());

		staffs.add(new Staff(name, age, id, salary));
	}

	public void searchPatient() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter patient registration id to search:-");
		int registrationId = Integer.parseInt(in.readLine()) ;
		
		for (Patient patient : patients) {
			if (patient.getRegistrationId() == registrationId) {
				System.out.println(String.format("Patient found with details: %s", patient));
				return;
			}
		}
		System.out.println("Patient not found");
	}

	public void searchStaff() throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter staff id to search:-");
		int id = Integer.parseInt(in.readLine()) ;
		
		for (Staff staff : staffs) {
			if (staff.getId() == id) {
				System.out.println(String.format("Staff found with details: %s", staff));
				return;
			}
		}
		System.out.println("Staff not found");
	}

}
