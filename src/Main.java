import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int sum = 0;
        for(int a=1; a<=100; a++){
            sum += a;
            System.out.println("sum = " + sum);
        }

        Map<String,String> validation = new HashMap<String,String>();
        String mapPut = validation.put("조성진", "100살");
        String mapGet = validation.get("조성진");
        int mapSize = validation.size();
        String mapReplace = validation.replace("조성진", "120살");

        System.out.println("mapGet = " + mapGet);
        System.out.println("mapSize = " + mapSize);
        System.out.println("mapReplace = " + mapReplace);

        IntStream.range(1, 11).filter(i-> i%2==0)
                .forEach(i -> System.out.println(i));
    }
}