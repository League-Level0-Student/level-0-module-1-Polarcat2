
void setup() {
size(500,500);   
}
void draw() {
  fill(#EAA336); 
  ellipse(136,150,364,368);
   if (mousePressed) {
  PImage pepperoni;
  pepperoni = loadImage("pepperoni.png");
  image(pepperoni,189,200);
  pepperoni.resize(30,30);

}}
