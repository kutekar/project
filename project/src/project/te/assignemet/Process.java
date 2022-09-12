package project.te.assignemet;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Process {
	 static Scanner S=new Scanner(System.in);
	static List<ContactFile> al =Arrays.asList(new ContactFile("komal",9878786756l,"School" ),new ContactFile("oliver",9878786756l ,"college" ),new ContactFile("darshan",987878672l,"college" ),new ContactFile("reshama",987878326l ,"college" ));



	void process() {
	System.out.println("Welcome to smartworld");
	int i =S.nextInt();
	if(i==1) {
	System.out.println(al);
	}
	else if(i==2) {
	System.out.println("which contact you want ?");
	String a =S.nextLine();
	search(a);
	}
	else if(i==3) {
	System.out.println("what you want to do :");
	System.out.println("press 1 for call");
	System.out.println("press 2 for message");
	System.out.println("press 3 for main menu");
	int x =S.nextInt();
	if(x==1) {
	call();
	}
	else if(x==2) {
	message();
	}
	else if(x==3) {
	mainprocess();
	}

	}

	}

	private static void mainprocess() {
	System.out.println("Enter the number");
	System.out.println("press 1 to add");
	System.out.println("press 2 to delete");
	System.out.println("press 3 to edit ");
	int a =S.nextInt();
	if(a==1) {
	add();
	}
	else if(a==2) {
	delete();
	}
	else if(a==3) {
	edit();
	}

	}

	private static void edit() {
	System.out.println("plz enter the number to edit");
	String a =S.next();
	for(int i =0;i<al.size();i++) {
	if(al.get(i).getName().equalsIgnoreCase(a)) {
	System.out.println("press 1 for number change");

	System.out.println("press 2 for name change");
	System.out.println("press 3 for group change");

	int a1 =S.nextInt();
	if(a1==1) {
	System.out.println("enter the value");
	al.get(i).setNumber(S.nextLong());
	}
	else if(a1==2) {
	System.out.println("enter the value");
	al.get(i).setName(S.nextLine());
	}
	else if(a1==3) {
	System.out.println("enter the value");
	al.get(i).setGroup(S.nextLine());
	}
	}
	}

	}

	private static void delete() {
	System.out.println("who do you want to delete");
	String  a= S.next();
	for(int i =0;i<al.size();i++) {
	if(al.get(i).getName().equalsIgnoreCase(a)) {
	al.remove(i);
	}
	}

	}

	private static void add() {
	System.out.println("enter the name , enter the phone number , enter the group you want to add him/her");
	al.add(new ContactFile(S.nextLine(),S.nextLong(),S.nextLine()));

	}

	private static void message() {
	System.out.println("who do want to send message");
	String a =S.next();
	for(int i =0;i<al.size();i++) {
	if(al.get(i).getName().equalsIgnoreCase(a)){
	System.out.println("what message you want to tell");
	String rs = S.nextLine();
	System.out.println("sending message to :"+al.get(i).getName() +" :"+al.get(i).getNumber()+":"+rs);
	}
	}

	}

	private static void call() {
	System.out.println("who do you want to call");
	         String a = S.next();
	         for(int i =0;i<al.size();i++) {
	        if(al.get(i).getName().equalsIgnoreCase(a)) {
	        System.out.println("calling to :"+al.get(i).getName()+":"+al.get(i).getName());
	        }
	       
	         }

	}

	private static void search(String a) {
	for(int i =0;i<al.size();i++) {
	if(al.get(i).getName().equalsIgnoreCase(a)) {
	System.out.println(al.get(i));
	}
	}


	}

	}

	
	


