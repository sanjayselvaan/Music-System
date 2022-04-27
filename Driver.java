import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        int dummyVolume;
        Scanner read = new Scanner(System.in);
        int choice,innerChoice;
        while (true) {
            System.out.println("Enter from the choices:\n1)Car\n2)Bus\n3)Exit");
            choice = read.nextInt();
            if(choice==1){
                Car carObject = new Car();
                while(true){
                    while(true){
                        System.out.println("Enter the choice:\n1)Increase Volume\n2)Decrease Volume\n3)Display Volume\n4)Return to previous menu");
                        innerChoice=read.nextInt();
                        if(innerChoice==1){
                            System.out.println("Enter the volume to increase :");
                            dummyVolume = read.nextInt();
                            carObject.musicSystemObject.increment(dummyVolume);
                            if(carObject.CheckTrigger()){
                                carObject.displayMessage();
                            }
                        }
                        else if(innerChoice==2){
                            System.out.println("Enter the volume to decrease :");
                            dummyVolume = read.nextInt();
                            carObject.musicSystemObject.decrement(dummyVolume);
                        }
                        else if(innerChoice==3){
                            carObject.musicSystemObject.displayVolume();
                        }
                        else{
                            return;
                        }
                    }

                }
            }
            if(choice==2){
                Bus busObject = new Bus();
                while(true){
                    while(true){
                        System.out.println("Enter the choice:\n1)Increase Volume\n2)Decrease Volume\n3)Display Volume\n4)Return to previous menu");
                        innerChoice=read.nextInt();
                        if(innerChoice==1){
                            System.out.println("Enter the volume to increase :");
                            dummyVolume = read.nextInt();
                            busObject.musicSystemObject.increment(dummyVolume);
                            if(busObject.CheckTrigger()){
                                busObject.displayMessage();
                            }
                        }
                        else if(innerChoice==2){
                            System.out.println("Enter the volume to decrease :");
                            dummyVolume = read.nextInt();
                            busObject.musicSystemObject.decrement(dummyVolume);
                        }
                        else if(innerChoice==3){
                            busObject.musicSystemObject.displayVolume();
                        }
                        else{
                            return;
                        }
                    }

                }
            }
            if(choice==3){
                break;

            }
        }
    }
}


