# Java AWT Project

## Overview

This is a Java-based project that utilizes AWT (Abstract Window Toolkit) to create a graphical user interface (GUI). The project demonstrates the usage of AWT components such as buttons, labels, text fields, and event handling mechanisms.

## Features

- Graphical User Interface (GUI) built using AWT.
- Interactive components such as buttons, labels, and text fields.
- Event handling for user interactions.
- Basic window management (open, close, minimize, maximize).
- Uses external libraries for additional functionality (e.g., date selection, database handling, email services).

## Prerequisites

Before running the project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Any Java-supported IDE (Eclipse, IntelliJ IDEA, NetBeans) or a terminal with Java compiler
- Required dependencies:
  - `jcalendar-1.4.jar`
  - `javax.mail-1.6.2.jar`
  - `protobuf-java-3.19.4.jar`
  - `ojdbc14.jar`
  - `rs2xml.jar`

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```
3. Compile the Java files:
   ```bash
   javac -d bin src/com/GYM/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin com.GYM.Main
   ```

## Usage

- Run the application to launch the AWT-based GUI.
- Click on buttons to trigger various events.
- Enter text in input fields where applicable.

## Project Structure

```
|-- .settings/                  # Eclipse settings folder
|-- bin/                         # Compiled class files
|-- lib/                         # External libraries
|   |-- jcalendar-1.4.jar        # External library for date selection
|   |-- javax.mail-1.6.2.jar     # JavaMail API for email handling
|   |-- protobuf-java-3.19.4.jar # Protocol Buffers support
|   |-- ojdbc14.jar              # Oracle JDBC driver for database connectivity
|   |-- rs2xml.jar               # XML parsing library for database result sets
|-- src/                         # Source code directory
|   |-- com/
|   |   |-- GYM/
|   |       |-- Coach.java
|   |       |-- DataBase.java
|   |       |-- Finance.java
|   |       |-- JTableData.java
|   |       |-- Loading.java
|   |       |-- LogIn.java
|   |       |-- Members.java
|   |       |-- Print.java
|   |       |-- Printer.java
|-- .classpath                   # Eclipse project classpath settings
|-- .project                      # Eclipse project file
|-- README.md                     # Project documentation
```

## Contributions

Contributions are welcome! If you'd like to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For any questions or suggestions, feel free to reach out via email or open an issue in the repository.

