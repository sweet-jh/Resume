import java.util.Date;

/**
 * Created by hjing on 1/17/17.
 */
public class WorkExperience implements Cloneable{
    private Date date;
    private String company;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience cloneSelf() throws CloneNotSupportedException {
        return (WorkExperience)this.clone();
    }

}
