/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

/**
 *
 * @author Adem
 */
public class HashMap
{
    
    int i=1;
 public int [] array=new int[1000000];
 public void put(String a,int b){
     String st;
     
     
     
     
  array[hash(a)]=i; 
  i++;
 }
 public int hash(String a){
     int count=0;
     for(int i=0;i<a.length();i++){
         if(i==0)
          count=count+a.charAt(i)-65;
         else
             count=count+a.charAt(i)-96+(26*i);
     }
     count=count+a.length()-1;
   return count ; 
 } 
 public int get(String a){
     return array[hash( a)];
 }
 public void putdelete(String a,int b){
     String st;
     
     
     
     
  array[hash(a)]=b; 
  
 }
}