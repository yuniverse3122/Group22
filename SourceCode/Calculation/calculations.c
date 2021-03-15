#include <stdlib.h>
#include <stdio.h>

// constants that are preloaded into their functions. The numbers are simple
// for simplicity. They will represent the # of rotations the motor will make
// in a given time. The more rotations, the faster the punch pad will move, 
// the more difficult it will be
const int beginnerSpeed = 1;
const int intermediateSpeed = 2;
const int hardspeed = 3
//human hands are around  0.575% of total body weight
const int handPercentage =  0.575;

int main(int argc, char const *argv[]) {
  string gender = "N/A";
  int weight = 0;
  string name = 0;
  return 0;
}

// function that will count the number of punches
int numPunches()  {
  int punches = 0;
  punches++;
  return punches;
}

int speed() {

  // assumes that the pressure indicator will return the force of each punch.
  // F = MA
  // Mass is assumed to be the average weight of a human hand
  // average weight of hand = weight *  0.575.
  // Force / average weight of a human hand = speed
  // return speed


}

void beginnerMode() {
 // everything on lowest setting. few rotations per time limit.

}

void intermediateMode() {


}

void expertMode() {


}

void freeMode() {

}

void stats()  {


}


}

