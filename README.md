## Automated web tests using Serenity, Cucumber and Maven

A simple example of some BDD-style automated acceptance criteria.

* The project setup was taken from serenity github cook-books and was addapted for the given requirements.
Link:
https://github.com/serenity-bdd/serenity-demos/tree/master/cucumber-webtests

Run the tests like this:

```
mvn clean verify
```


I prefered firefox, so I have set it and also I have set the path to the driver.


The reports will be generated in `target/site/serenity`.




Notes:
-> From time to time it fails because for example the title is not changed withing 5 seconds. I don't know if this is a bug, a network problem or a test problem. I mean it can be fixed from the test but I don't want to do this.
I need to find out what the specifications says, but for any case I think 5 seconds to display the search result is a reasonable amount of time.
It might be a network problem - then I should increase the time - just to be on the safe side, this can hide a long time to reply problem.
On the other hand if I leave the time like it is from time to time it would fail the test. -> I think the best way is to run the test 2 or 3 times to see if it continues to fail. If it fails all the times then we have a problem.

On the other hand - these tests are made to check the functionality of the product - not the performance, maybe we should do performance in another test set, where we can analyze for the same search the time in which we receive replies and other things like these.


-> For this demo project I considered that the only language that ever exists is Spanish. In a normal porject I would have had a dictionary object that would translate all the texts depending on the language of the target website. This should be done even if "for the moment we only support english." Why? Because it is easier to change all the texts in one place and then if they (the product owners, company owners, stakeholders) decide to add a new language to the website, it would be super easy to add a new translation to the tests.

-> I know that WaitForTitle is not the best way to check that the page was loaded. There are better ways to do this, like waiting for a specific element to be displayed. Or even better find speccific functions in the API that are doing exactly this, telling when the dome has finished loading.


-> Using this structure for tests you separate web interface from test logic. And for example if you have mobile apps and web apps that have the same functionality you can use same tests but with a different ui code to test them also.



Folders structure and details:
- components -> here you will have common components code - a component is a part of a webpage that repeates in more than 1 page, this way we don't have to duplicate code.
- pages -> will contain only the code specific to each page. It will not contain any logic, just interact with the UI or grab neede information and pass it further.
- steps/serenity -> will contain the code specific to each page. It also contains logic for modifying the information to get only needed information.
- steps -> makes the link between the gherkin code and the java code from steps/serenity. It should contain only high level steps, no logic, just steps and asserts. - of course here we can add a new layer of folders to separate multiple feature files per bigger features. This can be decided in the team once the features get automated. 
- resources/features/ - contains a structure of folder/files for all features - the files will contain gherkin code that represents the tests that will run for each feature.
- there are some other files that will be changed at the beggining to configure the project and after that you just touch them when needed, like: build.gradle, pom.xml, serenity.properties, grade-wrapper.properties


Good practives:
- I have stated some in the Folders Structure
- Don't write code that you don't use (like adding UI elements that we don't use in the pages definitions)
- Follow gherkin standard rules when you write the gherkin code.
- Get the gherkin code validated with PM and devs before coding it - this implies writting the gherkin code first.
- No Copy/Paste in the project
- Keep it boring :) - Simple I mean. Boring code is good code.
