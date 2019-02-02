This sample application is the minimum set to get an spring boot application started
- web container
- rest controller
- spring data jpa
- actuator


How to Build

* to compile-test, run "gradle test"
* to compile-test-build, run "gradle build"
* to compile-run, run "gradle run/bootRun"
* to dry run a task, run "gradle -m xxxTask"
* the test report will be generated at build/reports/tests/test/index.html


Use Cases

Topics
GET       /topics         Get all topics
GET       /topics/id      Get the topic
POST      /topics         Create new topic
PUT       /topics/id      Updates the topic
DELETE    /topics/id      Deletes the topic

Courses
GET       /topics/java/courses            get all courses under topic 'java'
GET       /topics/java/courses/java001    get the course under topic 'java'
POST      /topics/java/courses            add a new course under topic 'java'
PUT       /topics/java/courses/java001    update the course under topic 'java'
DELETE    /topics/java/courses/java001    delete the course under topic 'java'


Test using Postman
* either use postman or browser to send http get request
* use postman to send a http post/put/delete
  * in Headers, set Content-Type=application/json
  * in Body, change type to raw, and paste a json string in the textbox