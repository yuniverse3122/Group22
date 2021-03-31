#include <Servo.h>
int state;
Servo servo;
void setup() {
  // put your setup code here, to run once:
 
 servo.attach(8);
 Serial.begin(9600);
  
}

void loop() {
     if(Serial.available() > 0){
      state = Serial.read();
     }


     // free mode
     // easy mode
     if(state == '0'){
        for(int i = 0;i<100;i++){
          int hold = rand() %  60 + 70;
          servo.write(hold);              
          delay(2000);
          state = 10;
          }
        }
     // medium mode
     else if(state == '1'){
      for(int i=0;i<100;i++){
          int hold = rand() %  60 + 70;
          servo.write(hold);              
          delay(1000);
          state = 10;
     }
     }
     // hard mode
     else if(state == '2'){
      for(int i =0;i<100;i++){
          int hold = rand() %  60 + 70;
          servo.write(hold);              
          delay(500);
          state = 10;
     }
     }

     // preselected mode
    // jab jab straight
    else if(state == '3'){
      servo.write(120);              
      delay(1000);
      servo.write(90);              
      delay(1000);
      servo.write(80);              
      delay(1000);
      state = 10;
    }
    // jab jab left hook
    else if(state == '4'){
      servo.write(120);              
      delay(1000);
      servo.write(90);              
      delay(1000);
      servo.write(140);              
      delay(1000);
      state = 10;
    }
    // jab jab right hook
    else if(state == '5'){
      servo.write(120);              
      delay(1000);
      servo.write(90);              
      delay(1000);
      servo.write(70);              
      delay(1000);
      state = 10;
    }
     // jab straight uppercut
     else if(state == '6'){
      servo.write(110);              
      delay(1000);
      servo.write(80);              
      delay(1000);
      servo.write(90);              
      delay(1000);
      state = 10;
     }
}
