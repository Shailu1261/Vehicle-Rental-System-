# 🚗 Vehicle Rental System (Java OOP Project)

This is a **console-based Java application** that simulates a basic **Vehicle Rental System** using core **Object-Oriented Programming (OOP)** principles. It allows users to view available vehicles, rent them, return them, and track rental records — all through the command line.

## 💡 Project Features

- Add vehicles (Car, Bike)
- Rent and return vehicles
- View available and rented vehicles
- Search vehicle by ID
- Calculate total rental charges
- Prevent double-booking of vehicles

## 🔧 Technologies Used

- **Language**: Java
- **Concepts**: Object-Oriented Programming (OOP)
  - Abstraction
  - Encapsulation
  - Inheritance
  - Polymorphism
- **Collections**: `ArrayList`, `HashMap`
- **No GUI** – Console-based interaction

## 📂 Project Structure

```bash
VehicleRentalSystem/
├── Vehicle.java         # Abstract class
├── Car.java             # Subclass of Vehicle
├── Bike.java            # Subclass of Vehicle
├── Customer.java        # Customer details
├── RentalService.java   # Core service logic
└── Main.java            # Main entry point
