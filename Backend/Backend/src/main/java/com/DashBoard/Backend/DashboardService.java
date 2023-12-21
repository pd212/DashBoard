package com.DashBoard.Backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
     DashboardRepository dashboardRepository;

    public List<DashboardEntity> getAllData(){
            return dashboardRepository.findAll();


    }


}
