package ru.netology.radioman;

public class RadioAdvanced {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
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

