# 🏨 Hotel Management System

A simple Java-based Hotel Management System designed using Object-Oriented Programming principles. This system allows basic guest management, room handling, and reservation creation with OTP-based guest verification.

---

## 📁 Project Structure




HotelManagement/
├── Guest.java # Model class representing a guest
├── GuestManager.java # Manages guest registration, OTP generation & validation
├── Room.java # Model class for hotel rooms
├── RoomManager.java # Handles room creation, update, and pricing
├── RoomType.java # Enum for room types (SINGLE, DOUBLE, LUXUARY)
├── Reservation.java # Model for reservations
├── ReservationManager.java # Manages booking logic
├── Hotel.java # (Optional) Entry point for future expansions
└── Main.java # Main driver to test all functionality

yaml
Copy
Edit

> All classes are part of the `HotelManagement` package.

---

## 🚀 Features

- Add and manage hotel guests
- Generate & validate OTPs for guest verification
- Add, update, and retrieve room details
- Create reservations with date range validation
- Modular and clean OOP design

---

## 🛠️ How to Run

### ✅ Requirements

- Java 8 or higher
- Command Line Terminal or IDE (e.g. VS Code, IntelliJ)

### ▶️ Run via Terminal

1. Navigate to the folder containing `HotelManagement/`:
   ```bash
   cd path/to/Java

Sample Output

Guest Added : Rohit, Phone : +91 6294599756
OTP Generate : 7381
OTP Validation: true
Room Added --> Type : STANDARD, Price : 1000.0
Updated Room --> Type : SUITE, Price : 2000.0
Reservation Created --> Guest : Rohit, Room : 101, From 2025-06-11 to 2025-06-15
