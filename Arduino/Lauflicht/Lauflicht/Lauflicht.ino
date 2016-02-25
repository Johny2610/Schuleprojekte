int LED_1 = 9;
int LED_2 = 10;
int LED_3 = 11;
int LED_4 = 12;
int LED_5 = 13;
int LED_6 = 8;
int LED_7 = 7;
int BUTTON_1 = 2;
boolean KONTAKT = false;



void setup() {
  // put your setup code here, to run once:
pinMode(LED_1, OUTPUT);
pinMode(LED_2, OUTPUT);
pinMode(LED_3, OUTPUT);
pinMode(LED_4, OUTPUT);
pinMode(LED_5, OUTPUT);
pinMode(LED_6, OUTPUT);
pinMode(LED_7, OUTPUT);
pinMode(BUTTON_1, INPUT);
attachInterrupt(digitalPinToInterrupt(BUTTON_1),kontakt,RISING);
digitalWrite(LED_1, HIGH);
digitalWrite(LED_2, HIGH);
digitalWrite(LED_3, HIGH);
digitalWrite(LED_4, HIGH);
digitalWrite(LED_5, HIGH);
digitalWrite(LED_6, HIGH);
digitalWrite(LED_7, HIGH);
delay(5000);
digitalWrite(LED_1, LOW);
digitalWrite(LED_2, LOW);
digitalWrite(LED_3, LOW);
digitalWrite(LED_4, LOW);
digitalWrite(LED_5, LOW);
digitalWrite(LED_7, LOW);
}

void loop() {
  // put your main code here, to run repeatedly:
  if ( KONTAKT == true) {
    digitalWrite(LED_6, LOW);
    digitalWrite(LED_7, HIGH);
    for (int i = 1; i<=15; i++) {
    digitalWrite(LED_1, HIGH);
    delay(100);
    digitalWrite(LED_1, LOW);
    digitalWrite(LED_2, HIGH);
    delay(100);
    digitalWrite(LED_2, LOW);
    digitalWrite(LED_3, HIGH);
    delay(100);
    digitalWrite(LED_3, LOW);
    digitalWrite(LED_4, HIGH);
    delay(100);
    digitalWrite(LED_4, LOW);
    digitalWrite(LED_5, HIGH);
    delay(100);
    digitalWrite(LED_5, LOW);
    delay(500);
    }
    KONTAKT = false;
    digitalWrite(LED_6, HIGH);
    digitalWrite(LED_7, LOW);
  }
}

void kontakt(){
  KONTAKT = true;
  
}

