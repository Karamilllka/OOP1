package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    //тесты на переключение станции выбором любой станции
    @Test
    public void shouldSwitchingNewStationNumberOfStations() {
        Radio radio = new Radio(12, 11);
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationMoreMaxNumberOfStations() {
        Radio radio = new Radio(7,6);
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationSmallerMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNewStationDordenMaxNumberOfStations() {
        Radio radio = new Radio(20, 19);
        radio.setCurrentStation(20);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationDordenMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationDordenMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    // Тест на переключение станции кнопкой next
    @Test
    public void shouldSwitchingNewStationNextBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationNextBorderMinNumberOfStation() {
        Radio radio = new Radio(15,14);
        radio.setCurrentStation(0);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationNextNegativ() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNewStationNextMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationNextMoreMaxNumberOfStation() {
        Radio radio = new Radio(18,17);
        radio.setCurrentStation(17);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationNextBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    // тест на переключение кнопкой prev
    @Test
    public void shouldSwitchingNewStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNewStationPrevSmallerMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingNewStationPrevSmallerMinNumberOfStations() {
        Radio radio = new Radio(23,22);
        radio.setCurrentStation(0);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 22;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNewStationPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-3);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    // тест на увеличение громкости
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeDordenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    // тест на уменьшение громкости
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeDordenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}

