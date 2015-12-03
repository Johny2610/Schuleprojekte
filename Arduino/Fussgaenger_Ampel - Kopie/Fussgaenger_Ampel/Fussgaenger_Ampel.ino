int ampel_RED = 13;
int ampel_YELLOW = 12;
int ampel_GREEN = 11;
int ampel1_RED = 8;
int ampel1_GREEN = 7;
boolean request = false;

void setup() {
  
  // put your setup code here, to run once:
  pinMode(2,INPUT);
  pinMode(3,INPUT);
  pinMode(ampel_GREEN,OUTPUT);
  pinMode(ampel_YELLOW,OUTPUT);
  pinMode(ampel_RED,OUTPUT);
  pinMode(ampel1_RED,OUTPUT);
  pinMode(ampel1_GREEN,OUTPUT);
  attachInterrupt(digitalPinToInterrupt(2), fussgaenger, RISING);
  digitalWrite(ampel1_RED, HIGH); 
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ampel_RED, HIGH);
  if (request == true) {
    delay(500);
    digitalWrite(ampel1_RED, LOW);
    digitalWrite(ampel1_GREEN, HIGH);
    delay(3000);
    digitalWrite(ampel1_RED, HIGH);
    digitalWrite(ampel1_GREEN, LOW);
    delay(1000);
    request = false; 
  } else {
  delay(3000);
  }
  digitalWrite(ampel_RED, HIGH);
  digitalWrite(ampel_YELLOW, HIGH);
  delay(1000);  
  digitalWrite(ampel_YELLOW, LOW);
  digitalWrite(ampel_RED, LOW);
  digitalWrite(ampel_GREEN, HIGH);
  delay(4000);
  digitalWrite(ampel_GREEN, LOW);
  digitalWrite(ampel_YELLOW, HIGH);
  delay(1000);
  digitalWrite(ampel_YELLOW, LOW);

}

void fussgaenger() {
  request = true;
}

