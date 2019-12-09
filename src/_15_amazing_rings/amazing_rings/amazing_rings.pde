void setup() {
  size(500, 500);
}
int x1=0;
int x2=500;
int speed1= 1;
int speed2= 1;



void draw() {
  background(255);
  for (int i=10; i>=1; i--) {

    noFill();
    ellipse(x1, 250, i*20, i*20);
    ellipse(x2, 250, i*20, i*20);
  }
  x1=x1+speed1;
  if (x1<=0) {
    speed1= -speed1;
  } else if (x1>=500) {
    speed1= -speed1;
  }
  x2=x2-speed2;
  if (x2>=500) {
    speed2=-speed2;
  } else if (x2<=0) {
  speed2=-speed2; 
  }

}
