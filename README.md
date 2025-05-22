# Smart Canteen Management System

A Spring Boot-based backend system developed for **University of Vavuniya** to manage multiple campus canteens, food menus, students, employees, and food ordering in a smart and scalable way.

## 📌 Project Overview

This application is designed to streamline operations across multiple canteens within the university campus. It handles:
- Canteen and employee management
- Daily food menus
- Student-based food ordering
- Entity relationships using Spring Data JPA

---

## 🏗️ Features

- 📍 Manage multiple canteens (with location tracking)
- 🥘 Maintain a centralized list of approved food items
- 📅 Define daily menus per canteen
- 👨‍🎓 Student and 👩‍💼 Employee profile management
- 📦 Place food orders with itemized quantity and date tracking
- 🔗 Strong entity relationships with Hibernate ORM
- 📂 Auto database migration with Spring JPA

---

## 🗂️ Entity Relationship Summary

### 👤 Person (Abstract)
- Common fields: `id`, `name`, `age`, `gender`

### 👨‍🎓 Student extends Person
- Additional: `academicDegree`
- Relationships: 
  - One-to-Many with `FoodOrder`

### 👩‍💼 Employee extends Person
- Additional: `position`
- Relationships: 
  - Many-to-Many with `Canteen`

### 🏢 Canteen
- Fields: `name`, `location`
- Relationships: 
  - One-to-Many with `DailyMenu`
  - Many-to-Many with `Employee`

### 🥘 FoodItem
- Fields: `name`, `price`, `weight`
- Relationships: 
  - Many-to-Many with `DailyMenu`
  - Many-to-One with `OrderLine`

### 📅 DailyMenu
- Fields: `date`
- Relationships:
  - Many-to-One with `Canteen`
  - Many-to-Many with `FoodItem`

### 🧾 FoodOrder
- Fields: `orderDate`
- Relationships:
  - Many-to-One with `Student`
  - One-to-Many with `OrderLine`

### 🧾 OrderLine
- Fields: `quantity`
- Relationships:
  - Many-to-One with `FoodOrder`
  - Many-to-One with `FoodItem`

---

## ⚙️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven

---

## 🔌 Getting Started

### ✅ Prerequisites

- Java 17+
- MySQL running (create a database named `scm`)
- Maven
