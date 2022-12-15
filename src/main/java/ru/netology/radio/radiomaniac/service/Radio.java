package ru.netology.radio.radiomaniac.service;

public class Radio {
    public int station;
    public int volume;

    public int getVolume() {
        return volume;
    }

    public int increaseVolume(int newVolume) {
        if (newVolume < 10) {
            return newVolume = newVolume + 1;
        }
        if (newVolume > 10) {
            return 10;
        }
        return newVolume;
    }

    public int decreaseVolume(int newVolume) {
        if (newVolume > 0) {
            return newVolume = newVolume - 1;
        }
        if (newVolume < 0) {
            return 0;
        }
        return newVolume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }
    //осталисть next и прев

    public int next(int nextStation) {
        if (nextStation >= 9) {
            nextStation = 0;
        }
        else {
            nextStation = nextStation + 1;
        }
        return nextStation;
    }

    public int prev(int prevStation) {
        if (prevStation <= 0) {
            prevStation = 9;
        }
        else {
            prevStation = prevStation - 1;
        }
        return prevStation;
    }
}