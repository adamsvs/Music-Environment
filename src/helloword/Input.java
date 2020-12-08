/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Adem
 */
public class Input {
     LinkedList myList = new LinkedList();
     HashMap  happy= new HashMap ();
     LlistSong Listsong = new LlistSong();
     HashMapsong  happysong= new HashMapsong ();
     public void Inputscan(){
         Scanner scan=new Scanner(System.in);
         String function;
         String[] deneme = new String[3];
         while(1==1){
         function=scan.nextLine();
          deneme=function.split(" ",3);
           
           if(deneme.length==2)
               
           run(deneme[0],deneme[1],"");
           
           else if(deneme.length==1)
               break;
           else
           run(deneme[0],deneme[1],deneme[2]);
           
         
         }
         
     }
     public void InputMaze(String FileName) {
         String[] deneme = new String[3];
     String[] abc=null;
   FileInputStream fStream = null;
        try {
            String str;
            fStream = new FileInputStream(FileName);
            DataInputStream dStream = new DataInputStream(fStream);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
            
            str=bReader.readLine();
            int m=1;
            while(m==1){
                
            deneme=str.split(" ",3);
           
           if(deneme.length==2)
           run(deneme[0],deneme[1],""); 
           else if(deneme.length==1)
               m=0;
           else
           run(deneme[0],deneme[1],deneme[2]);
           str=bReader.readLine();
            
        }
            
           
        }
        catch (FileNotFoundException ex) {
            System.out.println(" İşlem yapılırken adress bulunamadı :" + ex.getMessage());
            
        } catch (IOException ex) {
            throw new UnsupportedOperationException("Not supported yet.");
           
        } 
        catch (NullPointerException ex) {
            System.out.println(" Dosya boş :" + ex.getMessage());
            
           
        } 
 
}
public void run(String function,String Name,String SongName){
    if(function.equals("I")&&SongName.equals("")){
        kisiekle(Name);
    }
    if(function.equals("D")&&SongName.equals("")){
        kisisil(Name);
    }
    if(function.equals("L")){
        like(Name,SongName);
    }
    if(function.equals("E")){
        dislike(Name,SongName);
    }
    if(function.equals("P")){
        print(Name);
    }
    if(function.equals("M")){
        match(Name);
    }
    if(function.equals("R")){
        recommends(Name);
    }
    if(function.equals("O")){
        InputMaze(Name);
    }
}
public void kisiekle(String Name){
    if(happy.get(Name)==0){
        happy.put(Name, 5);
        myList.Insert(Name, happy.get(Name)-1);
    }
    else
        System.out.println(Name+" can not be created");
}
public void kisisil(String Name){
    if(happy.get(Name)==0){
        System.out.println(Name+" is not in the list");
    }
    else{
        myList.Delete(happy.get(Name)-1);
        happy.putdelete(Name, 0);
    }

}
public void like(String Name,String Song1){
    if(happy.get(Name)==0||myList.liked(happy.get(Name)-1)==null)
        System.out.println(Name+" is not created so Song cannot be liked");
  
     else{
        if(happysong.get(Song1)==0){
            happysong.put(Song1, 5); 
            Listsong.Insert(Song1, happysong.get(Song1)-1);
    }
  Song Dummy=new Song();
  Person Dummy1=new Person();
  Dummy1=myList.liked(happy.get(Name)-1);
  Dummy=Listsong.liked(happysong.get(Song1)-1);
  Dummy.like[happy.get(Name)-1]=Dummy1;
  myList.liked(happy.get(Name)-1, Dummy,happysong.get(Song1)-1);
  }
}
public void dislike(String Name,String Song1){
   if(myList.liked(happy.get(Name)-1).PersonName==null)
        System.out.println(Name+" "+Song1+ "can not be erased");
   else{
myList.disliked(happy.get(Name)-1,happysong.get(Song1)-1);
Listsong.disliked(happysong.get(Song1)-1,happy.get(Name)-1);
System.out.println(Name+" doesn’t like the "+ Song1);
   }


}
public void print(String Name){
    if(myList.liked(happy.get(Name)-1).PersonName==null)
        System.out.println(Name+" is not in the list");
    else if(myList.liked(happy.get(Name)-1).songcount==0)
        System.out.println(Name+"  has no song");
    else
  myList.print(happy.get(Name)-1);

}
public void match(String Name){
    Person Dummy=new Person();
   Dummy= myList.liked(happy.get(Name)-1);
  
   for(int i=0;i<Dummy.like.length;i++){
       if(Dummy.like[i]!=null){
           
       
      
  
       for(int j=0;j<100;j++){
           if(Listsong.liked(happysong.get(Dummy.like[i].SongName)-1).like[j]!=null){
             
       Listsong.liked(happysong.get(Dummy.like[i].SongName)-1).like[j].count++;
       }
          
       }
       
       }
       
       
   }
    System.out.println("Possible friends of "+Dummy.PersonName+" :");
    myList.Output(Dummy);
    myList.countreset();
   
}
public void recommends(String Name){
    int b=happy.get(Name)-1;
    Person Dummy=new Person();
   Dummy= myList.liked(happy.get(Name)-1);
  
   for(int i=0;i<Dummy.like.length;i++){
       if(Dummy.like[i]!=null){
           
       
      
  
       for(int j=0;j<100;j++){
           if(Listsong.liked(happysong.get(Dummy.like[i].SongName)-1).like[j]!=null){
             
       Listsong.liked(happysong.get(Dummy.like[i].SongName)-1).like[j].count++;
       }
          
       }
       
       }
       
       
   }
    Person c=new Person();

   
   System.out.println("For "+Name+":");
   for(int l=0;l<3;l++){
      if(Listsong.recommendcount==5||myList.Outputfor(Dummy,b)[l]==null)
           break;
      c=myList.Outputfor(Dummy,b)[l];
    
    int y=happy.get(c.PersonName)-1;
    
   Listsong.output( y,b); 
   }
   myList.countreset();
   
   
   
}

}