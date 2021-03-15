#include <Servo.h>
#include <stdio.h>      /* printf, scanf, puts, NULL */
#include <stdlib.h>     /* srand, rand */
#include <time.h>   
// easy medium hard
Servo servo;
void setup() {
  servo.attach(9); 
  int x;
  scanf ("%d",&x); // Get user input from the keyboard
  loop(x);
  
}

void loop(int num) {
   // easy    
  if (num == 1) {
    for (int i = 0; i < 10; i++) {
      int hold = rand() %  60 + 70;
      servo.write(hold);              
      delay(2000);
         }
         }
   // medium
  if (num == 2) {
    for (int i = 0; i < 10; i++) {
      int hold = rand() %  90 + 50;
      servo.write(hold);              
      delay(1000);
    }
  }
  // hard
   if (num == 3) {
    for (int i = 0; i < 10; i++) {
      int hold = rand() %  120 + 30;
      servo.write(hold);              
      delay(500);
    }
  }



}
