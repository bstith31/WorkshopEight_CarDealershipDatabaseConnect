package com.ps.DAO;

import org.apache.commons.dbcp2.BasicDataSource;

public class VehicleDAO {
    private BasicDataSource dataSource;

    public VehicleDAO(BasicDataSource basicDataSource){
        this.dataSource = basicDataSource;
    }


}
