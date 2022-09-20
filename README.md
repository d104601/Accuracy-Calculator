# Accuracy Calculator

## Description of Application
This Java application is built to calculate actual value and accuracy of data included(hw3.data1.csv) as direction of the assignment of "CS7700 Intro of Data Science" in Brooklyn College.
If you want to use this app for other data, please prepare csv data with following format

| column1 | column2 | ... | label |
|---------|---------|-----|-------|
| Integer | Integer | ... | Predicted values(1 or -1) |
| ... | ...| ...| ...|

## Assignment Detail
Thinking of a linear model from dataset, we come up with
```
y = 24*column1 + -15*column2 + -38*column3 + -7*column4 +
 -41*column5 + 35*column6 + 0*column7 + -2*column8 +
  19*column9 + 33*column10 + -3*column11 + 7*column12 +
  3*column13 + -47*column14 + 26*column15 + 10*column16 +
  40*column17 + -1*column18 + 3*column19 + 0*column20 + -6 
```

if y is > 0 then 1 othewise -1.
What is the accuracy? Calculate the confusion matrix for this model.
If cost of a false negative is $1000, and cost of a false positive is $100, (and $0 for an accurate answer), what is the expected economic gain?

## Requirements
Java version 8 or higher.

## Installation and Usage
Download the repository files and import it in Intellij IDEA or any other Java IDE.
And run application with "hw3.data1.csv" as program argument with proper directory. 

## Developed by Taeyong Lee
