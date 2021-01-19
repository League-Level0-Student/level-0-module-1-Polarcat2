
void setup() {
PImage face = loadImage("CatFace.jpg");
size(356,354);
face.resize(width, height);
image(face, 0, 0);

}
void draw() {
  fill(mouseX,mouseY,23);
ellipse(56,145, mouseX, mouseX);
ellipse(245,124,150,134);
}
