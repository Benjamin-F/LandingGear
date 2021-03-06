# The Landing Gears Sytem

Please note that our jar file needs jdk1.8 to execute properly.

### I. Wich project life cycle ?

Before to choose wich method we will use, we must define them.

#### Waterfall lifecycle
The Waterfall methodology is a stage by stage sequencial approach.
When a stage finishes, we can move to the next stage. The stages are analysis, design, implementation, testing and delivery.<br>
With this method, we can easily go backward and forward in the steps. Also,there's a good progression visibility as the different stages are clearily identified.<br>
But, this methodology doesn't handle change very well, it can easily leads to delays, additionnal cost or even quality issues. Finally, an error in design is highlighted during the testing stage, it could question the whole project. 

#### Iterative
The iterative process starts with a simple implementation of a subset of the software requirements and iteratively enhances the evolving versions until the full system is implemented. Each iteration is a small project with analysis, design, implementation and testing. At the end of each iteration, we release a working and demonstrable software.<br>
This method ensures quality because the team needs client acceptance between each iteration and it also support changing requirements.<br>
But, before to split the project into iteration, we will need a definition of the entire system.

#### Agile
Agile consists in splitting a project in multiple small functionnal pieces that will be implemented in short cylces (sprints). Each of those sprints have analysis, design, implementation and testing. They also have a predifined output.<br>
This method ensure a good response to changement as the project is split in multiple pieces. We will easily identify the "piece" we need to modify to implement the changes. It also lead to an active and involved team (short cycles).<br>
But, the planning of all the small projects can be hard and a lack of motivation can lead to failure.

#### Our choice
Considering these three methods, we chose the Agile life cycle.
Indeed, our project is small and can easily be splitted into small functionnal parts. As we are only two per team, this will help us to do parrellel development each one developing a set of pieces to finally gather them all. Moreover, Agile method is 'perfect' to answer to changes.

==========

### II. Diagrams
#### Class Diagram
<img src="/Diagrams/ClassDiagram.png" alt="alt text" width="1200" height="600">
#### State Machine
<img src="/Diagrams/StateMachine.png" alt="alt text" width="400" height="600">
#### Activity Diagram
<img src="/Diagrams/ActivityDiagram.png" alt="alt text" width="600" height="600">
#### Use case
<img src="/Diagrams/UseCase.png" alt="alt text" width="400" height="300">

==========

### III. Tests

As this first version only expects two actions from the user and doesn't handle errors the testing procedure is quite simple.<br>
1. Doors are closed and gears up. Move handle down and wait for the gears to go down.<br>
2. Doors are closed and gears down. Move handle up and wait for the gears to go up.<br>
3. Doors are closed and gears up. Move handle down and move it up while the gears/doors are moving. Gears go up.<br>
4. Doors are closed and gears down. Move handle up and move it down while the gears/doors are moving. Gears go down.<br>

==========

#### IV. Demo

Here are the screenshots of the outgoing sequence:<br>
<img src="/Screen/out1.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out2.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out3.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out4.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out5.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out6.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out7.png" alt="alt text" width="300" height="600"><br>
<img src="/Screen/out8.png" alt="alt text" width="300" height="600"><br>
