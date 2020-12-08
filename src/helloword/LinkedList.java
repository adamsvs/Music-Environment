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
public class LinkedList {
  private Person first,end;
    private int size=0;
    public LinkedList(){
        first=null;/*first is first of linked list node*/
        end=null;/*end is end of linked list node*/
    }
    public void Insert(String newElement, int pos)  {
        //if (pos < 0||(pos>0&&first==null))/*if position not exist*/
            
        Person Dummy=first;
        if(first==null&&pos==0){/*if linked list is empty*/
            Person NewNode = new  Person();
            NewNode.PersonName=newElement;
            first=NewNode;
            end=NewNode;
        }
        else if (pos == 0){/*if linked list is not empty*/
            Person NewNode = new  Person();
            NewNode.PersonName=newElement;
            NewNode.next = first;
            
            first = NewNode;
        }
        else if(pos==size&&first!=null){
            Person NewNode = new  Person();
            NewNode.PersonName=newElement;
            end.next=NewNode;
            end=NewNode;
        }
        else{
            for (int i = 0; i < pos-1; i++)
            {
                Dummy = Dummy.next;
                    //if (pos > 0 && Dummy == null)/*if position larger size of 
                                                   //Linked list */
                       
            }
            Person NewNode = new Person();
            if(Dummy.next==null){/*add to the end of the linked list*/
               NewNode.PersonName = newElement;
               
               Dummy.next=NewNode;
               end=NewNode;
            }
            else{
                NewNode.PersonName = newElement;
                NewNode.next=Dummy.next;
                
                Dummy.next=NewNode;
                
            }    
        }
        
        size++;
    }  
    public void Delete(int pos)  {
        
        
            
        Person Dummy; 
        if (pos == 0 && first.next != null){    /*Delete the First Element*/
            
            first.PersonName=null;
            first.like=null;
        }
        else if(pos==0&&first.next==null){
            
            first.PersonName=null;
            first.like=null;
            end.PersonName=null;
            end.like=null;
            
        }
        else{
            Dummy = first;
            for (int i = 0; i < pos; i++)
            {
                Dummy = Dummy.next;
               
                   
            }
           if(Dummy!=end){ 
               Dummy.PersonName=null;
               Dummy.like=null;
           }
           else{
               Dummy.PersonName=null;
               Dummy.like=null;
               end.PersonName=null;
               end.like=null;
           }
        }
   
    }
    public void countreset(){
         Person Dummy=first;
        
        while (Dummy != null){
            
                
            
            Dummy.count=0;
            Dummy = Dummy.next;
        }
    }
    public void Output(Person a){
        Person Dummy=first;
        
        while (Dummy != null){
            
            if(Dummy.songcount!=0){
             if(Dummy.equals(a)){
                 
             }
            else
            System.out.println(Dummy.PersonName+" "+Dummy.count*100/a.songcount+"%"  );
            
            }
            
                
            Dummy = Dummy.next;
        }
        System.out.println("");
    }
    public Person[] Outputfor(Person a,int p){
        Person array[]=new Person[5];
        Person b=new Person();
        Person c=new Person();
        Person d=new Person();
        Person e=new Person();
        Person f=new Person();
        Person Dummy=first;
        int i=0;
       
        while (Dummy != null){
            
           if(i==5)
           break;
           if(Dummy.PersonName.equals(a.PersonName)){
            Dummy=Dummy.next; 
            
           }
           else{
               if(i==0){
            b=Dummy;
               i++;
               }
               else{
                   if(Dummy.count>b.count){
                       b=Dummy;
                   }
                   else{
                       
                   }
                 i++;      
               }
               
               Dummy = Dummy.next;
           }
              
         array[0]=b;
            
            
             
        }
        
        array[0]=b;
          i=0;
        Dummy=first;
          
        while (Dummy != null){
           
           if(i==5)
           break;
           if(Dummy.PersonName.equals(a.PersonName)||Dummy.PersonName.equals(b.PersonName)){
            
            Dummy=Dummy.next; 
            
           }
           
           else{
                
               if(i==0){
            c=Dummy;
               i++;
               }
               else{
                   if(Dummy.count>c.count){
                       c=Dummy;
                   }
                   else{
                       
                   }
                 i++;      
               }
               
               Dummy = Dummy.next;
           }
              
         array[1]=c;
            
         
             
        }
        array[1]=c;
          i=0;
        Dummy=first;
          
        while (Dummy != null){
           
           if(i==5)
           break;
           if(Dummy.PersonName.equals(a.PersonName)||Dummy.PersonName.equals(b.PersonName)||Dummy.PersonName.equals(c.PersonName)){
            
            Dummy=Dummy.next; 
            
           }
           
           else{
                
               if(i==0){
            d=Dummy;
               i++;
               }
               else{
                   if(Dummy.count>c.count){
                       d=Dummy;
                   }
                   else{
                       
                   }
                 i++;      
               }
               
               Dummy = Dummy.next;
           }
              
         array[2]=d;
            
         
             
        }
        return array;
        
        
        
    }
    public void liked(int a,Song b,int c){
        
        Person Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
        Dummy.like[c]=b;
        Dummy.songcount++;
       
    }
    public void disliked(int a,int c){
        
        Person Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
       
       Dummy.like[c]=null;
        Dummy.songcount--;
    }
    public void print(int a){
        
        Person Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
        System.out.println(Dummy.PersonName+" liked:");
        for(int x=0;x<Dummy.like.length;x++){
            if(Dummy.like[x]!=null)
            System.out.println(Dummy.like[x].SongName+" ");
            
        }
        
    }
    public Person liked(int a){
        int x=0;
        Person Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
        return Dummy;
    }
}
