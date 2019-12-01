void setup(){
  size(500,500);
}
  int x1=0;
  int x2=500;


void draw() {
  background(255);
   for (int i=10; i>=1; i--) {

      noFill();
      if((x1!=0)){
        ellipse(x1--,250,i*20,i*20);
      }else if((x1!=500)){
        ellipse(x1++,250,i*20,i*20);
      }
      //if(!(x2<=0)){
        //ellipse(x2--,250,i*20,i*20);
      //}else if(!(x2>=500)){
       // ellipse(x2++,250,i*20,i*20);
     // }
    }
  }
 
