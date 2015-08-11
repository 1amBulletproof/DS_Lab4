#! usr/bin/python27

#Generates Files of integers of different size & different order
#
#@author Brandon Tarney	8/9/2015

import random

def main():
	
	sizeOfFile = [50, 500, 1000, 2000, 5000, 10000, 20000]
	
	fileType = ["Random", "Ascending", "Descending"]

	
	for size in sizeOfFile:
		for fileName in fileType:
			
			numbers = set()						#ensures all numbers unique, for random number gen.
			numbersList = list()				#captures all ascending or descending numbers
			
			#Open File
			file = open(fileName + str(size), 'w')
			
			#create sequence of numbers
			for item in range(size):
				if (fileName == "Random"):	
					temp = random.randint(0,size) #creates random file, 0 duplicates 
					numbers.add(temp)
				elif (fileName == "Ascending"):   #creates an ascending file
					temp = item
					numbersList.append(temp)
				else:					           #creates descending file
					temp = size - item
					numbersList.append(temp)
						
						
			#convert set to list to shuffle it
			if (fileName == "Random"):			
				numbersList = list(numbers)
				random.shuffle(numbersList)
				
			#write to file
			for element in numbersList:
				file.write(str(element))
				file.write("\n")

			file.close()
	
	
if __name__ == "__main__": main()
