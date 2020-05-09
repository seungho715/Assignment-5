package edu.wpi.cs3733.entity;

import java.util.ArrayList;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {

	ArrayList<Observer> observers = new ArrayList<Observer>();

	String totText = "CHRIS";
	public void setText(String text){
		totText = text;
		notifyObservers();
	}

	public String getText(){
		return totText;
	}

	@Override
	public void register(Observer o){
		observers.add(o);

	}

	@Override
	public void notifyObservers(){
		for(Observer o : observers){
			o.notify(totText);
		}
	}
}
