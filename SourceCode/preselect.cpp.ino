#include <Servo.h>

Servo Pivot;
// Tadeas Lobreis

void setup() {
  
 Pivot.attach(9); 
}

void loop() {
  switch(preslectedtype) {
      case 'JRC' :
        Pivot.write(90);
        delay(1000); 
        Pivot.write(80);
        break;
      case 'JJC' :
        Pivot.write(90);
        delay(2000);
        Pivot.write(70);
        break;
      case 'JCLH' :
        Pivot.write(90);
        delay(1000);
        Pivot.write(70);
        delay(1000);
        pivot.write(130);
        break;
      case 'JCLUC' :
         Pivot.write(90);
         delay(1000);
         Pivot.write(70);
         delay(1000);
         Pivot.write(90);
         delay(1000);
         Pivot.write(70);
         break;
      case 'JLHRU' :
         Pivot.write(80);
         delay(1000);
         Pivot.write(120);
         delay(1000);
         Pivot.write(50);
         delay(1000);
         Pivot.write(70);
         break;
      default :
         break;
   }

}
