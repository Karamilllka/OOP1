package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
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

    public void switchingNewStationNext() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        }
    }

    public void switchingNewStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }

    }

    public void switchingNewStationNextMoreMax() {
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void switchingNewStationPrevSmallerMin() {
        if (currentStation <= 0) {
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
        }
    }

    public void increaseVolumeMoreMax() {
        if (currentVolume >= 10) {
            setCurrentVolume(10);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void decreaseVolumeLessMin() {
        if (currentVolume <= 0) {
            setCurrentVolume(0);
        }
    }
}
