package HomWork24;

import java.util.HashMap;

public class UserCommunityUtil {private HashMap<Integer, User> allUsers =  new HashMap<>();
    private HashMap<String, Community> allCommunity = new HashMap<>();

    public  void addUser(User user){
        allUsers.put(user.getId(), user);
    }

    public void addCommunity(Community community){
        allCommunity.put(community.getName(), community);
    }

    public HashMap<Integer, User> getAllUsers() {
        return allUsers;
    }

    public HashMap<String, Community> getAllCommunity() {
        return allCommunity;
    }
    public  User findUser(User userToFind) {

        User foundUser = allUsers.get(userToFind.getId());

        if (foundUser == null) {
            System.out.println("Пользователя нет в списке");
        } else {
            System.out.println("Пользователь есть в списке ");
        }
        return foundUser;
    }

}
