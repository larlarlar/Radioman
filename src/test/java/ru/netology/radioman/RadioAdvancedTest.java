package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {
    @Test
    public void createRadio() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "GAGA";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void validateChangeVolumeMax() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeMin() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void validateChangeVolumeMid() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeChannelMin() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(0);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void validateChangeChannelMax() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
    }
    @Test
    public void validateChangeChannelMid() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
    }
}
