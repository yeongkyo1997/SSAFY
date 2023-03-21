package com.ssafy.day09;

public class Weather {
    private String hour;
    private String day;
    private String temp;
    private String wfKor;
    private String pop;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWfKor() {
        return wfKor;
    }

    public void setWfKor(String wfKor) {
        this.wfKor = wfKor;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Weather [hour=" + hour + ", day=" + day + ", temp=" + temp + ", wfKor=" + wfKor + ", pop=" + pop + "]";
    }
}
