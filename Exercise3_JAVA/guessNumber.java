
import java.util.Scanner;


class guessNumber{
    public static void main(String[] args){
        int choice=0; 
        int tries=5;
        Scanner scan=new Scanner(System.in); 
        System.out.print("GUESS THE NUMBER BETWEEN 1 and 5 (you have 5 tries): ");
        while(tries>0){ 
            choice=scan.nextInt();
            System.out.println("-------YOU GUESSED: "+choice+"-------"); 
            if (choice==3){
                System.out.println("-------YOU GUESSED THE CORRECT NUMBER 3-------");
                break;
            } 
            else{
                System.out.println("-------YOU GUESSED WRONG-------");
                tries=tries-1;
                System.out.println("-------You have "+tries+" tries-------");
            }
            if (tries==0){
                System.out.println("-------YOU LOSE-------");
                break;
            }

        } 
        
    }

}

 