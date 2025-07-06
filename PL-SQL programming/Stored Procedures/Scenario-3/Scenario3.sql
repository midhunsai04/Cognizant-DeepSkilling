-- Customers should be able to transfer funds between their accounts.
-- Question: Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

-- Scenario 3-> TransferFunds

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
) IS
    from_balance NUMBER;
BEGIN
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_acc FOR UPDATE;

    IF from_balance >= amount THEN
        UPDATE Accounts SET Balance = Balance - amount, LastModified = SYSDATE WHERE AccountID = from_acc;
        UPDATE Accounts SET Balance = Balance + amount, LastModified = SYSDATE WHERE AccountID = to_acc;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient funds in account ' || from_acc);
    END IF;
END;
/

BEGIN
    TransferFunds(1, 2, 500);
END;
/


