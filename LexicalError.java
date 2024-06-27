// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the LexicalError class to create an error if the tokens in scene are incorrect

package jaden_russell_project1;

// Class that defines a lexical error

class LexicalError extends Exception
{
    // Constructor that creates a lexical error object given the line number and error

    public LexicalError(int line, String description)    {
        super("Lexical Error on Line: " + line + " " + description);
    }
}