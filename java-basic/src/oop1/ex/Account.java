package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 잔액: " + balance);
    }

    void withdraw(int amount) {
        if(balance>=amount) {
            balance -= amount;
            System.out.println("출금 잔액: " + balance);
        } else {
            System.out.println("잔액 부족");
        } // 예외는 else로 빼는게 깔끔
    }
}
