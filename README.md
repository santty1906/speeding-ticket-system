# 🚓 Speeding Ticket System

This is a Java-based console application that determines whether a driver should receive a speeding ticket based on the type of road and their current speed.

## 📋 Features

- User input via console (BufferedReader)
- Validates road type and speed
- Calculates if a speeding ticket applies
- Clear separation of logic using object-oriented programming
- Basic error handling with `try-catch`

## 🛠 Technologies Used

- Java
- BufferedReader for input
- Object-Oriented Programming (OOP)
- Console-based interaction

## 🚦 Road Types, Speed Limits and Fines

| Road Type       | Speed Limit (km/h) | Fine Rate per km/h Exceeded |
|-----------------|--------------------|-----------------------------|
| Residential Zone| 30                 | $5 per km/h                 |
| Urban Road      | 50                 | $10 per km/h                |
| Highway         | 100                | $2 per km/h                 |

> ⚠️ If your speed exceeds the limit for the selected road type, you will be fined based on the rate per km/h exceeded.

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/speeding-ticket-system.git
   cd speeding-ticket-system
