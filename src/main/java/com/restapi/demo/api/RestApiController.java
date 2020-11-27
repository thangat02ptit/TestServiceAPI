package com.restapi.demo.api;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demo.model.grades;
import com.restapi.demo.service.RestaurantService;

@Controller
@RequestMapping("/api")
public class RestApiController {
    public static Logger logger = LoggerFactory.getLogger(RestApiController.class);

    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(value = "/restaurant/", method = RequestMethod.GET)
    public ResponseEntity<List<grades>> listAllContact(){
        List<grades> listContact= restaurantService.findAll();
        if(listContact.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<grades>>(listContact, HttpStatus.OK);
    }
}
