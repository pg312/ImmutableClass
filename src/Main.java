import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);
        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(10,"1");
        map.put(20,"2");

        ImmutableClass immutableClass = new ImmutableClass(10, true, "Padma", 10.0F, integerList,map);

        immutableClass.getList().add(20);
        immutableClass.getMap().put(30,"3");

        integerList.add(20);
        map.put(30,"3");

        System.out.println(immutableClass.getList());
        System.out.println(immutableClass.getMap());
    }
}