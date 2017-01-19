import java.util.Date;

/**
 * Created by hjing on 1/17/17.
 */
public class Resume {
    private String name;
    private String sex;
    private int age;
    private WorkExperience workExperience;

    public Resume(String name, String sex, int age)
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

    private Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = workExperience.cloneSelf();
    }

    public Resume cloneSelf() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.age = this.age;
        resume.name = this.name;
        resume.sex = this.sex;
        return resume;
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
