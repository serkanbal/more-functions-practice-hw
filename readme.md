---
title: More Functions Practice
type: Homework
duration: "1:30"
creator:
    name: Kristen Tonga
    city: NYC
---


# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) More Functions Practice Homework

## Introduction

Sometimes we all need a bit of guidance in our life. For this assignment, you will create a simple "magic eight ball" that runs on the command line. Like a real  magic eight ball, it will give a random answer to the questions on our minds.

The user won't actually type their question into the command line, but the game should instruct the user to think about their question. Then the game will give a randomly selected response, as if it knew what question they were thinking. Then the game will ask the user if they want to play again, and then the user will type yes or no, and the game will repeat or end as needed.

## Exercise

#### Requirements

- Create a method (for example, `getRandomNumber()`) that returns a random number between 0 and 8.


- Create a method (e.g. `shakeTheBall()`) that calls the first method to get a random number, uses a `switch` statement to pick a response based on that number, and prints the response to the console.

  Here are the traditional magic eight ball responses. Feel free to pick 9 of these to use, or come up with your own:
  - It is certain
  - It is decidedly so      
  - Without a doubt      
  - Yes, definitely      
  - You may rely on it      
  - As I see it, yes      
  - Most likely      
  - Outlook good      
  - Yes      
  - Signs point to yes      
  - Reply hazy try again      
  - Ask again later      
  - Better not tell you now      
  - Cannot predict now      
  - Concentrate and ask again      
  - Don't count on it      
  - My reply is no      
  - My sources say no      
  - Outlook not so good      
  - Very doubtful


- Create a method (e.g. shakeAgain()) that asks if the user wishes to play again, and responds accordingly. Use the Scanner class. User input should be case insensitive, and spaces before or after the words should not matter.


- Start the "shake" from the main method.


**Bonus:**
- Add a countdown, with delay, so that the trepidation is high when the answer is given.
- Create a visual representation of the magic eight ball - maybe some ascii art.
- Make it more interactive by adding a second level of questioning.

#### Starter code

There is no starter code! Please create a new IntelliJ project inside your forked/cloned repo.


#### Deliverable

A pull request with your completed code. We expect to be able to ask a question and receive a response from the powers that be, well, the magic algorithms anyway :)


#### Additional Resources

- A link to [the Wikipedia page on Magic 8 Balls](https://en.wikipedia.org/wiki/Magic_8-Ball)

---

## Licensing
1. All content is licensed under a CC­BY­NC­SA 4.0 license.
2. All software code is licensed under GNU GPLv3. For commercial use or alternative licensing, please contact [legal@ga.co](mailto:legal@ga.co).
