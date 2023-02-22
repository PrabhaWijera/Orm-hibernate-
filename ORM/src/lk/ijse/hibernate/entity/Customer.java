package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embebed.CustMobile;
import lk.ijse.hibernate.embebed.Cust_name;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name="cust_name",length = 100)
    private String name;
  /*  @Column(name="age", columnDefinition = "tinyint")*/
    private int age;
    @UpdateTimestamp

//customer ,item,order,orderdetails eka hdnna enn[Home work]



// step 4
    @CollectionTable(
            name = "cust_phone",
            joinColumns = @JoinColumn(name = "cus_id")//foreiing key eka
    )

    @ElementCollection  // step 2
    private List<CustMobile>mobiles;//step 3


    @Transient
    private String cardNo;

    public Customer() {
    }

    public Customer(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
//xml file eeke last propety wala last eka [update ] krnn oni anthimata, create --->dmoth ai ai load wenva