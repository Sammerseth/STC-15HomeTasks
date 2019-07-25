package ru.zolotarev.task10;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        vm.moneyAmount = 0;

        for (; ; ) {
            logger.fine( "Program starting.");
            vm.showMenu();
            String usrCommand = scanner.next();
            if (usrCommand.equalsIgnoreCase("add money")) {
                try {
                    vm.addMoney(vm.moneyAmount);
                    usrCommand = null;
                } catch (MoneyJamException e) {
                    logger.log(Level.SEVERE, e.getMessage(), e);
                }
            }
            if (usrCommand.equalsIgnoreCase("choose")) {
                try {
                    vm.chooseDrink();
                    usrCommand = null;
                } catch (NotEnoughMoneyException | InvalidCommandException e) {
                    logger.log(Level.SEVERE, e.getMessage(), e);
                }
            }

            if (usrCommand.equalsIgnoreCase("balance")) {
                vm.showBalance();
                usrCommand = null;
            }

            if (usrCommand.equalsIgnoreCase("show")) {
                vm.showDrinks();
                usrCommand = null;
            }
            logger.fine("Ending program.");
        }
    }
}