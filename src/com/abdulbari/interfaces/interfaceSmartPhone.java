package com.abdulbari.interfaces;

class Phone{
    public void call(){
        System.out.println("Phone Calling");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}
 interface ICamera{
    void click();
    void record();
 }

 interface IMusicPlayer{
    void play();
    void stop();
 }

 class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    public void videocall(){
        System.out.println("SmartPhone is VideoCalling");
    }
    public void click(){
        System.out.println("SmartPhone is Clicking Photo");
    }
    public void record(){
        System.out.println("SmartPhone is Recording");
    }
    public void play(){
        System.out.println("SmartPhone is Playing Music");
    }
    public void stop(){
        System.out.println("SmartPhone is stopped playing music");
    }
 }

public class interfaceSmartPhone {
    public static void main(String[] args) {
        IMusicPlayer sp = new SmartPhone();
        sp.play();
        sp.stop();
    }
}
