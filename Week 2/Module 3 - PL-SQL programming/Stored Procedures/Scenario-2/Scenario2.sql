-- The bank wants to implement a bonus scheme for employees based on their performance.
-- Question: Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

-- Scenario 2-> UpdateEmployeeBonus

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept IN VARCHAR2, bonus_pct IN NUMBER) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_pct / 100)
    WHERE Department = dept;
END;
/

-- Execute
BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/