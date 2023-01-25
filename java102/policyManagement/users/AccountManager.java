package java102.policyManagement.users;

import java.util.TreeSet;

import java102.policyManagement.users.Account.AuthenticationStatus;

public class AccountManager {

    private TreeSet<Account> accountList;

    public AccountManager() {
        accountList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public Account login(String email, String password) {
        for (Account account : accountList) {
            try {
                account.login(email, password);
                if (account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public TreeSet<Account> getAccountList() {
        return accountList;
    }

}
