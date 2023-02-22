package lk.ijse.hibernate.embebed;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable// step 1
public class CustMobile {

    private  String mobileNo;
    private  String type;

    public CustMobile() {
    }

    public CustMobile(String mobileNo, String type) {
        this.mobileNo = mobileNo;
        this.type = type;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CustMobile{" +
                "mobileNo='" + mobileNo + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
