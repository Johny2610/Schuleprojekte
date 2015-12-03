int ampel_RED = 13;
int ampel_YELLOW = 12;
int ampel_GREEN = 11;

void setup() {
  
  // put your setup code here, to run once:
  pinMode(2,INPUT);
  pinMode(3,INPUT);
  pinMode(ampel_GREEN,OUTPUT);
  pinMode(ampel_YELLOW,OUTPUT);
  pinMode(ampel_RED,OUTPUT);
  
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ampel_RED, HIGH);
  delay(1000);
  digitalWrite(ampel_RED, HIGH);
  digitalWrite(ampel_YELLOW, HIGH);
  delay(1000);  
  digitalWrite(ampel_YELLOW, LOW);
  digitalWrite(ampel_RED, LOW);
  digitalWrite(ampel_GREEN, HIGH);
  delay(2000);
  digitalWrite(ampel_GREEN, LOW);
  digitalWrite(ampel_YELLOW, HIGH);
  delay(1000);
  digitalWrite(ampel_YELLOW, LOW);
  digitalWrite(ampel_RED, HIGH);
  delay(3000);

}
