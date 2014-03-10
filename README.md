waydnapp
========

# What is waynapp?

waydnapp = What Are You Doing Now App. A simple activity tracker that will show you what tasks your spend your time on, in order to improve your way of doing things and be more productive.

# Will will the user do with waynapp?

## Visualization

The app will show the user on what tasks he has been working on all day. The user will be able to identify tasks that provide no benefits or have no purpose, and reduce the time to spend one those, saving time to spend on more valuable and enjoying tasks. The user will be able to identify recurring tasks, in order to optimize the way of doing them or even automate them.

## Statistics

Will provide data and charts concerning these questions:

* How much of my day did I spend on what tasks?
* What recurring tasks are that and what is the average time I spent on them?
* What has been the value of that tasks?
* How did I feel while doing them?
* Do I improve?

## Encourage users to do better decisions

The app's purpose is to change the user's perception of time and it's value. It encourages to do meaningful decisions in the future, be more productive following your goals and to have more fun doing that.

#Running the application

##Run codeserver

```
mvn gwt:run-codeserver
```


##Run app

```
mvn gwt:run
```

#Maintenance tasks

##Copy web resources into target
This command will copy the web app parts from src/main/webapp into your target folder. Everytime you change something in the files in src/main/webapp you need to rerun this.

```
mvn war:exploded
```
