package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < getMinStation()) {
            return;
        }
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMinStation() {
        return 0;
    }

    public void switchingNewStationNext() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void switchingNewStationPrev() {
        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMinVolume()) {
            return;
        }
        if (newCurrentVolume > getMaxVolume()) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getMaxVolume() {
        return 10;
    }

    public int getMinVolume() {
        return 0;
    }

    public void increaseVolume() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > getMinVolume()) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
