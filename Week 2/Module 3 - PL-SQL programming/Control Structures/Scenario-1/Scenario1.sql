-- The bank wants to apply a discount to loan interest rates for customers above 60 years old.
-- Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, 
-- apply a 1% discount to their current loan interest rates.

-- Scenario 1: Discount for age > 60

BEGIN
    FOR c IN (SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
              FROM Customers c JOIN Loans l ON c.CustomerID = l.CustomerID)
    LOOP
        IF MONTHS_BETWEEN(SYSDATE, c.DOB) / 12 > 60 THEN
            UPDATE Loans SET InterestRate = InterestRate - 1
            WHERE LoanID = c.LoanID;
        END IF;
    END LOOP;
END;
/