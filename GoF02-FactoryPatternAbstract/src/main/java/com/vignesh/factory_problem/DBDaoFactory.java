package com.vignesh.factory_problem;

import com.vignesh.dao.CourseDBDao;
import com.vignesh.dao.DAO;
import com.vignesh.dao.StudentDBDao;

public class DBDaoFactory {
    public static DAO createDAO(String typeOfDao) {
        DAO dao;
        if(typeOfDao.equalsIgnoreCase("student")) {
            dao = new StudentDBDao();
        }
        else if(typeOfDao.equalsIgnoreCase("course")) {
            dao = new CourseDBDao();
        }
        else throw new RuntimeException("Invalid DAO Type");
        return dao;
    }
}