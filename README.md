# Final-Project
Name: Jesus Davila
RedId:823247926
Date: May 14, 2020
Name of the Program: BookLibrary

Description:

The BookLibrary program takes in the Books that user wants to add to their library and will sort and find if a particular book is present in the library.
It also tests the methods using various test cases.

Summary of methods used:

Interface: BookFinder with two methods sort and binarySearch.
Abstract Class: BookSorter implements the sort method in interface BookFinder.
Class BookSearcher: Extends BookSorter and implements the binarySearch method in interface BookFinder.
Class Display: Contains method to display the Book library of the user.
Class UnitTests: Contains methods to test the methods written in each class.
                 Test Cases considered are:
                                            An ArrayList with 5 book names.
                                            An ArrayList with 1 book name.
                                            An ArrayList with 0 book names.
Class BookLibrary: The main code that calls the respective methods as per user's choice.
