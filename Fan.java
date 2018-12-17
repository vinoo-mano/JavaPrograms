class Fan{

int speed=1;
boolean on=false;
double radius=5.0;
String colour="blue";

Fan(){
}

Fan(int a, boolean b, double c, String d){
speed=a;
on=b;
radius=c;
colour=d;
}

void setSpeed(int x){
speed=x;
}

int getSpeed(){
return speed;
}

void setOn(boolean x){
on=x;
}

boolean getOn(){
return on;
}

void setRadius(double x){
radius=x;
}

double getRadius(){
return radius;
}

void setColour( String x){
colour=x;
}

String getColour(){
return colour;
}

public String toString(){

String str;
if (on==true)
str= speed+"  "+colour+" "+radius;
else
str= colour+" "+radius+"  fan is off";
return str;
}
public static void main(String[] args){

final int SLOW=1;
final int MEDIUM=2;
final int FAST=3;
Fan f1=new Fan(FAST,true,10.0,"yellow");
Fan f2=new Fan(MEDIUM,false,5.0,"blue");

System.out.println(" details of fan 1");
System.out.println(f1.toString());
System.out.println(" details of fan 2");
System.out.println(f2.toString());
}
}
