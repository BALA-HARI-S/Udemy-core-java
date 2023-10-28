public class TestAccount {
    public static void main(String[] args) {
        Account bobsaccount = new Account("tim", "tim@email.com","1234");
//        Account bobsaccount = new Account("12345",
//                1000,"Bop","bob@email.com",
//                "bob@email.com");


//        bobsaccount.setNumber("12345");
//        bobsaccount.setCustomerName("Bop");
//        bobsaccount.setBalance(1000);
//        bobsaccount.setCustomerEmail("bob@email.com");
//        bobsaccount.setCustomerPhone("bob@email.com");

        System.out.println("Account details : " +
                "\nAcc.no : "+ bobsaccount.getNumber()+
                "\nBalance : "+ bobsaccount.getBalance()+
                "\nName : "+ bobsaccount.getCustomerName()+
                "\nEmail : "+ bobsaccount.getCustomerEmail()+
                "\nPhone : "+ bobsaccount.getCustomerPhone());

        bobsaccount.withdrawFunds(100);
        bobsaccount.depositFunds(200);
        bobsaccount.withdrawFunds(150);
        bobsaccount.withdrawFunds(49.5);
        bobsaccount.withdrawFunds(1);
    }
}
