import java.util.HashMap;

public class ScoreBoard{
    private HashMap<String, int[]> score = new HashMap<>();

    public void updateScore(String name, boolean win){
        if(win){
            if(score.get(name) == null){
                score.put(name, new int[]{1,0,1});
            }
            else{
                score.get(name)[0]++;
                score.get(name)[2]++;
            }
        }
        else{
            if(score.get(name) == null){
                score.put(name, new int[]{0,1,1});
            }
            else{
                score.get(name)[1]++;
                score.get(name)[2]++;
            }
        }
    }

    public void displayScore(){
        System.out.println("Character    -    Win    -    Loss    -    Matches");
        for(HashMap.Entry<String,int[]> entry : score.entrySet()){
            String key = entry.getKey();
            int[] value = entry.getValue();
            System.out.println(key+"      -     "+value[0]+"     -     "+value[1]+"       -     "+value[2]);
        }
      }


}