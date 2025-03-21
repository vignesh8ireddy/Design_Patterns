package com.vignesh.factory_solution;

import com.vignesh.dao.DAO;

public interface DaoFactory {

    public DAO createDAO(String typeOfDao);

}
