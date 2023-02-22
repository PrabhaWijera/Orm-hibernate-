package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfig {
    public static FactoryConfig factoryConfig;
    private SessionFactory sessionFactory;
    private  FactoryConfig(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Customer.class);//hibernate wala configuration walata @entit y class tika add krgnn oni
        sessionFactory = configuration.buildSessionFactory();
    }



    public static FactoryConfig getInstance(){
        return factoryConfig==null ?
                factoryConfig=new FactoryConfig() : factoryConfig;
    }

  public Session getsession(){
        return sessionFactory.openSession();
  }


}
