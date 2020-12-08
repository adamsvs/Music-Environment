# Music-Environment
This project is about creating spotify-like environment with hash table data structure.This program also works on command line with menu method.
This project consists of 3 different hash table.

First hash table stores person names.For collusions on this table , linear probing method used. Second hash table stores songs that people like in same index with first hash table. using chaining method. Third hash table stores people that likes same song. For same songs , chaining method have used.
# PURPOSE
In this Homework I try to required to design a Spotify-like environment and program using hash
structure and I intend to perform the specified functions in certain complexity.I use NETBEANS.
# My Hash Function
My hash function for name and song works like a dictionary ranking. In fact, I am placing the
values in my table according to the alphabet and size. For example;
When I want to put “A”, this string value put to first index. And When I want to put “Aa”, this
string value put to 27th index. I explain this stuation to “A” ASCII value is 67 and “a” is 97
and alphabet has 26 value. So, When I put a string value, my function work in a formula.
This formula: String ASCII value+26*index+ ASCII value+26*index…
For example;Name: [A,d,e,m]=>ascii:[67,100,101,112]=>[67-67+26*index+100-
96+26*index..]=>[0,30,57,93]and add all value =>[180] So, Adem put to 180th index. Then
collision is not posssible thanks to my function.
Also, when I put to “Adem”, I give to user id for “Adem” and put user id to hash table’s 180th
index. I put in order of [Adem, Ali,Veli] and user id like [1,2,3].
# My Person Linked List
I'm collecting all added Name in this list and has a liked array. This array collecting liked
song by user id to array of index.
My Song Linked List
I'm collecting all added Song in this list and has a liked array. This array collecting liked this
song from person by user id to array of index.
# Functions
“I”=> I insert to person end of linked list so complexity is O(1).
“D”=>I make null to nede which given Person and this Person nth node and I know it by user
id. So, complexity is O(1).
“L”and “E”=>I go to nth node that I know from person list and add node’s liked array with
song id. Then I control to there is song in song list , if no, I insert to song list. And go to nth
node which has song and I know n,add person node’s liked array. So, complexity is O(1) for
“L”.For “E” is like “L”’s inverse. So, complexity is O(1).
“P”=> I go to nth node that I know from person list and print liked array. So, complexity is
O(1).
“M”=>Person nodes have count and song count.When I run function,I calculate count that the
other person’ like the same song and songcount is how many song in this node.Finally, I 
divide count to songcount.I know name’s and song’s index or nth node and I do not never
search for person or song.So, complexity is O(n).
“R”=>I run a function that calculate count like “M” function but no print. Then I recommend
5 songs except for the songs that the person does not like, starting from the one with the most
counter person. I do not search never so the complexiy is O(n).
