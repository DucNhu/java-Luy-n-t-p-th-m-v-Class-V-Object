package java_lssion7;

public class jv_7_Accout {
    public static void main(String[] args) {
        Account a1 = new Account(1234, 999.99);
        System.out.println(a1);
        Account a2 = new Account(8888);
        System.out.println(a2);
        a1.setBalance(88.88);
        System.out.println(a1);
        System.out.println("The account Number is: " + a1.getAccountNuber());
        System.out.println("The balance is:" + +a1.getBalance());
        a1.credit(10);
        System.out.println(a1);
        a1.debit(5);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

    }
}
