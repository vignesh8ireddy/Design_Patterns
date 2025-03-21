package com.vignesh.test;


import com.vignesh.dao.DAO;
import com.vignesh.factory_solution.DaoFactory;
import com.vignesh.factory_solution.DaoFactoryCreater;

//Here, we use a factory which creates us a factory that can create objects related only particular context
public class AbstractFactoryTest2 {

    public static void main(String[] args) {

        DaoFactory factory = DaoFactoryCreater.createDaoFactory("DB");
        DAO dao = factory.createDAO("student");
        dao.insert(); //student record inserted into database
        DAO dao2 = factory.createDAO("course");
        dao2.insert(); //course record inserted into database
    }
}
