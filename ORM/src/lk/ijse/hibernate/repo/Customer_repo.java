package lk.ijse.hibernate.repo;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Customer_repo {
    Session session= FactoryConfig.getInstance().getsession();
    public boolean saveCustomer(Customer customer){

        Transaction transaction=session.beginTransaction();
        try{
            Integer id=(Integer) session.save(customer);
            transaction.commit();
            System.out.println("id"+id);
         return true;
        }catch (Exception e){
            transaction.rollback();
            return false;
        }
    }
    public Boolean updatecustomer(Customer customer){
        Transaction transaction=session.beginTransaction();
        try{
                session.update(customer);
                session.getTransaction().commit();
                return true;
        }catch (Exception e){

            session.getTransaction().rollback();
            return false;
        }
    }
    /*
    * sesson.update (customer);
    * trans.comit
    * void dnnne update eka

    * */
    public boolean delete_customer(Customer customer){
        Transaction transaction=session.beginTransaction();
        try{
            session.delete(customer);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().commit();
        }
        return false;
    }
    public Customer get_customer(int id){
       return session.get(Customer.class,id);
    }

    /*
    * public Customer getcustomer(Integer id){
    * try{
    * Customer customer session.get(Customer.class,id);
    * retrun customer;
    * }catch (Exception e){
    * throw e;

    * }*/
}
