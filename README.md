

# PayrollPro : A Java OOP-Based Payroll System 

A **Java-based** **Object-Oriented Programming (OOP)** project that efficiently manages employees in an organization.  
This system supports **full-time and part-time employees**, calculates salaries, removes employees. 

---

## 🚀 Features

✅ **Object-Oriented Design (OOP Principles)**
- Encapsulation, Abstraction, Inheritance, Polymorphism  
- Implements `Payable` interface for flexibility  

✅ **Employee Management**
- Add employees (Full-time, Part-time)  
- Remove employees by ID  
- Display all employees  

✅ **Salary Calculation**
- Full-time salary includes **monthly salary + bonus**  
- Part-time salary includes **hourly rate + overtime pay**  

✅ **Additional Functionalities**
- Calculate **total payroll cost**  

---

## ⚙️ Technologies Used

- **Java** (Core OOP Concepts)
- **Collections (ArrayList)**
- **Interfaces & Abstract Classes**
- **Method Overriding (Polymorphism)**  

---

## 📂 Project Structure

```
📂 Payroll-Management-System
 ├── src
    ├── 📄 Main.java               # Entry point
    ├── 📄 Employee.class           # Abstract base class
    ├── 📄 FullTimeEmployee.class   # Full-time employee class
    ├── 📄 PartTimeEmployee.class   # Part-time employee class
    ├── 📄 PayrollSystem.class      # Manages employees
    ├── 📄 Payable.class            # Interface for salary 
 ├── 📄 README.md               # Project documentation
```

---

## 🛠️ Installation & Usage

1. **Clone the repository**  
   ```sh
   git clone https://github.com/yourusername/PayrollPro.git
   cd Payroll-Management-System
   ```

2. **Run the Java program**  
   Compile and execute the `Main` class:
   ```sh
   javac Main.java
   java Main
   ```

---

## 📌 Example Output

```
Initial Employee List:
Employee [ID: 1, Name: Lokesh, Salary: $105000.0] [Full-Time, Bonus: $5000.0]
Employee [ID: 2, Name: Lucky, Salary: $54000.0] [Part-Time, Overtime Pay: $12000.0]
Employee [ID: 3, Name: Alex, Salary: $310000.0] [Full-Time, Bonus: $10000.0]

Total Payroll Cost: $469000.0


Removing Employee with ID 3...
Employee List After Removal:
Employee [ID: 1, Name: Lokesh, Salary: $105000.0] [Full-Time, Bonus: $5000.0]
Employee [ID: 2, Name: Lucky, Salary: $54000.0] [Part-Time, Overtime Pay: $12000.0]
```







