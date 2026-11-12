public class BattleResult{
    private String playerName;
    private String enemyName;
    private String winner;
    BattleResult(String pName,String eneName,String winner){
        this.playerName = pName;
        this.enemyName = eneName;
        this.winner = winner;
    }

    public String getPName(){
        return this.playerName;
    }

    public String getEneName(){
        return this.enemyName;
    }

    public String getWinner(){
        return this.winner;
    }
}