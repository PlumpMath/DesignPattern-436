# Command Pattern

The command pattern is a behavioural design pattern in which
an object is used to represent and encapsulate all the information
need to call a method at a later time.

This information includes the method name, the object that owns
the method and values for the method parameters.

Allows you to store lists of code that is executed at a later
time or many times.

Client says I want a specific Command to run when execute() is
called on 1 of these encapsulated(hidden) Objects

An Object called the Invoker transfers this command to another
Object called a Receiver to execute the right code.

TurnTVOn - DeviceButton - TurnTVOn - Television.TurnTVOn()


Benefits of Command Pattern:
Allows you set aside a list of commands for later use

A class is a great place to store procedures you want to be
executed.

You can store multiple commands in a class to use over and over

You can implement undo procedure for past commands

Negative: You create many small classes that store lists of
commands.