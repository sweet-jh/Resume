import java.util.Date;

/**
 * Created by hjing on 1/17/17.
 */
public class Work implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private WorkExperience workExperience;

    public Work(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.workExperience = new WorkExperience();
    }

    public void setWorkExperience(Date date, String company)
    {
        workExperience.setDate(date);
        workExperience.setCompany(company);
    }

    private void cloneWorkExperience(WorkExperience workExperience) throws CloneNotSupportedException {
        workExperience.cloneSelf();
        this.workExperience = workExperience;
    }

    public Work cloneSelf() throws CloneNotSupportedException {
        WorkExperience workExperience = new WorkExperience();
        this.cloneWorkExperience(workExperience);
        return (Work)this.clone();
    }

    public void printInformation()
    {
        System.out.println("name: " + this.name);
        System.out.println("sex: " + this.sex);
        System.out.println("age: " + this.age);
        System.out.println("work date: " + this.workExperience.getDate());
        System.out.println("work company: " + this.workExperience.getCompany());
        System.out.println('\n');
    }

}
