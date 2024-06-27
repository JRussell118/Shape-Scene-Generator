/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the SyntaxError class to create an error if the syntax in scene is incorrect

// Class that defines a syntax error
package jaden_russell_project1;
class SyntaxError extends Exception
{
    // Constructor that creates a syntax error object given the line number and error

    public SyntaxError(int line, String description) {
        super("Syntax Error on Line: " + line + " " + description);
    }
}