package com.java.class34;

public class TouchIDIphone extends BaseIphone {
    public TouchIDIphone(String model, int memoryInMg, String color, String iOSVersion) {
        super(model, memoryInMg, color, iOSVersion);
    }

    public boolean touchId(String fingerPrint){
        if (fingerPrint.equalsIgnoreCase("JJAA")){
            return true;
        }else {
            return false;
        }
    }

}
