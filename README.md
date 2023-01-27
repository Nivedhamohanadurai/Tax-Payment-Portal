# Tax-Payment-Portal

In this project, there are having two main groups of users. They are government and common citizens. We are trying to make a website using Java Web Application in Netbeans IDE 8.2. 

Here, we have a common login page for both government and citizens. If the login is not successful, then the we will get an invalid message along with the link to go back to login page. 

If government login to the website, they will get a text box to enter the username of citizens. On clicking the Submit button they will get the tax amount that is pending for the citizen. The taxes that are included here are Property tax, Income tax, Drainage tax, Water tax. 

-> If they wish to add the tax amount then they can click the link to modify the tax details. They can enter the username of citizen, select the type of tax they need to change from drop down list and enter the amount to be added. On pressing Submit, the entered amount will be added to the citizen in addition to the existing tax amount for the particular type of tax. 

-> If they want to add or remove customer then they can add/remove by clicking the link given. To add they need to give the details of the citizen along with the tax amounts for each category. To remove the citizen, they can give the username of citizen to remove. 

If common citizens login to the website, they will get the tax amount that is pending to be paid for each category. They can proceed to pay the tax amount by choosing the type of tax they wish to pay and entering the bank details. On successful payment the amount paid gets reduced in the pending tax amount for that particular type. 

## Software used:
•	Netbeans IDE 8.2

•	MYSQL workbench 6.3.10

•	Java EE 7

•	Glassfish 4.1.1

## Databases used:
•	tax_government

![image](https://user-images.githubusercontent.com/67183417/215130165-64f50aa0-849c-4e24-a0eb-77bed4ccb337.png)

•	tax_citizens:

![image](https://user-images.githubusercontent.com/67183417/215130136-23072ecd-4108-4b9c-8688-7c260f662a25.png)

•	tax_amount

![image](https://user-images.githubusercontent.com/67183417/215130211-ab1cd45a-eaae-4a47-8fa4-6ca0a839c5ca.png)
