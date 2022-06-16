package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapcounter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Account> list = new ArrayList<Account>();
        list.add(new Account(10.00, "1234"));
        list.add(new Account(15.00, "5678"));
        list.add(new Account(0, "1010"));

        Map<Long, Account> map = new HashMap<Long, Account>();

        for(Account a:list) {
            Long id = (long)(Math.random()*1000000000);
            map.put(id, a);
        }

        map.forEach((key , value)->{
            System.out.println("id:" + key + "  余额：" + value.getBalance());
        });

    }
}
class Account {
    private long id;
    private double balance;
    private String password;

    public Account(double balance, String password) {
        super();
        this.balance = balance;
        this.password = password;
    }

    public Account(long id, double balance, String password) {
        super();
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}