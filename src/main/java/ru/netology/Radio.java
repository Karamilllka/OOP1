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
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void switchingNewStationNext() {
        if (currentStation < 9) {
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
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
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
