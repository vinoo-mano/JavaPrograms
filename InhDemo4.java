class Animal {
//String name; int kk;
final int fkk=22;
Animal() {
this.kk=2;
System.out.println("A new animal has been created!"); }
final void sleep() {
System.out.println("An Animal sleeps for" + kk +" hours"); }
void eat() {
System.out.println("An Animal eats" + fkk +"hours"); }
void incr() {
kk=kk+1;
// fkk=fkk+1;
 }
}
class Monkey extends Animal {
Monkey() {
System.out.println("A new monkey has been created!"); }
void sleep() {
System.out.println("A monkey sleeps..."); }
void eat() {
System.out.println("A monkey eats..."); }
void jump() {
System.out.println("A monkey jumps..."); }
}
final class Human extends Monkey {
Human() {
System.out.println("A new human has been created!"); }
/* void sleep() {
System.out.println("A human sleeps..."); } */
void eat() {
System.out.println("A human eats..."); }
void jump() {
System.out.println("A human jumps...");
}
void smile() {
System.out.println("A human smiles..."); }
}
class ter  {
public static void main(String[] args) {

Animal animal = new Animal(); Monkey monkey = new Monkey(); Human human = new Human(); System.out.println();
animal.sleep(); animal.eat(); System.out.println(); animal.incr(); animal.sleep(); animal.eat();
monkey.sleep(); monkey.eat(); monkey.jump(); System.out.println();
human.sleep(); human.eat(); human.jump(); human.smile(); System.out.println();
} 
}
