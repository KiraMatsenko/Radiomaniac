package ru.netology.radio.radiomaniac.service;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int station = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume = minVolume;
    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.station = minStation;
    }

    public Radio() {

    }
    public int getVolume() {
        return volume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        volume = newVolume;
    }

    public int increaseVolume() {
        int increasedVolume = volume + 1;
        setVolume(increasedVolume);
        return increasedVolume;
    }
    
    public int decreaseVolume() {
        int decreasedVolume = volume - 1;
        setVolume(decreasedVolume);
        return decreasedVolume;
    }

    public int getStation() {
        return station;
    }

    public int next() {
        int nextStation = station + 1;
        if (nextStation > maxStation) {
            setStation(minStation);
        }
        else {
            setStation(nextStation);
        }
        return station;
    }

    public int prev() {
        int prevStation = station - 1;
        if (prevStation < minStation) {
            setStation(maxStation);
        }
        else {
            setStation(prevStation);
        }
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        station = newStation;
    }
}