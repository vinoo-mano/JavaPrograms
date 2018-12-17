
class Animal {
Animal() {
System.out.println("A new animal has been created!");
}
void sleep() {
System.out.println("An animal sleeps...");
}
void eat() {
System.out.println("An animal eats...");
}
void play() {
System.out.println("An animal play cricket..."); }
}
class Bird extends Animal {
Bird() {
super();
System.out.println("A new bird has been created!");
}
//Override
void sleep() {
System.out.println("A bird sleeps...");
}
//Override
void eat() {
System.out.println("A bird eats...");
}}
class Dog extends Animal {
Dog() { super();
System.out.println("A new dog has been created!"); }
//Override
void sleep() {
System.out.println("A dog sleeps...");
} //Override
void eat() {
System.out.println("A dog eats...");
} }
class InhDemo {
public static void main(String[] args) {
Animal animal = new Animal(); Bird bird = new Bird();
Dog dog = new Dog(); System.out.println();
animal.sleep(); animal.eat();
bird.sleep(); bird.eat();
dog.sleep(); dog.eat(); dog.play();
} }