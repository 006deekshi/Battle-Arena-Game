import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<BattleResult> battleHistory = new ArrayList<>();
        ScoreBoard score = new ScoreBoard();

        int nxt;

    do{
        Character warrior = new Warrior();
        Character mage = new Mage();
        Character archer = new Archer();

        System.out.println("Choose a Character to play Game : ");

        System.out.println("1. Warrior : ");
        warrior.displayDetails();

        System.out.println("2. Mage : ");
        mage.displayDetails();

        System.out.println("3. Archer : ");
        archer.displayDetails();

        System.out.println("Enter Choice(1 or 2 or 3) :");
        int choice = sc.nextInt();
        int rand_choice;

        Character player,enemy;

        while(true){
            if(choice == 1){
                player = warrior;
                break;
            }
            else if(choice == 2){
                player = mage;
                break;
            }
            else if(choice == 3){
                player = archer;
                break;
            }
            else{
                System.out.println("Enter a Valid Choice!"); 
                choice = sc.nextInt();
            }
        }

        rand_choice = rand.nextInt(3)+1;

        if(rand_choice == 1){
            enemy = new Warrior();
        }
        else if(rand_choice == 2){
            enemy = new Mage();
        }
        else{
            enemy = new Archer();
        }
        System.out.println("Player Selected : "+player.getCharName());
        System.out.println("Enemy Selected : "+enemy.getCharName());
        System.out.println();
        BattleArena game = new BattleArena(player, enemy, sc);
        String winner = game.startGame();
        battleHistory.add(new BattleResult(player.getCharName(), enemy.getCharName(), winner));


        if(winner.equals("Player")){
            score.updateScore(player.getCharName(), true);
            score.updateScore(enemy.getCharName(),false);
        }
        else{
            score.updateScore(player.getCharName(), false);
            score.updateScore(enemy.getCharName(),true);
        }

        System.out.println("Do you want to have another match? choose 1 for yes and 2 for no");
        nxt = sc.nextInt();
    } while(nxt == 1);

    System.out.println("Match.NO -      Player      -      Enemy      -      Winner");
    int i=1;
    for(BattleResult res : battleHistory){
        System.out.println(i + "        -      " + res.getPName() + "      -      " + res.getEneName() + "      -      " + res.getWinner());
        i++;
    }

    score.displayScore();

    }
}
