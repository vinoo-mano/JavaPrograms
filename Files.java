
import java.io.*;
class BRReadLines {
public static void main(String args[])throws IOException
{
// create a BufferedReader using System.in
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter lines of text.");
System.out.println("Enter 'done' to quit.");
do {
str = br.readLine();
System.out.println(" "+str);
} while(!str.equals("done"));
 }
}
 


--------------------------------------------------------------------------------------------
// Demonstrate PrintWriter
import java.io.PrintWriter;
public class PrintWriterDemo {
public static void main(String args[]) {
PrintWriter vijay = new PrintWriter(System.out, true);
vijay.println("This is a string");
int i = -7;
vijay.println("value of i= "+i);
double d = 4.5e-7;
System.out.println("value of d= "+d);
  }
}

--------------------------------------------------------------------------------------------
import java.io.*;

class ReaderDataTypes{
public static void main(String args[])throws IOException{
int ia,ib,ic,id;
double da,db,dp;
String str;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

try{
System.out.print("enter number1 :");
str = br.readLine();
ia= Integer.parseInt(str);
}catch (NumberFormatException nfe){
   ia=10;
}

System.out.print("enter number2 :");
str = br.readLine();
ib=Integer.parseInt(str);

System.out.print("enter number3 :");
str = br.readLine();
ic=Integer.parseInt(str);

id=ia+ib+ic;
System.out.println("total 3 numbers= "+id);

System.out.print("enter double number1 :");
str = br.readLine();
da= Double.parseDouble(str);

System.out.print("enter double number2 :");
str = br.readLine();
db=Double.parseDouble(str);

dp=da*db;
System.out.print("product of two numbers ="+dp);
 }
}

--------------------------------------------------------------------------------------------
// Use Scanner to compute an average of the values in a file.

import java.util.*;
import java.io.*;

class AvgFile {
public static void main(String args[])throws IOException {

int count = 0;
double sum = 0.0;

// Write data to file.
FileWriter fout = new FileWriter("data.txt");
fout.write("5.7 3.4 5.8 3.6 88.4 3.1 3.5 done");
fout.close();

FileReader fin = new FileReader("data.txt");
Scanner in = new Scanner(fin);
// Read and sum numbers.
while(in.hasNext()) {
if(in.hasNextDouble()) {
sum += in.nextDouble();
count++;
}
else {
String str = in.next();
if(str.equals("done")) break;
else {
System.out.println("File format error.");
return;
   }
  }
}
fin.close();
System.out.println("Average is " + sum / count);
}
}


-------------------------------------------------------------------------------------
///
copy file


aimport java.io.*;
class CopyFile {
public static void main(String args[])throws IOException
{
int i;
  
FileInputStream fin = new FileInputStream("employee.java");

FileOutputStream fout = new FileOutputStream("marsh.java");

// Copy File
try {
do {
i = fin.read();
if(i != -1) fout.write(i);
} while(i != -1);
} catch(IOException e) {
System.out.println("File Error");
}
fin.close();
fout.close();
}
}


------------------------------------------------------
import java.io.*;
import java.util.Scanner;

class Employee{
String name;
int num;
double basic;

Employee(String m, int n, double b){
name=m;
num=n;
basic=b;
}

void salary(){
double sal=basic+1000;
System.out.println(name+"  " +"salary= " +sal);
}

public static void main(String args[])throws Exception{
Employee emp[] = new Employee[10];

File f2 = new File("scores.txt");
String name,n2,n3;
int num,i=0;
double bas;

Scanner input=new Scanner(f2);
while(input.hasNext()) {
name=input.next();
n2=input.next();
n3=input.next();

num=Integer.parseInt(n2); 
bas =Double.parseDouble(n3);
emp[i]=new Employee(name,num,bas);
emp[i].salary();

i++;
}
}
}

----------------------------------------------------------------------------


/* reusability is applied at many places-
   easy to understand -
   uses data structure Book[] array 
                         for data processing */

import java.io.*;
import java.util.Scanner;

class Book{
int id;
String title;
int issued;

Book(int i, String t, int iss){
id=i;
title=t;
issued=iss;
}
}

