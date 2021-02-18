package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void validateChangeChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(1);
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void validateChangeChannelOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void validateChangeChannelUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(-1);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void validateChangeVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void validateChangeVolumeUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void validatePrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(8);
        radio.prevChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void validateNullPrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void validateNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(4);
        radio.nextChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void validateEdgeNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void validateLowMidVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(1);
        radio.lowVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void validateLowVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);
        radio.lowVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void validateLowestVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(-1);
        radio.lowVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void validateHighVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(8);
        radio.highVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void validateHighestVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(10);
        radio.highVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
}


