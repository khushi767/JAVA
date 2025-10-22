import java.util.Scanner;
class GuessingGame {
    int random;
    GuessingGame(){
        random=(int)Math.ceil(Math.random()*100);

    }

    /**
     * 
     * @param guessNumber number that player guessed
     * 
     * @return
     *  -1 if guessNumber is less than random number
     * 0 if guessednumber is correct
     * positive integer if guessNumber is greater than random number
     */
    int guess(int guessNumber){
        return guessNumber-random;

    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        GuessingGame game=new GuessingGame();
        System.out.println("Welcome to guessing game.Guess number");
        int guess;
        int result;
        do{
            System.out.print("guess the numer");
            guess=input.nextInt();
            result=game.guess(guess);
            if(result==0){
                System.out.println("congrats your guess is correct");
            }else if(result<0){
                System.out.println("please guess higher");
            }else{
                System.out.println("please guess lower");
            }
        }while(result!=0);
        input.close();
    }
}
