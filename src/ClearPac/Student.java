package ClearPac;

import java.time.Year;

/**
 * Created by betty on 7/21/17.
 */
public class Student {
private String StudID="";
private String FullName;
private String Dep;
private Year ClassYear;

    public String getDep() {
        return this.Dep;
    }

    public String getFullName() {
        return this.FullName;
    }

    public String getStudID() {
        return this.StudID;
    }

    public Year getClassYear() {
        return this.ClassYear;
    }

    public void setStudID(String studID) {
        StudID = studID;
    }

    public void EnterID(){

}
}
