import lk.ijse.hibernate.embebed.CustMobile;
import lk.ijse.hibernate.embebed.Cust_name;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.repo.Customer_repo;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) {
        Customer ob=new Customer();
        ob.setAge(25);
        ob.setName("hhhh");


        List<CustMobile>mobiles=new ArrayList<>();
        mobiles.add(new CustMobile("0776025842","mobile"));
        mobiles.add(new CustMobile("0776555552","mobile"));



        Cust_name cust_name=new Cust_name("fname","mname","lname");

        Customer_repo customer_repo=new Customer_repo();

        boolean b=customer_repo.saveCustomer(ob);
        if (b){
            System.out.println("save sucessfully!!!");
        }else{
            System.out.println("not saved!!!!");
        }


        boolean c=customer_repo.updatecustomer(ob);
        if (c){
            System.out.println("update sucessfully");
        }else{
            System.out.println("not updated");
        }

        boolean f= customer_repo.delete_customer(ob);
        if (f){
            System.out.println("delete sucess");
        }else{
            System.out.println("not deleted");
        }


       // save(ob);
  /*  Session session=FactoryConfig.getInstance().getsession();
    session.save(ob);

        Transaction transaction=session.beginTransaction();
        try{
          Integer id= (Integer)session.save(ob);// one to and many relational ship ekkdi, eke one ptte ID eka apita many ekta oni niasa ekata integer cast krnva
            transaction.commit();
            System.out.println("Id"+id);
        }catch (Exception e){
            transaction.rollback();
        }
       Customer c=session.get(Customer.class,1);
        System.out.println(c.toString());//dana customer getkrnna


        c.setName("New Customer");
        Customer updatecustomer=session.get(Customer.class,2);

        System.out.println(updatecustomer.toString());

        Transaction transaction1=session.beginTransaction();
        try{
            session.update(c);
            transaction1.commit();

        }catch (Exception e){
            transaction1.rollback();
        }

        Transaction transaction2=session.beginTransaction();
        try{
            session.delete(updatecustomer);
        transaction2.commit();
        }catch (Exception e){
            transaction2.rollback();
        }
*/

    }
}
