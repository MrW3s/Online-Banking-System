package com.banking;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AccountController {

    @FXML private TableView<AccountRow> accountTable;
    @FXML private TableColumn<AccountRow, Integer> accountNumberColumn;
    @FXML private TableColumn<AccountRow, Double> balanceColumn;
    @FXML private TextField amountField;

    private User user;
    private AccountRow selectedAccount;

    public void setUser(User user) {
        this.user = user;
        loadAccounts();
    }

    @FXML
    public void initialize() {

        accountNumberColumn.setCellValueFactory(
                new PropertyValueFactory<>("accountNumber")
        );

        balanceColumn.setCellValueFactory(
                new PropertyValueFactory<>("balance")
        );

        accountTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldVal, newVal) -> selectedAccount = newVal
        );
    }

    private void loadAccounts() {

        ObservableList<AccountRow> data = FXCollections.observableArrayList();

        if (user != null) {
            for (BankAccount acc : user.getAccounts()) {
                data.add(new AccountRow(
                        acc.getAccountNumber(),
                        acc.getBalance()
                ));
            }
        }

        accountTable.setItems(data);
    }

    @FXML
    private void handleDeposit() {

        if (selectedAccount == null) {
            System.out.println("Select an account first");
            return;
        }

        double amount;

        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (Exception e) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        for (BankAccount acc : user.getAccounts()) {
            if (acc.getAccountNumber() == selectedAccount.getAccountNumber()) {
                acc.deposit(amount);
                break;
            }
        }

        loadAccounts();
        amountField.clear();

        System.out.println("Deposited " + amount);
    }

    @FXML
    private void handleWithdraw() {

        if (selectedAccount == null) {
            System.out.println("Select an account first");
            return;
        }

        double amount;

        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (Exception e) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        for (BankAccount acc : user.getAccounts()) {
            if (acc.getAccountNumber() == selectedAccount.getAccountNumber()) {
                acc.withdraw(amount);
                break;
            }
        }

        loadAccounts();
        amountField.clear();

        System.out.println("Withdrew " + amount);
    }
}