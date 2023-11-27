package ut.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeAll
    static void beforeClass(){
        System.out.println("beforeAll() method before any test case, Count = " + count);
    }

    @BeforeEach
    void setup(){
        account = new BankAccount("Tim", "Tim", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        // Junit Assertion method
        assertEquals(1200.00, balance, 0);

    }

    @Test
    void withdraw_Branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test
    void withdraw_NotBranch(){

        try{
            account.withdraw(600.00, true);
        } catch (IllegalArgumentException e){

        }
    }

    @Test
    void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    void isChecking_true(){
        // Junit Assertion method
        assertTrue(account.isChecking(), "The account is not a CHECKING account");
    }

    @AfterEach
    void afterClass(){
        System.out.println("Count = " + count++);
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Total Count = " + count);
    }


}
// Junit Assertion method
// assertEquals()
// assertNotEquals()
// assertTrue()
// assertFalse()
// assertArrayEquals()
// assertNull()
// assertNotNull()
// assertSame() - compare instance of object
// assertNotSame()
// assertThat() - actual value compare to range