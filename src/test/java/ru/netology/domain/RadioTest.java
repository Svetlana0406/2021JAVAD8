package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals (7, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(55);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationBeforeMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGoPrevStationBeforeMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldGoPreviousStationAfterMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldGoPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.previousStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeWithLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(867);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithingRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}