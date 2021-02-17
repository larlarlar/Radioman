package ru.netology.radioman;

public class RadioAdvanced {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannel;
    private boolean on;

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

    public void setMaxChannel(
            int maxChannel) {
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

    public int prevChannel() {
        int prevChannel = currentChannel--;
        if (prevChannel < minChannel) {
            return maxChannel;
        }
        return prevChannel;
    }

    public int nextChannel() {
        int nextChannel = currentChannel++;
        if (nextChannel > maxChannel) {
            return minChannel;
        }
        return nextChannel;
    }

    public int lowVolume() {
        int lowVolume = currentVolume--;
        if (lowVolume < minVolume) {
            return minVolume;
        }
        return lowVolume;
    }

    public int highVolume() {
        int highVolume = currentVolume++;
        if (highVolume > maxVolume) {
            return maxVolume;
        }
        return highVolume;
    }
}
