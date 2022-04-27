public class Automobile{
    MusicSystem musicSystemObject= new MusicSystem();
    protected boolean CheckTrigger(){
        if(musicSystemObject.TriggerVolume)
        {
            return true;
        }
        else
            return false;

    }
    void displayMessage(){
        System.out.println("Automobile");
    }
}
