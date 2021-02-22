package ru.netology.radioman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 1",
                    "6; 7",
                    "9; 0"
            }
            , delimiter = ';'
    )
    void nextChannel(int start, int expected) {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(start);
        radio.nextChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 9",
                    "6; 5",
                    "9; 8"
            }
            , delimiter = ';'
    )
    void prevChannel(int start, int expected) {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(start);
        radio.prevChannel();
        assertEquals(expected, radio.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 1",
                    "50; 51",
                    "100; 100"
            }
            , delimiter = ';'
    )
    void highVolume(int start, int expected) {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(start);
        radio.highVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "100; 99",
                    "50; 49",
                    "0; 0"
            }
            , delimiter = ';'
    )
    void lowVolume(int start, int expected) {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(start);
        radio.lowVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}