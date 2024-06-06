
# Factory Method Design Pattern Example

## Overview

This project demonstrates the use of the Factory Method design pattern in Java. The Factory Method pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

## Table of Contents

1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Code Structure](#code-structure)
5. [Examples](#examples)
6. [Contributing](#contributing)
7. [License](#license)

## Introduction

The Factory Method design pattern is used to define an interface for creating an object but lets subclasses decide which class to instantiate. Factory Methods promote loose coupling by eliminating the need to bind application-specific classes into the code. This design pattern is commonly used in scenarios where the exact type of object to be created is determined at runtime.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/factory-method-example.git
    ```
2. Navigate to the project directory:
    ```bash
    cd factory-method-example
    ```
3. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).

## Usage

To run the example, execute the `main` method in the `Demo2` class.

## Code Structure

- `Factory`: The factory class that provides methods to create different types of vehicles.
- `Vehicle`: An abstract class or interface representing a general vehicle.
- `Car`, `Van`, `Bus`: Concrete classes that extend the `Vehicle` class.
- `Demo2`: The main class that demonstrates the use of the Factory Method pattern.

## Examples

### Example 1: Basic Factory Method

#### `Vehicle.java`
```java
public abstract class Vehicle {
    public abstract void drive();
}
```

#### `Car.java`
```java
public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
```

#### `Van.java`
```java
public class Van extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a van");
    }
}
```

#### `Bus.java`
```java
public class Bus extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a bus");
    }
}
```

#### `Factory.java`
```java
public class Factory {

    public Car getCar() {
        return new Car();
    }

    public Van getVan() {
        return new Van();
    }

    public Bus getBus() {
        return new Bus();
    }

    private static Factory instance;

    private Factory() {
        // Private constructor to prevent instantiation
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public Vehicle getVehicle(VehicleType type) {
        switch (type) {
            case CAR:
                return new Car();
            case VAN:
                return new Van();
            case BUS:
                return new Bus();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
```

#### `VehicleType.java`
```java
public enum VehicleType {
    CAR,
    VAN,
    BUS
}
```

#### `Demo2.java`
```java
public class Demo2 {

    public static void main(String[] args) {

        // First step
        Car car = new Factory().getCar();
        Van van = new Factory().getVan();
        Bus bus = new Factory().getBus();

        car.drive();
        van.drive();
        bus.drive();

        // Second step
        Vehicle car2 = Factory.getInstance().getVehicle(VehicleType.CAR);
        Vehicle van2 = Factory.getInstance().getVehicle(VehicleType.VAN);
        Vehicle bus2 = Factory.getInstance().getVehicle(VehicleType.BUS);

        car2.drive();
        van2.drive();
        bus2.drive();
    }
}
```

## Contributing

If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are welcome.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.





![Screenshot 2024-06-06 090322](https://github.com/Sandaluthushan20/Factory-Method/assets/108582011/fb6b967f-99e1-4d89-8ec1-d6fb99d98c31)
