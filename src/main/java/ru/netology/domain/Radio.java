package ru.netology.domain;

public class Radio {

    public int currentStation;
    public int maxStation = 9;
    public int minStation = 0;
    public int currentVolume;
    public int maxVolume = 10;
    public int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        } else {
            currentVolume--;
        }
    }

}