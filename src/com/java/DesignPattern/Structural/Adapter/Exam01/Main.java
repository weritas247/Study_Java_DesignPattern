package com.java.DesignPattern.Structural.Adapter.Exam01;

class Main {
    public static void main(String[] args) {

        MediaPlayer player = new MP3Player();
        player.play("트와이스-DanceTheNightAway.mp3");

        player = new FormatAdapter(new MP4());
        player.play("트와이스-DanceTheNightAway.mp4");

        player = new FormatAdapter(new MKV());
        player.play("트와이스-DanceTheNightAway.mkv");
    }
}

interface MediaPlayer {
    void play(String filename);
}

interface MediaPackage {
    void playFile(String filename);
}

class MP3Player implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
}

class MP4 implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
}

class MKV implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MKV File " + filename);
    }
}

class FormatAdapter implements MediaPlayer {

    private MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}