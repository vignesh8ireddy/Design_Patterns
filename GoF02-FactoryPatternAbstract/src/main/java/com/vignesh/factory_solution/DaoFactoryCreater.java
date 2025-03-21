package com.vignesh.factory_solution;

public class DaoFactoryCreater {
    public static DaoFactory createDaoFactory(String typeOfDaoFactory) {
        DaoFactory daoFactory;
        if(typeOfDaoFactory.equalsIgnoreCase("DB")) {
            daoFactory = new DBDaoFactory();
        }
        else if(typeOfDaoFactory.equalsIgnoreCase("Excel")) {
            daoFactory = new ExcelDaoFactory();
        }
        else throw new RuntimeException("Invalid type of Dao Factory");
        return daoFactory;
    }
}
