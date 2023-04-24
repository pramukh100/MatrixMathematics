Feature: Matrices workout
  As a mathematician
  I want to perform mathematical task on matrices
  So I can prove the methods.

  Background:
    Given User want "4" row and "4" column in matrix
    When User creating a two matrices
    Then User print two matrices in console

  Scenario: Add two Matrices
    When  User add two matrices
    Then User must see "Addition" result matrix

  Scenario: Subtraction two Matrices
    When  User subtract two matrices
    Then User must see "Subtraction" result matrix


  Scenario: Multiplication two Matrices
    When  User multiply two matrices
    Then User must see "Multiplication" result matrix