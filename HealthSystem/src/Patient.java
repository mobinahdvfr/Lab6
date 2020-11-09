import java.util.ArrayList;

public class Patient {

    //private String name;
    private String birthDay;
    private String gender;
    private String baseInsurance;
    private String supplementaryInsurance;
    private String education;
    private String job;
    private String location;
    private ArrayList<Doctor> trustedDoctors;
    private ArrayList<MedicalRecords> medicalRecords;


    public Patient (){ }

    public ArrayList<MedicalRecords> getMedicalRecords (){return medicalRecords;}

    public void addDoctor (Doctor doctor){ }

    public void addMedicalRecord (MedicalRecords medicalRecords){}





}
