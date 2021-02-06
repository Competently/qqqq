package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer{
    private ClassicalMusic music;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }
}
