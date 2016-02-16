package com.pattern;

public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.print("继承模式:");
        this.powerWithTwo();
    }
}
