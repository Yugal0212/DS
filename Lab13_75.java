����   A ^
      java/lang/Object <init> ()V  Song
  
   (Ljava/lang/String;)V	      Lab13_75 head LSong;	     currentSong	     next	      java/lang/System out Ljava/io/PrintStream;  No song is currently playing.
 ! " # $  java/io/PrintStream println	  & ' ( name Ljava/lang/String;   * + , makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; . Skipping to next song...
  0 1  playCurrentSong 3 No more songs to skip. 5 Playlist is empty. 7 Songs in playlist:
   : Song 1
  < =  addSong ? Song 2 A Song 3
  C D  displayPlaylist
  F G  
skipToNext Code LineNumberTable StackMapTable main ([Ljava/lang/String;)V 
SourceFile Lab13_75.java BootstrapMethods Q Now playing:  S
 T U V + W $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses Z %java/lang/invoke/MethodHandles$Lookup \ java/lang/invoke/MethodHandles Lookup                          H        *� �    I         =   H   �     :� Y+� 	M*� � *,� **� � � *� N-� � -� N���-,� �    I   & 	    	         %  ,  4  9  J    �   �  �   1   H   S     %*� � � �  � � *� � %� )  �  �    I           ! $ # J      G   H   j     4*� � '*� � � **� � � � -�  *� /� � 2�  �    I       &  '  ( $ ) + + 3 - J    +  D   H   |     4*� � � 4�  �� 6�  *� L+� � +� %�  +� L����    I   & 	   0  1  2  4  5  6 ! 7 + 8 3 : J   
 �   	 K L  H   k     /� Y� 8L+9� ;+>� ;+@� ;+� B+� /+� E+� E+� E�    I   * 
   =  ?  @  A  C  E " G & H * I . J  M    N O     R  P X   
  Y [ ] 