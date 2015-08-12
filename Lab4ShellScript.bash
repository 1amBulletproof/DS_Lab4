#!/bin/bash
project_dir="/Users/Tarney/Desktop/Data_Structure_Lab_4/DS_Lab4"
cd $project_dir
echo "Compiling  project...."
javac Lab4.java
returnvalue=$?
if [ $returnvalue ] 
then
	echo "Compilation succesful! Running project now"
	java Lab4 Ascending50 Ascending50output
	java Lab4 Ascending500 Ascending500output
	java Lab4 Ascending1000 Ascending1000output
	java Lab4 Ascending2000 Ascending2000output
	java Lab4 Ascending5000 Ascending5000output
	java Lab4 Ascending10000 Ascending10000output
	java Lab4 Ascending20000 Ascending20000output
	java Lab4 Descending50 Descending50output
	java Lab4 Descending500 Descending500output
	java Lab4 Descending1000 Descending1000output
	java Lab4 Descending2000 Descending2000output
	java Lab4 Descending5000 Descending5000output
	java Lab4 Descending10000 Descending10000output
	java Lab4 Descending20000 Descending20000output
	java Lab4 Random50 Random50output
	java Lab4 Random500 Random500output
	java Lab4 Random1000 Random1000output
	java Lab4 Random2000 Random2000output
	java Lab4 Random5000 Random5000output
	java Lab4 Random10000 Random10000output
	java Lab4 Random20000 Random20000output	
else
	echo "Compilation failed. Cannot run project"
fi	


