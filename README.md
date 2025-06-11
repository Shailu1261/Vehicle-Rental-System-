🚗 Vehicle Rental System
A simple terminal-based Java application that allows customers to register, view available vehicles, rent them, return them, and view rental history. This project demonstrates core Object-Oriented Programming (OOP) principles in Java.

📌 Table of Contents
Features

Tech Stack

OOP Concepts Used

How to Run

File Structure

Screenshots

Challenges Faced

Future Scope

Author

✨ Features
Register new customers with license and phone number

Display all available vehicles

Rent cars or bikes for a specified number of days

Return rented vehicles

View complete rental history

🛠 Tech Stack
Language: Java (JDK 8+)

Tools: Terminal/Command Prompt

Data Structure: Java Collection Framework (ArrayList, HashMap)

🔍 OOP Concepts Used
Concept	Used In
Abstraction	: Abstract class Vehicle and its method
Encapsulation : 	All class fields are private with get/set
Inheritance	: Car and Bike extend the Vehicle class
Polymorphism	: Overridden calculateRentalCost() in subclasses

----- Vehicle Rental System -----

Register Customer

Show Available Vehicles

Rent a Vehicle

Return a Vehicle

View Rental History

Exit

Sample Flow:

User opens the terminal and starts the application using java Main.

User selects "1. Register Customer" and enters their name, license number, and phone number.

User selects "2. Show Available Vehicles" to see all available cars and bikes.

User chooses "3. Rent a Vehicle", enters their license number, vehicle ID, and number of days to rent.

System calculates and displays the total cost using overridden calculateRentalCost() method.

User may later select "4. Return a Vehicle" to return the rented vehicle.

User can view the complete rental history by selecting "5. View Rental History".

Select "6. Exit" to close the program.

Behind the scenes:

All vehicle and customer data is stored in Java Collections (ArrayList, HashMap).

Inheritance is used with the Vehicle abstract class extended by Car and Bike.

Each vehicle object contains encapsulated data, and behavior is modified using polymorphism.

The RentalService class handles all user operations and business logic.


