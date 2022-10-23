# Salary Calculator
-   A class has been written in Java that processes the "Employee" factory workers and calculates their welcome with its methods. This class has 4 attributes and 5 methods. In console state Received with Name, salary, hours of work, start year, tax, bonus, salary earning, tax and bonus, total success achieved.


## Class Attributes 

- name : Emloyee name-surname
- salary : Employee Salary
- workHours : Weekly Working Hours
- hireYear : Employee Hireyear

## Class Methods

- Employee(name,salary,workHours,hireYear) : It is a constructor method and takes 4 parameters.
- tax() : It will calculate the tax applied to the salary.
- If the salary of the employee is less than 1000 TL, no tax will be applied.
- If the employee's salary is more than 1000 TL, 3% of his salary is taxed.
- bonus() : If the employee has worked more than 40 hours a week, bonus wages are calculated as 30 TL per hour of extra work.
- raiseSalary() : It will calculate the salary increase based on the employee's start year. The current year is taken as 2021.
- If the employee has been working for less than 10 years, his salary is increased by 5%.
- If the employee has been working for more than 9 years and less than 20 years, his salary is increased by 10%.
- If the employee has been working for more than 19 years, a 15% raise is made.
- toString() : The information of the employee is printed on the screen.


## Notes
- Taxes and bonuses are taken into account when calculating raiseSalary().
- With the tax() function, only the tax applied to the salary is calculated.
- Total salary: employee's own salary + increase + bonus
- For salary with tax and bonuses: tax was found with bonus and employee's own salary.

