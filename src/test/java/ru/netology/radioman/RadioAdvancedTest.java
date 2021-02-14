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
    public void validateChangeMaxPrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(9, radio.prevChannel(9), radio.getMaxChannel());
        radio.prevChannel(8);
        assertEquals(8, radio.prevChannel(8), radio.getMaxChannel());
    }
    @Test
    public void validateChangeMidPrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(7, radio.prevChannel(7), radio.getMaxChannel());
        radio.prevChannel(7);
        assertEquals(6, radio.prevChannel(6), radio.getMaxChannel());
    }
    @Test
    public void validateChangeMinPrevChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.prevChannel(0), radio.getMaxChannel());
        radio.prevChannel(9);
        assertEquals(9, radio.prevChannel(9), radio.getMaxChannel());
    }

    @Test
    public void validateChangeMaxNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(9, radio.nextChannel(9), radio.getMinChannel());
        radio.prevChannel(9);
        assertEquals(0, radio.nextChannel(0), radio.getMinChannel());
    }

    @Test
    public void validateChangeMinNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(0, radio.nextChannel(0), radio.getMinChannel());
        radio.prevChannel(1);
        assertEquals(1, radio.nextChannel(1), radio.getMinChannel());
    }
    @Test
    public void validateChangeOverNextChannel() {
        RadioAdvanced radio = new RadioAdvanced();
        assertEquals(5, radio.nextChannel(5), radio.getMinChannel());
        radio.prevChannel(16);
        assertEquals(0, radio.nextChannel(0), radio.getMinChannel());
    }
}
