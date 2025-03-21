package com.vignesh.factory_solution;


import com.vignesh.dao.CourseExcelDao;
import com.vignesh.dao.DAO;
import com.vignesh.dao.StudentExcelDao;

public class ExcelDaoFactory implements DaoFactory {
    @Override
    public DAO createDAO(String typeOfDao) {
        DAO dao;
        if(typeOfDao.equalsIgnoreCase("student")) {
            dao = new StudentExcelDao();
        }
        else if(typeOfDao.equalsIgnoreCase("course")) {
            dao = new CourseExcelDao();
        }
        else throw new RuntimeException("Invalid DAO Type");
        return dao;
    }
}