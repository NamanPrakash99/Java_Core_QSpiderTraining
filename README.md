# Java Training Repository - LPU

A comprehensive Java programming repository containing practical examples, exercises, and implementations covering fundamental to advanced Java concepts. This repository serves as a learning resource for Java developers and students.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Topics Covered](#topics-covered)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Repository Structure](#repository-structure)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This repository contains a comprehensive collection of Java programs organized by topics, covering everything from basic programming concepts to advanced Java features. Each topic includes multiple examples and practical implementations to help understand Java programming concepts effectively.

## ✨ Features

- **Comprehensive Coverage**: 30+ Java topics with practical examples
- **Well-Organized**: Code organized by topics for easy navigation
- **Practical Examples**: Real-world implementations and problem-solving exercises
- **Progressive Learning**: From basics to advanced concepts
- **Ready to Run**: All code examples are executable and tested

## 📚 Topics Covered

### Core Java Fundamentals
- **Operators**: Arithmetic, logical, relational, and bitwise operators
- **Decision Statements**: if-else, switch-case implementations
- **Loops**: for, while, do-while loops with various examples
- **Methods**: Method creation, overloading, and method chaining
- **Arrays**: Single and multi-dimensional arrays with 35+ tasks

### Object-Oriented Programming (OOP)
- **OOP Fundamentals**: Classes, objects, constructors
- **Encapsulation**: Data hiding and access modifiers
- **Inheritance**: Single, multilevel, and hierarchical inheritance
- **Polymorphism**: Method overriding and runtime polymorphism
- **Abstraction**: Abstract classes and interfaces
- **Non-Primitive Upcasting**: Type casting examples

### Advanced Java Concepts
- **Collections Framework**
  - **List Implementations**: ArrayList, LinkedList, Vector
  - **Stack**: Stack data structure implementations
  - **Queue**: Queue implementations
  - **Set Implementations**: HashSet, LinkedHashSet, TreeSet
  - **Map Implementations**: HashMap implementations
- **Comparable & Comparator**: Custom sorting implementations
- **Exception Handling**: Try-catch, finally, custom exceptions (50+ examples)
- **File Handling**: Reading and writing files, file operations
- **Wrapper Classes**: Primitive to object conversions
- **Object Class**: toString(), equals(), hashCode() implementations

### String Manipulation
- 50+ string manipulation programs including:
  - Palindrome checking
  - Anagram detection
  - String reversal
  - Word counting
  - Duplicate character/word finding
  - Email validation
  - Panagram checking
  - String compression
  - And many more...

### Functional Programming
- Lambda expressions
- Functional interfaces
- Stream API examples
- Method references

### Additional Topics
- **Has-A Relation**: Composition and aggregation
- **Type Casting**: Primitive and non-primitive type casting
- **Anonymous Classes**: Inner class implementations
- **Programming Assignments**: Week-wise assignments and tasks

## 📁 Project Structure

```
Java_Training_LPU/
├── src/
│   ├── AbstractionInterface/
│   ├── AnonymousClass/
│   ├── arrays/
│   ├── Collection_Queue/
│   ├── Collections/              (LinkedList, Vector, Stack examples)
│   ├── Comparable/
│   ├── Comparator/
│   ├── DescisionStatement/
│   ├── Encapsulation/
│   ├── exceptions/
│   ├── FileHandling/
│   ├── FunctionalProgramming/
│   ├── hasarelation/
│   ├── HashMap/
│   ├── Inheritance/
│   ├── LinkedHashSet/
│   ├── loops/
│   ├── methodchaining/
│   ├── methods/
│   ├── NonPrimitiveUpcasting/
│   ├── ObjectClass/
│   ├── oopsFundamentals/
│   ├── operator/
│   ├── Polymorphism/
│   ├── programming_1/
│   ├── strings/
│   ├── TreeSet/
│   ├── typeCasting/
│   ├── week1_Assignments/
│   └── WrapperClass/
├── bin/
└── student.txt
```

## 🔧 Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher
  - Download from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **IDE** (Optional but recommended):
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/downloads/)
  - [VS Code](https://code.visualstudio.com/) with Java extensions
- **Text Editor**: Any text editor for viewing code

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/java-training-lpu.git
cd java-training-lpu
```

### Compile Java Files

Navigate to the source directory and compile:

```bash
cd Java_Training_LPU/src
javac packageName/ClassName.java
```

### Run Java Programs

```bash
java packageName.ClassName
```

### Example

```bash
javac arrays/Task1.java
java arrays.Task1
```

## 💻 Usage

### Running Individual Examples

Each package contains multiple Java files. To run a specific example:

1. Navigate to the `Java_Training_LPU/src` directory
2. Compile the Java file:
   ```bash
   javac packageName/FileName.java
   ```
3. Run the compiled class:
   ```bash
   java packageName.FileName
   ```

### Using an IDE

1. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.)
2. Import the project as a Java project
3. Navigate to any Java file in the `src` directory
4. Run the file directly from the IDE

## 📖 Repository Structure

### Key Directories

- **`arrays/`**: Contains 35 array manipulation tasks covering various array operations
- **`strings/`**: 50+ string manipulation programs for text processing
- **`exceptions/`**: Comprehensive exception handling examples
- **`Collections/`**: Complete collection framework implementations including LinkedList, Vector, and Stack
- **`FunctionalProgramming/`**: Modern Java features with lambda expressions
- **`oopsFundamentals/`**: Object-oriented programming basics
- **`Inheritance/`**: Inheritance hierarchy examples
- **`Polymorphism/`**: Polymorphism demonstrations

### Example Programs

- **Arrays**: Finding max/min, sorting, searching, matrix operations
- **Strings**: Palindrome, anagram, word count, string reversal
- **Collections**: LinkedList, Vector, Stack, List, Set, Map implementations with practical examples
- **OOP**: Real-world examples like Vehicle hierarchy, Calculator implementations
- **Exceptions**: Try-catch blocks, custom exceptions, exception propagation

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Contribution Guidelines

- Follow Java naming conventions
- Add comments to explain complex logic
- Ensure code compiles without errors
- Test your code before submitting
- Update documentation if needed

## 📝 Notes

- All code examples are educational and meant for learning purposes
- Some examples may contain commented code for demonstration
- The repository is organized by topics for easy navigation
- Each topic folder contains multiple related examples

## 🎓 Learning Path

Recommended learning order:

1. **Basics**: Start with `operator/`, `DescisionStatement/`, `loops/`
2. **Methods & Arrays**: `methods/`, `arrays/`
3. **OOP Fundamentals**: `oopsFundamentals/`, `Encapsulation/`
4. **Inheritance & Polymorphism**: `Inheritance/`, `Polymorphism/`
5. **Abstraction**: `AbstractionInterface/`
6. **Collections**: `Collections/`, `HashMap/`, `TreeSet/`
7. **Advanced**: `exceptions/`, `FileHandling/`, `FunctionalProgramming/`
8. **Practice**: `strings/`, `programming_1/`, `week1_Assignments/`

## 📄 License

This project is open source and available for educational purposes. Feel free to use, modify, and distribute the code for learning.

## 👨‍💻 Author

Created as part of Java training program.

## 🙏 Acknowledgments

- Lovely Professional University (LPU) for the training curriculum
- Java community for excellent documentation and resources

---

**Happy Coding! 🚀**

If you find this repository helpful, please consider giving it a ⭐ star!

