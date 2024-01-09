package ram.model;

import ram.viewer.states.State;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.util.Objects;

public class Music{

    private Clip backgroundMusic;
    private String file;

    private Clip currMusic;

    public Music(String fileName) {
        this.file = fileName;
        this.backgroundMusic = loadMusic(fileName);
    }

    private Clip loadMusic(String fileName) throws NullPointerException{
        try {
            File musicFile = new File(Objects.requireNonNull(Music.class.getResource("/music/" + fileName)).getFile());
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
            Clip musicClip = AudioSystem.getClip();
            musicClip.open(audioInput);
            FloatControl gainControl = (FloatControl) musicClip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            return musicClip;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void startMusic() {
        backgroundMusic.setMicrosecondPosition(0);
        backgroundMusic.start();
        backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stopMusic(){
        backgroundMusic.close();
    }

}
