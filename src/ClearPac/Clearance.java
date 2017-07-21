package ClearPac;

import javax.xml.soap.Text;
import java.util.Date;

/**
 * Created by betty on 7/21/17.
 */
public class Clearance {
    private String ClearanceID;
    private String Decription="";
    private String ReasonForC;
    private Date DateCleared;
    Student std=new Student();

    public Date getDateCleared() {
        return this.DateCleared;
    }

    public String getClearanceID() {
        return this.ClearanceID;
    }

    public String getDecription() {
        return this.Decription;
    }

    public String getReasonForC() {
        return this.ReasonForC;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }

    public void setClearanceID(String clearanceID) {
        ClearanceID = clearanceID;
    }
}
