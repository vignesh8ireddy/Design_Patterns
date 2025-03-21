package com.vignesh.test;


import com.vignesh.dao.DAO;
import com.vignesh.factory_problem.DBDaoFactory;
import com.vignesh.factory_problem.ExcelDaoFactory;

//Here the problem is, we are not restricted to other environment factories, and we are able to create objects which are
// similar and misleading.
public class AbstractFactoryTest1 {

    public static void main(String[] args) {
        DAO dao = DBDaoFactory.createDAO("student");
        dao.insert(); //student record inserted into database
        DAO dao2 = ExcelDaoFactory.createDAO("course");
        dao2.insert(); //course record inserted into Excel file
    }
}
