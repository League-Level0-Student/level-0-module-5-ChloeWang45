
void setup() {
    size(1000, 500);
}

void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */

   int a = 400;
  for(int i = 0; i < 20; i++){
    a = a - 20;
    if(i % 2 == 0){
      noFill();
      ellipse(250, 250, a, a);
    }
    else{
      noFill();
      ellipse(250, 250, a, a);
    }
  
   int b = 400;
  for(int j = 0; j < 20; j++){
    b = b - 20;
    if(j % 2 == 0){
      noFill();
      ellipse(750, 250, b, b);
    }
    else{
      noFill();
      ellipse(750, 250, b, b);
    }
    
  }

}
}
