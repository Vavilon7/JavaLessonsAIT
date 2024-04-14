package HomWork24;

import java.time.LocalDateTime;

public class SocialNetworkTest {public static void main(String[] args) {

    UserCommunityUtil util =  new UserCommunityUtil();


    User userBillGates = new User("Bill", 1);
    User userMask = new User("MaskForever", 2);

    util.addUser(userBillGates);
    util.addUser(userMask);

    userBillGates.addFriend(userMask);
    userMask.addFriend(userBillGates);

    Message userBillGatesMessage = new Message(userBillGates, "Do You habe one free Marc ticket?", LocalDateTime.now());

    userBillGates.sendMessage(userBillGatesMessage.getText(), userBillGatesMessage.getSendTime());
    userMask.sendMessage("Do You habe pirate key for Windows", LocalDateTime.now());

    userBillGatesMessage.likeMessage(userMask);

    Community community = new Community("Top-2 in the world");
    community.addMember(userBillGates);
    community.addMember(userMask);

    System.out.println();

}
}

