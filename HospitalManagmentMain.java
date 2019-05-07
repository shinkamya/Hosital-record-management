//Main Class Named as HospitalManagmentMain.java to execute all the operation
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HospitalManagmentMain {

	public static void main(String[] args) throws Exception {
		HospitalManagement hospitalManagement = new HospitalManagement();

		while (true) {

			System.out.println("\nChoose Options 1-5");
			System.out.println("1. Register a new patient:");
			System.out.println("2. Register a new staff:");
			System.out.println("3. Search a patient:");
			System.out.println("4. Search a staff:");
			System.out.println("5. Exit");

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int option = Integer.parseInt(in.readLine());
			if (option == 1) {
				hospitalManagement.addPatient();
			} else if (option == 2) {
				hospitalManagement.addStaff();
			} else if (option == 3) {
				hospitalManagement.searchPatient();
			} else if (option == 4) {
				hospitalManagement.searchStaff();
			} else if (option == 5) {
				break;
			} else {
				System.out.println("Choose only from option 1-5");
			}

		}
	}

}
