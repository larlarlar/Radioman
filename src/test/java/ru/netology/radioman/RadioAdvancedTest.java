package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void OverCheck() {
        RadioAdvanced radio = new RadioAdvanced(100, 9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
        radio.highVolume();
        assertEquals(100, radio.getCurrentVolume());
        radio.lowVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void UnderCheck() {
        RadioAdvanced radio = new RadioAdvanced(0, 0);
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
        radio.lowVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.highVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
}


