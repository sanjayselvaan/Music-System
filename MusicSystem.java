class MusicSystem {
    protected int volume=0;
    protected boolean TriggerVolume;
    private final static int threshold=90;
    protected void increment(int dummyvolume){
       if(volume+dummyvolume>100){
           System.out.println("The Maximum is 100");
       }
        else if((volume+dummyvolume)>threshold){
            TriggerVolume=true;
        }
        else {
            volume += dummyvolume;
        }
    }
    protected void decrement(int dummyVolume){
       if((volume-dummyVolume)<0)
       {
           System.out.println("The Minimum volume is 0");
       }
       else {
           volume -= dummyVolume;
       }
    }
    protected void displayVolume(){
       System.out.println("VOLUME:"+volume);
    }
}

