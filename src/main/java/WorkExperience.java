import java.util.Date;

/**
 * Created by hjing on 1/17/17.
 */
public class WorkExperience {
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

    public Object cloneSelf() throws CloneNotSupportedException {
        return (Object)this.clone();
    }

}
