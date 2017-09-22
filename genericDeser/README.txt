
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=firstarg -Darg1=secondarg 

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.”

[Date: ] -- 04/28/2017

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

LinkedHashMap - I have used LinkedHashMap to store Objects and their Integer count, also for
Data Member type and class because it maintains order, as well as
it can handle key value pair, which makes it better than other data structure.
Time Complexity for operations in LinkedHashMap is O(1).


-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).

For Time Complexity -
shttp://stackoverflow.com/questions/559839/big-o-summary-for-java-collections-framework-implementations.
