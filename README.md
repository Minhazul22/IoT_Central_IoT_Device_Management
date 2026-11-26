# IoT Central – IoT Device Management

A Java-based project for managing IoT devices. The project is being developed in phases, starting with core Java and object-oriented programming before moving toward sensor data, monitoring, and a larger device-management platform.

> **Current stage:** Phase 2 – Core Java / OOP foundations  
> **Status:** Early development. The current implementation is a learning-stage console application, not yet a complete IoT platform.

## Project goals

The long-term goal is to build a system that can represent and manage IoT devices, collect sensor measurements, evaluate thresholds, and provide monitoring and analytics.

Planned capabilities include:

- Registering and managing IoT devices
- Representing sensor types and measurements
- Defining measurement thresholds and generating alerts
- Viewing device and sensor information
- Persisting data and exposing services through an API
- Building a dashboard for monitoring and analytics

These are project goals; they are not all implemented yet.

## Current implementation

The current Java application establishes the first device-management concepts:

- **`Device`** – represents a device with a name, UUID, and status.
- **`DeviceStatus`** – defines the device states `ONLINE`, `OFFLINE`, and `MAINTENANCE`.
- **Device initialization** – a newly created device starts with `OFFLINE` status.
- **Encapsulation** – device fields are private and accessed through getter methods; the status can be changed through a setter.
- **Device collection** – the demonstration creates device objects, stores them in an `ArrayList<Device>`, iterates through the list, and counts online devices.

The current example uses simulated device objects; it does not connect to physical hardware or receive live sensor readings.

## Technology stack

| Technology | Purpose |
|---|---|
| Java 21 | Main programming language |
| Maven | Project build and dependency management |
| IntelliJ IDEA | Development environment |
| Git and GitHub | Version control and source hosting |

The Maven project uses `com.iotcentral` as its group ID and `com.iotcentral.device` as the current Java package.

## Project structure

```text
IoT_Central_IoT_Device_Management/
├── pom.xml
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── iotcentral/
    │               └── device/
    │                   ├── Device.java
    │                   ├── DeviceStatus.java
    │                   └── Main.java
    └── test/
        └── java/
            └── com/
                └── iotcentral/
```

## Getting started

### Prerequisites

- JDK 21
- IntelliJ IDEA or another Java IDE
- Git (optional, for cloning and version control)

### Clone the repository

```bash
git clone https://github.com/Minhazul22/IoT_Central_IoT_Device_Management.git
cd IoT_Central_IoT_Device_Management
```

### Open the project

Open the project folder in IntelliJ IDEA and allow IntelliJ to import the Maven project.

### Build the project

On Windows PowerShell:

```powershell
mvn clean compile
```

You can also use the Maven tool window in IntelliJ IDEA to run the `clean` and `compile` lifecycle goals.

### Run the application

Run the `main` method in:

```text
src/main/java/com/iotcentral/device/Main.java
```

The current demonstration creates sample device objects and prints device information and status counts to the console.

## Development roadmap

The work is planned in stages. Items below describe intended work and should not be read as completed functionality.

### Phase 1 – Planning and architecture
- [x] Define the project direction and initial architecture
- [x] Establish the development environment and Maven project

### Phase 2 – Core Java and object-oriented programming
- [x] Create the `DeviceStatus` enum
- [x] Create the initial `Device` class
- [x] Initialize new devices with an `OFFLINE` status
- [x] Add getters and a status update method
- [x] Create sample devices and manage them with an `ArrayList`
- [x] Iterate through devices and count online devices
- [ ] Extend and refine the device model
- [ ] Implement the sensor class hierarchy
- [ ] Add measurement and threshold models

### Future phases
- [ ] Add sensor measurement generation and threshold evaluation
- [ ] Add alert handling and analytics
- [ ] Integrate PostgreSQL for data persistence
- [ ] Build a Spring Boot REST API
- [ ] Develop a web dashboard using HTML, CSS, JavaScript, and Chart.js
- [ ] Explore Docker-based deployment
- [ ] Explore integration with hardware such as ESP32 or STM32

## Learning focus

This repository is also a hands-on Java learning project. The early stages focus on writing and understanding the code, including:

- Classes and objects
- Constructors
- Encapsulation, getters, and setters
- Enums
- UUID generation
- Collections with `ArrayList`
- Loops and conditional logic
- Object-oriented design

## Contributing

This is currently an individual learning and development project. Suggestions and constructive feedback are welcome through GitHub Issues.

## License

No license has been specified yet. All rights are reserved by default unless a license is added to this repository.
