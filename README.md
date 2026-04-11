# 🚗 Vehicle Rental System

A simple **Java-based Vehicle Rental System** that demonstrates core **Object-Oriented Programming (OOP)** principles such as encapsulation, inheritance, and polymorphism.

---

## 📌 Project Overview

This is a **console-based application** that allows users to manage vehicle rentals efficiently.  
Users can:

- View available vehicles  
- Rent a vehicle  
- Return a vehicle  

The system is designed to be simple, clean, and beginner-friendly while showcasing fundamental Java OOP concepts.

---

## 🚀 Features

- 📋 View all vehicles with detailed information  
- 🔑 Rent a vehicle using a unique ID  
- 🔄 Return a rented vehicle  
- ✅ Track vehicle availability  
- 💰 Display rental price per day  

---

## 🚘 Supported Vehicle Types

The system supports multiple vehicle types:

- 🚗 Cars  
- 🏍️ Motorcycles  

---

## 🧠 OOP Concepts Implemented

### 🔒 Encapsulation
- Uses **private attributes**
- Accessed via **public getters and setters**

### 🧬 Inheritance
- `Car` and `Motorcycle` classes extend the `Vehicle` superclass

### 🔄 Polymorphism
- A `Vehicle` array stores different types of vehicle objects

### ✏️ Method Overriding
- Subclasses override the `toString()` method to display specific details

---

## 🏗️ Project Structure


```
vehiclerentalsystem/
│
├── Vehicle.java // Superclass
├── Car.java // Car subclass
├── Motorcycle.java // Motorcycle subclass
├── VehicleRentalSystem.java // Main class (menu system)

```

---

## ⚙️ How to Run the Project

### 1. Clone the Repository
``bash
- git clone https://github.com/your-username/vehicle-rental-system.git

### 2. Navigate to the Project Directory
cd vehicle-rental-system

### 3. Compile the Java Files
- javac vehiclerentalsystem/*.java

### 4. Run the Application
- java vehiclerentalsystem.VehicleRentalSystem
### 📚 Requirements
Java JDK 8 or higher
Any Java IDE (e.g., IntelliJ IDEA, NetBeans, Eclipse) or terminal

### 🖥️ Sample Usage
- 1. View Vehicles
- 2. Rent Vehicle
- 3. Return Vehicle
- 4. Exit

Enter your choice:
✨ Future Improvements
- Add a graphical user interface (GUI)
- Integrate a database for persistent storage
- Implement user authentication
- Add more vehicle types (e.g., trucks, vans)
- Include booking history and reports
  
## 👨‍💻 Author
-Mokadi Motsuenyane

### 🫱🏿‍🫲🏽 Contributing

### Contributions are welcome!

### 📄 License

This project is for educational purposes and is open for improvement.
