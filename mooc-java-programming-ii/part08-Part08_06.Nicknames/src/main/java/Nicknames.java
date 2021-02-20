
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nameToNickname = new HashMap<>();
        
        nameToNickname.put("matthew", "matt");
        nameToNickname.put("michael", "mix");
        nameToNickname.put("arthur", "artie");
        
        System.out.println(nameToNickname.get("matthew"));
    }

}
