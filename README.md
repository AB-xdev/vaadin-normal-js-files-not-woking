# vaadin-normal-js-files-not-woking


## How to reproduce the bug
* Checkout this repo
* Deploy the code onto an application server (I prefer Wildfly)
* Deploying via Eclipse and Wildfly works like this:
  * Import the project into Eclipse
  * Build the code with maven: ``clean compile vaadin:prepare-frontend``
  * Refresh the project
  * Deploy it onto your wildfly
* Open http://localhost:8080/minimalexample-1.0-SNAPSHOT/ in a browser
* Click the buttons → JavaScript-Functions are not found
