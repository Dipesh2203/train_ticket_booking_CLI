package org.example.entities;

import java.util.*;

public class Trains {
    private String trainId;
    private Map<String,String> stationTime;

//    public record Position(int x, int y) {}
//    Map<Position,Integer> seatMap = new HashMap<>();

    private HashMap<String,Integer> seats;
    private String trainNo;
    private List<String> stations ;
//    private User user;
    //private List<String> stations = new ArrayList<>(Arrays.asList("pune","pimpri","saharsa","nanded"));

    public Trains() {

    }

    public Trains(  String trainId, List<String> stations, Map<String, String> stationTime, HashMap<String,Integer> seats, String trainNo) {
        this.trainId = trainId;
        this.stations = stations;
        this.stationTime = stationTime;
        this.seats = seats;
        this.trainNo = trainNo;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public Map<String, String> getStationTime() {
        return stationTime;
    }

    public void setStationTime(Map<String, String> stationTime) {
        this.stationTime = stationTime;
    }

    public HashMap<String,Integer> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<String,Integer> seats) {
        this.seats = seats;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }
    
}
