package com.pattern;

public class NoteBook {
    private ThreePlugIf  plug;

    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }

    public void charge(){
        plug.powerWithThree();
    }
}
