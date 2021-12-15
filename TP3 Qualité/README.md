# Selennium Test Case for todomvc.com with JUnit

1. __Connect:__ Connect to the url https://todomvc.com
1. __Choose a technology:__ Click on a technology link (Backbone.js ...)
1. __Add todo:__ Add several examples of actions (Meet a friend, Buy meat, clean the car ...).
1. __Check an action:__ Check one or more actions.
1. __test:__ Compare the x item (s) left field with the expected result.

# ParameterizedTest

Use the same Test case for multiple technologies.

# Maven Surefire Plugin

Use the Maven Surefire Plugin to generate test reports.

Run the command 

```
mvn test
```
You can see the report in `/target/site/surefire-report.html`
