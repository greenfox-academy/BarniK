public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(){
    this("unknown", 50, 50);
  }

  public Sharpie(String name, float width, float inkAmount) {
    this.color = color;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void use(){
    this.inkAmount -= 1;
  }
}
/*
Create Sharpie class
We should know about each sharpie their color (which should be a string),
width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
 */