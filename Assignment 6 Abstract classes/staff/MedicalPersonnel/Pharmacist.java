package MedicalPersonnel;

public class Pharmacist extends MedicalStaff{
    public Pharmacist (String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }
    @Override
    public void performDuty() {
     System.out.println("Pharmacist: prepares and gives out medicine.");
    }
}
