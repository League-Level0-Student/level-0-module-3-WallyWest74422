void setup() {
  size(500, 500);
} 
void draw() {
  for (int i=10; i>=1; i--) {



    if (i % 2 == 0) {
      fill(0, 0, 0);
    } else {
      fill(255);
    }
     ellipse(250, 250, i * 20, i*20);
  }
}
