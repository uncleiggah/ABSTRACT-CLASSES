import MedicalPersonnel.*;
public class Main {
    public static void main(String[] args) {
        MedicalStaff D = new Doctor("D001", "Surgery", 40);
        MedicalStaff N = new Nurse("N001", "Paediatrics", 45);
        MedicalStaff P = new Pharmacist("P001", "Pharmacy", 40);
        MedicalStaff LT = new LabTechnician("L001", "Laboratory", 38);

        D.showDetails();
        D.performDuty();
        System.out.println();

        N.showDetails();
        N.performDuty();
        System.out.println();

        P.showDetails();
        P.performDuty();
        System.out.println();

        LT.showDetails();
        LT.performDuty();

    }
}
