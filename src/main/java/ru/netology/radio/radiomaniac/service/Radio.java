package ru.netology.radio.radiomaniac.service;

public class Radio {
    private int station;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        int maxVolume = 10;
        int minVolume = 0;
        if (newVolume < 0) {
            newVolume = minVolume;
        }
        if (newVolume > 10) {
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
        int firstStation = 0;
        int nextStation = station + 1;
        if (nextStation > 9) {
            setStation(firstStation);
        }
        else {
            setStation(nextStation);
        }
        return station;
    }

    public int prev() {
        int lastStation = 9;
        int prevStation = station - 1;
        if (prevStation < 1) {
            setStation(lastStation);
        }
        else {
            setStation(prevStation);
        }
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
}