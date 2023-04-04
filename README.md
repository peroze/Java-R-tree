# Java-R*-tree
R* Tree written in java with data from OSM. The project was utilised as a 2-Person team project for an assignment in our University. This is a re upload as the original project got deleted.

FUNCTIONALITIES

The user can:

1)  Add a new map(list with points of interest) from OpenStreetMaps. The program automaticly modifies it and saves it. It also creates a R* tree index saved in a different file 
2)  Perform a K-Nearest-Neighbors queries without the use of the R* Index. The user gives a location and the number of nearest neighbors he wants and the program will return them.
3)  Perform a K-Nearest-Neighbors queries with the use of the R* Index. The user gives a location and the number of nearest neighbors he wants and the program will return them.
4)  Perform Range Queries without the use of the R* Index. The user will give a location and an axis and the program returns all saved point's of interests in this space.
5)  Perform Range Queries with the use of the R* Index. The user will give a location and an axis and the program returns all saved point's of interests in this space.


GUIDE

How to Run K-Nearest-Neighbors with the use of the R* Index:
  1) Run the program 
  2) Press 2 to select the 2nd Option "Load Existing database"
  3) Press 2 to select the "To run simple KNN with index"
  4) Write the number of Neighbors (integer)
  5) Write a latitude (must be integer)
  6) Write Longtitude (must be integer)
  
How to Run K-Nearest-Neighbors without using the R* Index:
  1) Run the program 
  2) Press 2 to select the 2nd Option "Load Existing database"
  3) Press 1 to select the 1st Option "To run simple KNN without using the index" 
  4) Write the number of Neighbors (integer)
  5) Write a latitude (must be integer)
  6) Write Longtitude (must be integer)

How to Run Range Queries with the use of the R* Index:
  1) Run the program 
  2) Press 2 to select the 2nd Option "Load Existing database"
  3) Press 4 to select the 4th Option "To run range queries with index"
  4) Write a latitude (must be integer)
  5) Write Longtitude (must be integer)
  6) Write an axis  (intger)

How to Run Range Queries without using the R* Index:
  1) Run the program 
  2) Press 2 to select the 2nd Option "Load Existing database"
  3) Press 3 to select the 3rd Option "To run range queries without using the index"
  4) Write a latitude (must be integer)
  5) Write Longtitude (must be integer)
  6) Write an axis  (intger)
  

How to add a new Map: 
  1) Download the map as xml from OpenStreetMaps and 
  2) Save the file in the main folder of the project.
  3) Start the program and press 1 
  
  
