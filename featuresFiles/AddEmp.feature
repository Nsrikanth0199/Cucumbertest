Feature:
As Admin user add emp
Scenario Outline:
Validate add emp with multiple data
Given user navigate to organgehrm url "http://orangehrm.qedgetech.com/"
When user login as "Admin"and password "Qedge123!@#"
When user click login button
When user click pim
When user click add button
When user enter "<firstname>"and"<middlename>"and"<lastname>"
When user click save button
Then user validate url
Then user close browser
Examples:
|firstname|middlename|lastname|
|srikanth1|software|cucumber|
|srikanth2|software|cucumber|
|srikanth3|software|cucumber|
|srikanth4|software|cucumber|
|srikanth5|software|cucumber|