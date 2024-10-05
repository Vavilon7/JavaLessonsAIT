package Lessons28;
import java.util.ArrayList;

public class UserDataManager {
    private String userName;
    private int userID;
    private String userAddress;
    private String userEmail;
    private boolean isActive;
    private ArrayList<String> transactionHistory;

    public UserDataManager(String userName, int userID, String userAddress,
                           String userEmail, boolean isActive) {

        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.isActive = isActive;
        this.transactionHistory = new ArrayList<String>();
    }

    private void updateUserEmail(String newEmail) {
        if (newEmail.contains("@") && newEmail.contains(".")) {
            userEmail = newEmail;
        } else {
            System.err.println("Invalid email format.");
        }
    }

    private void activateUser() {
        isActive = true;
    }

    private void deactivateUser() {
        isActive = false;
    }

    public void addToTransactionHistory(String transactionDetail) {
        if (transactionDetail != null && !transactionDetail.isEmpty()) {
            transactionHistory.add(transactionDetail);
        }
    }

    public void printUserInfo() {
        System.out.println("User: " + userName + ", ID: " + userID + ", Email: " + userEmail + ", Active: " + isActive);
    }

    private void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

