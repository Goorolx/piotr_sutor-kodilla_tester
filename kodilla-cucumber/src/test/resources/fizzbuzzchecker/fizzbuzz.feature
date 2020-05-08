Feature: FizzBuzz
   Simple FizzBuzz game

   Scenario Outline: is it Fizz, Buzz or FizzBuzz?
      Given number is <number>
      When I ask whether it's Fizz or Buzz
      Then I should be told <answer>
   Examples:
            | number | answer |
            | 1 | "None" |
            | 2 | "None" |
            | 3 | "Fizz" |
            | 5 | "Buzz" |
            | 15 | "FizzBuzz" |
            | 16 | "None" |