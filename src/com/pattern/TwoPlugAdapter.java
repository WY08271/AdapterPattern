package com.pattern;

public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.plug = plug;
    }
    @Override
    public void powerWithThree() {
        System.out.print("组合模式:");
        plug.powerWithTwo();
    }
}
