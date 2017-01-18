import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hjing on 1/18/17.
 */
public class Setup {
    static public void main(String[] args) throws ParseException, CloneNotSupportedException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dateFormat.parse("2010-02-23");
        Work xiaocai = new Work( "xiaocai", "male", 20 );
        xiaocai.setWorkExperience(date1, "Thoughtworks");
        xiaocai.printInformation();

        Date date2 = dateFormat.parse("2014-05-22");
        Work xiaocai2 = xiaocai.cloneSelf();
        xiaocai2.setWorkExperience(date2, "ZET");
        xiaocai2.printInformation();

    }
}
