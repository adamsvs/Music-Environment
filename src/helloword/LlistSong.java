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
public class LlistSong {
  public Song first,end;
    private int size=0;
    public int recommendcount=0;
    public LlistSong(){
        first=null;/*first is first of linked list node*/
        end=null;/*end is end of linked list node*/
    }
    public void Insert(String newElement, int pos)  {
        //if (pos < 0||(pos>0&&first==null))/*if position not exist*/
            
        Song Dummy=first;
        if(first==null&&pos==0){/*if linked list is empty*/
            Song NewNode = new  Song();
            NewNode.SongName=newElement;
            //NewNode.like[a]=Name;
            NewNode.next=null;
            first=NewNode;
            end=NewNode;
        }
        else if (pos == 0){/*if linked list is not empty*/
            Song NewNode = new  Song();
            NewNode.SongName=newElement;
            //NewNode.like[a]=Name;
            NewNode.next = first;
            
            first = NewNode;
        }
        else if(pos==size&&first!=null){
            Song NewNode = new  Song();
            NewNode.SongName=newElement;
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
            Song NewNode = new Song();
            if(Dummy.next==null){/*add to the end of the linked list*/
               NewNode.SongName = newElement;
               //NewNode.like[a]=Name;
               Dummy.next=NewNode;
               end=NewNode;
            }
            else{
                NewNode.SongName = newElement;
                //NewNode.like[a]=Name;
                NewNode.next=Dummy.next;
                
                Dummy.next=NewNode;
                
            }    
        }
       size++; 
    } 
    public Song liked(int a){
        int x=0;
        Song Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
        return Dummy;
    }
    public void liked12(){
        int x=0;
        Song Dummy=first;
        
        while(Dummy.next!=null){
            System.out.println(Dummy.SongName);
            Dummy = Dummy.next;
            
        }
    }
    public void output(int a,int b){
        Song array[]=new Song[5];
        Song dummy=new Song();
        dummy=first;
        int o=0;
        
        while(dummy!=null){
           if((dummy.like[b]==null)&&(dummy.like[a]!=null)){
            
                 array[o]=dummy;
                 o++;
           }
           
           
             dummy=dummy.next;
        }
        for(int x=0;x<5;x++){
            if(array[x]==null)
                break;
        System.out.println(array[x].SongName);
        recommendcount++;
        }
    }
    public void disliked(int a,int c){
        
        Song Dummy=first;
        for(int i=0;i<a;i++){
            Dummy = Dummy.next;
        }
       
       Dummy.like[c]=null;
        
    }
}
