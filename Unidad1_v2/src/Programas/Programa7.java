package Programas;

import java.util.Scanner;

public class Programa7 {

    public void proceso(){
        Scanner sc=new Scanner(System.in);
  int num;
    System.out.println("PROPORCIONA UN NUMERO DEL 1 AL 7");
    num=sc.nextInt();
    if(num==1){
    System.out.println("numero romano: I");}
    else if(num==2){    
        System.out.println("numero romano: II");}
    else if(num==3){
        System.out.println("numero romano: III");}
    else if(num==4){
        System.out.println("numero romano: IV");}
    else if(num==5){
        System.out.println("numero romano: V");}
    else if(num==6){
        System.out.println("numero romano: VI");}
    else if(num==7){
        System.out.println("numero romano: VII");}
    else if(num>7){
        System.out.println("Error");}
    }
}
