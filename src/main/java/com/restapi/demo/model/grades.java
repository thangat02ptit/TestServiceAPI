package com.restapi.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class grades implements Serializable {
    private static final long serialVersionUID = 1L;
    private String date;
    private int score ;
    private String grade;
    private  String restaurant_id;
    public grades(){
        grade_id=0;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int grade_id;
    public grades(int grade_id,String restaurant_id, String date, String grade, int score) {
        this.restaurant_id =restaurant_id;
        this.grade = grade;
        this.grade_id =grade_id;
        this.score =score;
        this.date =date;
    }
    public String getRestaurant_id() {
        return restaurant_id;
    }
    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getGrade_id() {
        return grade_id;
    }
    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String date) {
        this.grade = grade;
    }
    public long getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}

