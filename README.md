This file explains how to compile and run each exercise from the command line, as required by the instructions. Make sure you are located in the folder where the .java file is before executing the commands.

***Exercise 1: List directory recursively on screen

Statement: Create a class that lists alphabetically the contents of a directory received as a parameter.

javac Main.java
java Main

***Exercise 2: List directory and save to TXT file

Statement: Add to the class from the previous exercise the functionality to list a directory tree with the contents of all its levels (recursively), printing on screen in alphabetical order within each level, also indicating whether it is a directory (D) or a file (F), and its last modification date.

javac Main.java
java Main

***Exercise 3: Save result to TXT file

Statement: Modify the previous exercise. Now, instead of showing the result on screen, save the result in a TXT file.

javac Main.java
java Main

***Exercise 4: Read TXT file and display contents

Statement: Add the functionality to read any TXT file and display its contents on the console.

javac Main.java
java Main

***Exercise 5: Serialize and deserialize an object

Statement: Now the program must serialize a Java Object to a .ser file and then deserialize it.

javac Main.java
java Main

Important Notes:

If the file is inside a package, you must compile and run indicating the package name:

javac package/name/Main.java
java package.name.Main

If you have several .java files in a folder, you can compile them all with:

javac *.java

To run correctly, the .class file must be in the same path or within the classpath.

Complete Example:

Suppose you have the file at:

C:\Users\Adrià\Desktop\Sprint1\src\Exercici1\Main.java

Then:

cd C:\Users\Adrià\Desktop\Sprint1\src\Exercici1
javac Main.java
java Main

With these instructions, each exercise can be compiled and executed without depending on any editor such as IntelliJ or Eclipse.

-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

📄 Description – Exercise StatementEach exercise aims to learn basic Java functionalities: directory listing, recursion, TXT file manipulation, and object serialization.

💻 Technologies Used

Java SE (Standard Edition)

Basic Java libraries (java.io, java.util, java.text)

Console / command line

📋 Requirements

JDK installed (version 17 or higher recommended)

Access to a terminal (cmd, PowerShell, bash)

🛠️ Installation

Download the project.

Navigate to the src folder.

Verify that the .java files are available.

▶️ Execution

Compile with javac Main.java.

Run with java Main.

Follow the instructions displayed on the console.

🌐 DeploymentThis project is educational and does not require server deployment. It can be run locally.

🤝 Contributions

Follow the standard Java coding style.

Add explanatory comments.

Propose improvements via pull requests if shared on GitHub.
