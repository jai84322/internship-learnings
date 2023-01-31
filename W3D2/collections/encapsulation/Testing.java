package encapsulation;
import encapsulation.Account;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String email = sc.next();
        long acc_no = sc.nextInt();
        float amount = sc.nextFloat();

        Account user = new Account();
        user.setName(name);
        user.setEmail(email);
        user.setAcc_no(acc_no);
        user.setAmount(amount);

//        user.setName("rahul");
//        user.setEmail("rahul@gmail.com");
//        user.setAcc_no(897569845);
//        user.setAmount(333.64f);

        System.out.println(user.getName() + " " + user.getEmail() + " " + user.getAcc_no() + " " + user.getAmount());
    }

}
