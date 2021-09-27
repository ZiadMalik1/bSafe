## bSafe ##
## Inspiration
The Facebook Challenge called for us to create a project that made a real world difference for people around the world by creating an application that was accessible to the majority of the users of the Internet. We looked to issues around the world that did not get addressed enough and found the issue of Domestic Violence and Abuse.
## What it does
Allows Victims or Witnesses of Abuse, Domestic Violence and other Acts of Crime to report activities and alleged persons to the Police Department using the bSafe Secrecy App. This app holds a Facade of the Facebook Mobile App and allows for users who know of it to use a special login process to submit a report without any need to submit location or time as the API retrieves this information as soon as the report is submitted using the Device's IP address.
## How we built it
We went ahead and created a model/schema that allowed for there to be a "Librarian" for the two parties involved in situations such as this. **The bSafe Application is a multi-platform application** that hosts a _React Web Application_ for the Police Department that shows them all the Reports that have been filed through the bSafe Mobile Application that we have launched through _Flutter_. The middle Ground between these two applications is our _SpringBoot RestAPI_ that is deployed on an _Ubuntu Image Virtual Machine hosted on DigitalOcean_. Using this along with an accessory _postgreSQL Database_, we are able to use **HTTP Requests** to both submit reports and view them.
## Challenges we ran into
Connecting the Features together is a process we were not able to conquer this ShellHacks. However, we plan on continuing this project and finishing it for deployment to the real-world.
## Accomplishments that we're proud of
Although we weren't able to deploy the app in its final state. We are proud of what we got done in such small amount of time. This application is one that tackles a real world problem using countless technologies. **We Are All First-Timers Here at ShellHacks** and I feel for our group this is a success.
## What we learned
We learned how to work together as a team to deliver a real world product that would be able to make change around the world we live in. This isn't an application made for profit, but an application that makes use of the technologies we have at our disposal today to make the world around us a better place.
## What's next for bSafe
We will Continue to work on bSafe and finish the product as it is a product with great potential. We look to deploy the app to the App Store and the Android Store as well. Connect the Applications together and allow them
