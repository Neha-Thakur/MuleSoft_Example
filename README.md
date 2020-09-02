Found this problem at the web over the Stackoverflow.com, I thought it is better to implement this in my own. 
The problem has the input.json :
{
"Header" : [
"name",
"lastName",
"dateTime",
"city",
"country"
],
"Items" : [
"John",
"Smith",
"31-01-2019T19:0:0Z",
"Melbourne",
"Australia"
]
}

We need to implement the output by including the temprature in celius from the API "https://samples.openweathermap.org/data/2.5/weather" and generate the following output:
{
  "firstName": "John",
  "lastName": "Smith",
  "fullName": "John Smith",
  "dateTime": "Fri Feb 01 06:00:00 AEDT 2019",
  "city": "Melbourne",
  "location": "Melbourne Australia",
  "temperatureCelcius": "137.95557"
}
