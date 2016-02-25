int TOP = 2;
int TOPleft = 3;
int TOPright = 4;
int MIDDLE = 5;
int BOTTOMleft = 6;
int BOTTOMright = 7;
int BOTTOM = 8;
int TASTER = 1;
int summe;


void setup() {
  // put your setup code here, to run once:
pinMode(TOP, OUTPUT);
pinMode(TOPleft, OUTPUT);
pinMode(TOPright, OUTPUT);
pinMode(MIDDLE, OUTPUT);
pinMode(BOTTOMleft, OUTPUT);
pinMode(BOTTOMright, OUTPUT);
pinMode(BOTTOM, OUTPUT);
pinMode(TASTER, INPUT);
digitalWrite(TOPright, HIGH);
digitalWrite(TOP, HIGH);
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(1000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
attachInterrupt(digitalPinToInterrupt(TASTER),kontakt,RISING);
int summe = 0;
}

void loop() {
  // put your main code here, to run repeatedly:
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
delay(500);
if(summe == 1){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//1
digitalWrite(BOTTOMright, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 2) {
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//2
digitalWrite(TOP, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 3){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//3
digitalWrite(TOP, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 4){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//4
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 5) {
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOP, HIGH);//5
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 6){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//6
digitalWrite(TOP, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 7){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//7
digitalWrite(TOP, HIGH);
digitalWrite(BOTTOMright, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 8){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//8
digitalWrite(TOP, HIGH);
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 9){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//9
digitalWrite(TOP, HIGH);
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOM, HIGH);
digitalWrite(MIDDLE, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe == 0){
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOPright, HIGH);//0
digitalWrite(TOP, HIGH);
digitalWrite(TOPleft, HIGH);
digitalWrite(BOTTOMright, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
} else if (summe != 0&&1&&2&&3&&4&&5&&6&&7&&8&&9){
  digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
digitalWrite(TOP, HIGH);//E
digitalWrite(TOPleft, HIGH);
digitalWrite(MIDDLE, HIGH);
digitalWrite(BOTTOMleft, HIGH);
digitalWrite(BOTTOM, HIGH);
delay(3000);
digitalWrite(TOPright, LOW);
digitalWrite(TOP, LOW);
digitalWrite(TOPleft, LOW);
digitalWrite(BOTTOMright, LOW);
digitalWrite(BOTTOMleft, LOW);
digitalWrite(BOTTOM, LOW);
digitalWrite(MIDDLE, LOW);
//summe = 0;
}
}

void kontakt(){
  summe = summe + 1;
  }
