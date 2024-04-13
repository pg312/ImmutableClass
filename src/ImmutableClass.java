import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ImmutableClass {

    private final int number;

    private final boolean bool;

    private final String string;

    private final float aFloat;

    private final List<Integer> list;

    private final Map<Integer, String> map;

    public ImmutableClass(int number, boolean bool, String string, float aFloat, List<Integer> list, Map<Integer, String> map){
        this.number = number;
        this.bool = bool;
        this.aFloat = aFloat;
        this.string = string;
        this.list = new ArrayList<>(list);
        this.map = new HashMap<>(map);
    }

    public int getNumber() {
        return number;
    }

    public boolean isBool() {
        return bool;
    }

    public String getString() {
        return string;
    }

    public float getaFloat() {
        return aFloat;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }

    public Map<Integer, String> getMap() {
        return new HashMap<>(map);
    }
}
