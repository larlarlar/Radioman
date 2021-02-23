package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RadioAdvanced {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;

    //AllArgsConstructor
    public RadioAdvanced(int currentVolume,
                         int currentChannel) {
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
    }

    public void prevChannel() {
        if (currentChannel <= minChannel) {
            currentChannel = maxChannel;
        } else {
            currentChannel--;
        }
    }

    public void nextChannel() {
        if (currentChannel >= maxChannel) {
            currentChannel = minChannel;
        } else {
            currentChannel++;
        }
    }

    public void lowVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume--;
        }
    }

    public void highVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
    }
}

