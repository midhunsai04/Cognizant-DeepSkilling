-- The bank wants to send reminders to customers whose loans are due within the next 30 days.
-- Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer

-- Scenario 3: Loan reminders within 30 days

SET SERVEROUTPUT ON;
BEGIN
    FOR l IN (SELECT l.LoanID, l.CustomerID, l.EndDate, c.Name
              FROM Loans l JOIN Customers c ON l.CustomerID = c.CustomerID
              WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30)
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.LoanID || ' for customer ' || l.Name || ' is due on ' || TO_CHAR(l.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
