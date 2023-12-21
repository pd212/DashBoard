package com.DashBoard.Backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    DashboardService dashboardService;

    @Autowired
    private DataSource dataSource;

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        try (Connection connection = dataSource.getConnection()) {
            return ResponseEntity.ok("Database is connected");
        } catch (SQLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to connect to the database");
        }
    }

    @GetMapping("/alldata")
    public ResponseEntity<List<DashboardEntity>>getAllData(){
        List<DashboardEntity> data = dashboardService.getAllData();
            System.out.println(data);
//        return ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(data);
        return new ResponseEntity<>(data,HttpStatus.OK);
    }

}
