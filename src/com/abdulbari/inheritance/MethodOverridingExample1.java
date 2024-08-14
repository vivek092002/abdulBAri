package com.abdulbari.inheritance;

class TV{
    public void switchON(){
        System.out.println("Tv is SwitchOn");
    }
    public void changeChannel(){
        System.out.println("Tv channel is Changed");
    }
}

class SmartTv extends TV{
    @Override
    public void switchON(){
        System.out.println("SmartTv is SwitchOn");
    }
    @Override
    public void changeChannel(){
        System.out.println("SmartTv channel is changed");
    }

    public void browse(){
        System.out.println("smart Tv is Browsing");
    }
}

public class MethodOverridingExample1 {
    public static void main(String[] args) {
        TV t = new SmartTv();
        t.switchON();
        t.changeChannel();

        SmartTv st = new SmartTv();
        st.browse();
    }
}
