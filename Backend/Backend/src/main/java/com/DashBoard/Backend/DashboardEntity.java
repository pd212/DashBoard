package com.DashBoard.Backend;


import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class DashboardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    private Long id;
    private int intensity;
    private int likelihood;
    private int relevance;
    private int startYear;
    private int endYear;
    private String country;
    private String topic;
    private String region;
    private String city;
    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        endYear = endYear;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }



//    public Long getId() {
////        return id;
//    }

    public void setId(Long id) {
//        this.id = id;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTopics() {
        return topic;
    }

    public void setTopics(String topic) {
        this.topic = topic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
