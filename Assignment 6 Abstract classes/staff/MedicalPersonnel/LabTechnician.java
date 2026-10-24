package MedicalPersonnel;

public class LabTechnician extends MedicalStaff{
    public LabTechnician (String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }
    @Override
    public void performDuty() {
        System.out.println("Lab Technician: tests blood and other samples.");
    }
}
