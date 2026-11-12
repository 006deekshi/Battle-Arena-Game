import java.util.Random;
import java.util.Scanner;

public class BattleArena {
    private Character player;
    private Character enemy;
    Scanner sc;

    BattleArena(Character player,Character enemy, Scanner sc){
        this.player = player;
        this.enemy = enemy;
        this.sc = sc;
    }

    public String startGame(){

        Random rand = new Random();
        while(player.isAlive() && enemy.isAlive()){
            System.out.println("Choose 1 or 2 : ");
            System.out.println("1. Normal Attack ");
            System.out.println("2. Special Attack(Only 3 chances) ");
            System.out.println("Enter choice (1 or 2) : ");
            int choice = sc.nextInt();

            int power;
            if(choice == 1){
                power = player.attack();
            }
            else if(choice == 2){
                power = player.specialAttack();
                if(power == -1){
                    System.out.println("Special Attacks are completed!");
                    System.out.println("Continuing with Normal Attack!");
                    power = player.attack();
                }
            }
            else{
                System.out.println("Enter Valid Choice!");
                continue;
            }

            enemy.takeDamage(power);

            if(!enemy.isAlive()){
                break;
            }

            int ran_choice = rand.nextInt(2)+1;
            if(ran_choice == 1){
                power = enemy.attack();
            }
            else if(ran_choice == 2){
                power = enemy.specialAttack();
                if(power == -1){
                    power = enemy.attack();
                }
            }
            player.takeDamage(power);
        }

        if(player.isAlive()){
            System.out.println("Player Wins!");
            return "Player";
        }
        System.out.println("Player Losses!");
        return "Enemy";
    }
}
