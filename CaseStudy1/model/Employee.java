package CaseStudy1.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Serializable{
   private int maNhanVien;
    private String name;
    private LocalDate date;
    private String gender;
    private String CMND;
    private String SDT;
    private String email;
    private String hv;
    private String vitri;
    private double salary;

    public Employee() {
    }

    public Employee(int mnv, String name, LocalDate date, String gender, String CMND, String SDT, String email, String vitri, String hv, double salary) {
        this.maNhanVien = mnv;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.CMND = CMND;
        this.SDT = SDT;
        this.email = email;
        this.hv= hv;
        this.vitri = vitri;
        this.salary = salary;
    }

    public int getMnv() {
        return maNhanVien;
    }

    public void setMnv(int mnv) {
        this.maNhanVien = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHv() {
        return hv;
    }

    public void setHv(String hv) {
        this.hv = hv;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        return "Employee{" +
                "mnv=" + maNhanVien +
                ", name='" + name + '\'' +
                ", date=" + formatter1.format(date) +
                ", gender='" + gender + '\'' +
                ", CMND='" + CMND + '\'' +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                ", hv='" + hv + '\'' +
                ", vitri='" + vitri + '\'' +
                ", salary=" + salary +
                '}';
    }
}
