package com.xworkz.thingRunner;
import com.xworkz.thing.Message;

public class MessageRunner {

	public static void main(String[] args) {
		
		Message message=new Message();
		message.display();
		
		Message message1=new Message("text");
		message1.display();
		
		Message message2=new Message(160);
		message2.display();
		
		Message message3=new Message("text",24);
		message3.display();
		
		Message message4=new Message("text",160);
		message4.display();
		
		Message message5=new Message("text",160,24);
		message5.display();

	}

}
