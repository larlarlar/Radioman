package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void validateChangeVolumeMax() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(10, radio.getMaxVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void validateChangeVolumeMin() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getMinVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getMinVolume());
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
        assertEquals(9, radio.getMaxChannel());
        radio.setCurrentChannel(-1);
        assertEquals(9, radio.getMaxChannel());
    }

    @Test
    public void validateChangeChannelMax() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getMinChannel());
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void validateChangeChannelMid() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(9);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void validatePrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.prevChannel();
        assertEquals(0, radio.prevChannel());
    }

    @Test
    public void validateNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.nextChannel();
        assertEquals(0, radio.nextChannel());
    }
}