class Library{
Book[] bk = new Book[20];

void copyToArray(){
try{

File f1 = new File("books.txt");
String id1,ti1,is1,str;
int inum,is11,i=0;
 
Scanner input=new Scanner(f1);
while(input.hasNext()) {
id1=input.next();
ti1=input.next();
is1=input.next();
inum=Integer.parseInt(id1);
is11=Integer.parseInt(is1);
bk[i]=new Book(inum,ti1,is11);
i++;
}
}catch(Exception e)
{
 System.out.println(" problem in copying");
}
}

void addBooks(){
try{
File f1 = new File("books.txt");

if(!f1.exists()){
   f1.createNewFile();
}

Scanner in=new Scanner(System.in);

int n;
String bid,tit,isu;

BufferedWriter output=new BufferedWriter(new FileWriter("books.txt", true));
System.out.print("Enter How many records:");
n=in.nextInt();

for (int i=0;i<n;i++){
System.out.print("Enter book-id:");
bid=in.next();
System.out.print("Enter book-title:");
tit=in.next();
System.out.print("Enter book status:");
isu=in.next();

output.write(bid+" ");
output.write(tit+" "); 
output.write(isu+" ");
output.newLine();
}

output.close();
} catch(IOException e){
 System.out.println("problem with file");
}
 
 }

void display(){
String str;
try{
copyToArray();
for(int i=0; i<bk.length; i++){
  
if(bk[i].issued==0)
 str="available";
else
 str="issued";

System.out.println(bk[i].id+ "  "+bk[i].title+ "  "+str );
}

}catch(Exception ioe){
  System.out.println(ioe);
  System.out.println(" pl. provide me the file");
}
}

void searchBook(){
int snum,fnd=0;
String str;
try{
 copyToArray();
Scanner in=new Scanner(System.in);
System.out.print("Enter your book id number :");
snum=in.nextInt();

for(int i=0; i<bk.length; i++){

if(snum==bk[i].id){

fnd=1;
if(bk[i].issued==0)
 str="available";
else
 str="issued";
System.out.println(bk[i].id+ "  "+bk[i].title+ "  "+str );

break;  
}
}
if(fnd==0)
System.out.println(" book is not found");

}catch(Exception ioe){
  System.out.println(ioe);
  System.out.println(" pl. provide me the file");
}
}

static void menu(){
System.out.println("         welcome to my library");
System.out.println(" 1. Add books");

System.out.println(" 2. Display all books");
System.out.println(" 3. search for a book");
System.out.print (" Enter your choice :");
}
public static void main(String args[]){
//public static void main(String args[])throws Exception{
int ch=0,cntrl=0;
Library2  lib=new Library2();
Scanner in=new Scanner(System.in);
do{
menu();
ch=in.nextInt();
switch(ch){

case 1:{
lib.addBooks();
break;
}
case 2: {

lib.display();
break;
}
case 3: {
lib.searchBook();
break;
}
default: System.out.println(" give correct choice");
}
System.out.print("Do you wanted to continue? press 1 :");
cntrl=in.nextInt();
}while(cntrl==1);
}
}
----------------------------------------------------------------------------------------
import java.util.Scanner;
import java.io.*;

class ReadData{
public static void main(String args[])throws Exception{
try{
File file = new File("scores.txt");
String name,n2,n3;
int num;
double sal;

Scanner input=new Scanner(file);
while(input.hasNext()) {
name=input.next();
n2=input.next();
n3=input.next();

num=Integer.parseInt(n2); 
sal =Double.parseDouble(n3);
System.out.println(name+ "  "+num+ "  "+sal );

}

}catch(FileNotFoundException fnf){
  System.out.println(fnf);
  System.out.println(" pl. provide me the file");

}
}
}

-----------------------------------------------------------------------------------------
/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
*/
import java.io.*;
class ShowFile {
public static void main(String args[])throws IOException
{
int i;
FileInputStream fin;

try {
fin = new FileInputStream("scores.txt");
} catch(FileNotFoundException e) {
System.out.println("File Not Found");
return;
} 

// read characters until EOF is encountered
do {
i = fin.read();
if(i != -1) System.out.print((char)i);
} while(i != -1);
fin.close();
}
}

-----------------------------------------------------------------------------------------
import java.io.*;
import java.util.Scanner;
class WriteData{
public static void main(String args[])throws Exception{

//BufferedWriter output=null;
File f1 = new File("scores.txt");

if(!f1.exists()){
   f1.createNewFile();
 }

Scanner in=new Scanner(System.in);

int i,n;
String nm,num,bas;

BufferedWriter output=new BufferedWriter(new FileWriter("scores.txt", true));
System.out.print("Enter How many records:");
n=in.nextInt();
for (i=0;i<n;i++){

System.out.println("Enter name:");
nm=in.next();
System.out.println("Enter number:");
num=in.next();
System.out.println("Enter basic:");
bas=in.next();

output.write(nm+" ");
output.write(num+" "); 
output.write(bas+" ");
output.newLine();

}

output.close();
 }
}






--------------------------------------------------------------------------------------------