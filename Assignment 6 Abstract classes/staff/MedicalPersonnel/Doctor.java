package MedicalPersonnel;

public class Doctor extends MedicalStaff {
public Doctor (String employeeId, String department, int workingHours) {
    super(employeeId, department, workingHours);
}
    @Override
    public void performDuty() {
    System.out.println("Doctor: examines patients and prescribes treatment.");
    }
}
