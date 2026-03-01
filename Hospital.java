abstract class Patient {
    int patientId;
    String name;

    Patient(int id, String name) {
        this.patientId = id;
        this.name = name;
    }

    abstract double calculateBill();
}

class InPatient extends Patient {
    int days;
    InPatient(int id, String name, int days) {
        super(id, name);
        this.days = days;
    }

    double calculateBill() {
        return days * 2000;
    }
}

class OutPatient extends Patient {
    OutPatient(int id, String name) {
        super(id, name);
    }

    double calculateBill() {
        return 500;
    }
}
public class Hospital {
     public static void main(String[] args) {
        Patient p = new InPatient(1, "Ram", 3);
        System.out.println(p.calculateBill());
    }
}
