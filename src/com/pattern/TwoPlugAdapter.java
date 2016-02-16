package com.pattern;

public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.plug = plug;
    }
    @Override
    public void powerWithThree() {
        System.out.println("使用3孔插座");
        plug.powerWithTwo();
    }
}
