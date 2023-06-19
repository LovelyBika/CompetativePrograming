import java.util.Random;

public class RandomWord {
    
    private static String createRandomWord(int len){
    String name="";
    Random rand = new Random();
    
    for(int i=0;i<len;i++){
        int v = rand.nextInt(26);   
        char c =(char)(v+(i==0?'A':'a'));
         name+=c;
    }
      return name;

    }
    
    public static void main(String[] args) {
        String RandomWord =createRandomWord(6);
        System.out.println(RandomWord);
        
    }
}
