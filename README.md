# Battleship Game

## Project Description

The Battleship Game project is a Java-based implementation of the classic game Battleship. It allows players to play a turn-based version of the game where they strategically place their ships and try to sink their opponent's fleet.

## Project Structure

All project files are organized in packages and classes, each serving a specific purpose. Here's a brief overview of the main classes and their functionalities:

- `Battleship.java`: The main entry point of the game, containing the game loop and user interface.
- `Board.java`: Represents the game board, including methods for creating the board, placing ships, and tracking square statuses.
- `Display.java`: Handles the user interface, including displaying the game board, menus, and messages.
- `Game.java`: Manages the game logic, including player turns, ship placement, and checking for a winner.
- `Input.java`: Handles user input, including menu selections and coordinate inputs.
- `Main.java`: The main class that starts the application by initializing and running the game.
- `Player.java`: Represents a player, their ships, and manages their game state.
- `Ship.java`: Represents individual ships, including their type and location.
- `Square.java`: Represents a square on the game board, including its status and position.
- `BoardFactory.java`: Contains methods for random and manual ship placement on the game board.
- `MenuItem.java`: Enum defining menu items with their corresponding numbers and descriptions.
- `PlacementModes.java`: Enum defining ship placement modes with their numbers and descriptions.
- `ShipType.java`: Enum defining ship types with their sizes and quantities.
- `SquareStatus.java`: Enum defining square statuses with their character representations.

## Project Context

This project was created as an exercise to implement a classic game in Java. It's intended for educational and entertainment purposes and serves as a demonstration of object-oriented programming principles.

## Requirements

The game is designed to meet the following requirements:

- Players can choose between manual or random ship placement.
- Supports both single-player and two-player modes.
- Provides a simple text-based user interface.
- Implements the core rules of the Battleship game.

## Why Explore This Project

- Learn Java: This project is a great way to learn Java programming and practice object-oriented design.
- Classic Game: If you enjoy classic board games, exploring this project can be a fun experience.
- Code Organization: It demonstrates how to structure code in Java projects.

## Possible Future Improvements

- Implement a graphical user interface for a more interactive experience.
- Add more game modes or rule variations.
- Enhance error handling and user feedback.
- Implement high score tracking.
- Expand the game with additional features and customization options.

## Project Type

This project primarily focuses on the back-end logic of the game, with a text-based front-end for user interaction.
