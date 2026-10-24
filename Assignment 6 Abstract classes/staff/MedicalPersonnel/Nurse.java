package MedicalPersonnel;

public class Nurse extends MedicalStaff {
    public Nurse (String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }
    @Override
    public void performDuty() {
    System.out.println("Nurse: takes care of patients and gives medication.");
    }
}