waydnapp
========

waydnapp = What Are You Doing Now App. A simple activity tracker that will show you what tasks your spend your time on, in order to improve your way of doing things.

##Running the application

###Run codeserver

```
mvn gwt:run-codeserver
```


###Run app

```
mvn gwt:run
```

##Maintenance tasks

###Copy web resources into target
This command will copy the web app parts from src/main/webapp into your target folder. Everytime you change something in the files in src/main/webapp you need to rerun this.

```
mvn war:exploded
```