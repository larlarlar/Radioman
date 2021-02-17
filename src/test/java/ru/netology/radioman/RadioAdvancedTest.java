package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {

    @Test
    public void validateChangeChannelMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(1);
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void validateChangeChannelMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void validatePrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.prevChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void validateNullPrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        assertEquals(9, radio.prevChannel());
    }

    @Test
    public void validateNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.nextChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void validateEdgeNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.nextChannel());
    }

    @Test
    public void validateLowVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(1);
        radio.lowVolume();
        assertEquals(0, radio.lowVolume());
    }

    @Test
    public void validateLowestVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);
        radio.lowVolume();
        assertEquals(0, radio.lowVolume());
    }

    @Test
    public void validateHighVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(8);
        radio.highVolume();
        assertEquals(9, radio.highVolume());
    }

    @Test
    public void validateHighestVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(10);
        radio.highVolume();
        assertEquals(10, radio.highVolume());
    }
}


