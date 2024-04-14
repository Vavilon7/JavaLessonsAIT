package HomWork24;

import java.util.HashMap;
import java.util.HashSet;

public class Community {private String name;

    private HashSet<User> members;

    public static HashMap<String, Community> communityHashMap = new HashMap<>();

    public Community(String name) {
        this.name = name;
        this.members = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getMembers() {
        return members;
    }

    public void setMembers(HashSet<User> members) {
        this.members = members;
    }

    public void addMember(User user) {
        members.add(user);
    }
}

