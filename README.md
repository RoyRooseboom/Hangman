# Contents
- [Hangman The Game](#hangman-the-game) 
- [Why make Hangman?](#why-make-hangman)
- [What i have learned](#what-i-have-learned)
- [Things i ran into](#things-i-ran-into-when-making-this-game)

## Hangman The Game

Hangman, the game where you have to guess the correct word. Either by finding the letters that make up the word, or if you know the awnser, you can call out the entire word.

Can you win from the computer?

> ![image](https://github.com/user-attachments/assets/c9eec9aa-22e0-4eb5-b56d-c8a468ef4a23)

> ![image](https://github.com/user-attachments/assets/9be07e9a-4f5f-420c-81aa-79644250907a)

---

## Why make Hangman?

Hangman is a good exercise to learn the basics off Java.

Including:
  - Input / Output
  - Storing information
  - Manipulating data

## What i have learned?

  - The use off Regex
  - How to make code smaller, but not less efficient
  - **When** or **Why** the use off which loop (For, For Each, While)
  - Passing along data between Methods and Classes
  - Refactoring code is important to make it clearer and efficient


## Things i ran into when making this game.

Probably every programmer would know, that you could endlessly try to optimize everything about your personal projects.
However at some point you need to make the decision, and say: *"And it's done"*.

And ofcourse i had that with this project aswell. While there can always be improvements made, i would like to look back at the things i learned here.

  - Getting user input
    - What happens if they input a number or symbol, instead off a letter?
    - What if they want to input the word, but all they can do is input letters? 
  - Storing user input
    - What if they input 1 letter?
    - What if they input a full word?
    - What information will i store, and what will i not store?
  - Logic
    - The letter given, have we stored that already?
    - When given a word. Do we store the word? Or each individual letter?
    - What happens if the player inputs the wrong word, but individual letters off said word, are part off the awnser?
    - If they input the awnser as a word, how do we end the game immediately?
    - The words in the program are stored in UPPERCASE, what happens if the player inputs a lowercase letter?
  - Outputting information on screen to the player
    - What information are we going to give to the player?
    - How can i replace individual letters for underscores ( _ ) on screen, to make it more intressting visually for the player?
