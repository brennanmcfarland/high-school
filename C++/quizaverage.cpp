//calculate student's average from 3 quiz grades
//Input from user-quiz grade 1 (sc1), quiz grade 2 (sc2) and quiz grade 3 (sc3)
//Output generated will be average of the three scores (avg)
//Variables needed--sc1, sc2, sc3
//special concerns: divide by 3.0 to avoid integer division

#include <iostream>
using namespace std;

int main(){

short sc1,
	  sc2,
	  sc3;	  
float avg;

cout << "Enter quiz 1: ";
cin >> sc1;

cout << "Enter quiz 2: ";
cin >> sc2;

cout << "Enter quiz 3: ";
cin >> sc3;

avg = (sc1+sc2+sc3)/3.0;

cout << "Average: " << avg;

return 0;

}