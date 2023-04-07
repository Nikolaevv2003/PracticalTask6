import java.io.Serializable;

public class Doctor implements Serializable {

    private String fullName;
    private int age;
    private String jobTitle;
    private int numberOfShiftsPerMonth;
    private String placeOfWork;

    public Doctor(String fullName, int age, String jobTitle, int numberOfShiftsPerMonth, String placeOfWork) {
        this.fullName = fullName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.numberOfShiftsPerMonth = numberOfShiftsPerMonth;
        this.placeOfWork = placeOfWork;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", numberOfShiftsPerMonth=" + numberOfShiftsPerMonth +
                ", placeOfWork='" + placeOfWork + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getNumberOfShiftsPerMonth() {
        return numberOfShiftsPerMonth;
    }

    public void setNumberOfShiftsPerMonth(int numberOfShiftsPerMonth) {
        this.numberOfShiftsPerMonth = numberOfShiftsPerMonth;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
