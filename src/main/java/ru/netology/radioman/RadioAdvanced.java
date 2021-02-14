package ru.netology.radioman;

public class RadioAdvanced<prevChannel> {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;
    private boolean on;
    int channel;
    int nextChannel;
    int prevChannel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int prevChannel(int i) {
        int prevChannel = i;
        for (i = 0; i > -1; i--) {
            if (i < 0) {
                return maxChannel;
            }
        } this.prevChannel = prevChannel;
        return prevChannel;
    }

    public int nextChannel(int i) {
        int nextChannel = i;
        for (i = 0; i < 10; i++) {
            if (i > 9) {
                return minChannel;
            }
        }
        return nextChannel;
    }
}
