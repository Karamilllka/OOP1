package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //тесты на переключение станции выбором любой станции
    @Test
    void shouldSwitchingNewStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationSmallerMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationDordenMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationDordenMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    // Тест на переключение станции кнопкой next
    @Test
    void shouldSwitchingNewStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationNextMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.switchingNewStationNext();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    // тест на переключение кнопкой prev
    @Test
    void shouldSwitchingNewStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchingNewStationPrevSmallerMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.switchingNewStationPrev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    // тест на увеличение громкости
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeDordenMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    // тест на уменьшение громкости
    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeDordenMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}

