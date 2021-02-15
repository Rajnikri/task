# task
The task is to consistently increment a number in a database when parallel threads are racing to increment the number.

#Task Controller
To call to api request '/task'.

#TaskService
Used service to be called by controller, to increment the number.

I used MySql db to store incremented value of table 'Number' field.
Added mysql dependencies, and its configuation 
 and added h2 (in memory database) configuation also, in case you don't have mysql, you can uncomment those h2-configuration and can use it and vice versa
