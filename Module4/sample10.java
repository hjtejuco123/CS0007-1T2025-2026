package Module4;
//create a banking application using one dimensional array to store account balances
//and perform operations like deposit, withdraw, and check balance
//syntax datatype[] arrayName = new datatype[size];
//or datatype[] arrayName = {value1, value2, value3, ...};
public class sample10 {
    public static void main(String[] args) {
        double[] accountBalances = new double[5];
        accountBalances[0] = 1000.0;
        accountBalances[1] = 1500.0;
        accountBalances[2] = 2000.0;
        accountBalances[3] = 2500.0;
        accountBalances[4] = 3000.0;

        // Display initial balances
        System.out.println("Initial Account Balances:");
        for (int i = 0; i < accountBalances.length; i++) {
            System.out.println("Account " + (i + 1) + ": $" + accountBalances[i]);
        }

        // Perform some operations
        // Deposit $500 to Account 1
        accountBalances[0] += 500.0;
        // Withdraw $200 from Account 2
        accountBalances[1] -= 200.0;
        // Check balance of Account 3
        System.out.println("Balance of Account 3: $" + accountBalances[2]);

        // Display updated balances
        System.out.println("Updated Account Balances:");
        for (int i = 0; i < accountBalances.length; i++) {
            System.out.println("Account " + (i + 1) + ": $" + accountBalances[i]);
        }
    }
}
