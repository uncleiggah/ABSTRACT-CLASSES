package MedicalPersonnel;

public abstract class MedicalStaff {
    String employeeId;
    String department;
    int workingHours;

    public MedicalStaff(String employeeId, String department, int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }
}
