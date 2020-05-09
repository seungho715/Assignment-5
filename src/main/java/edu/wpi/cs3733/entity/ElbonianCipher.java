package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	String result;

	public void setText(String text){
		String init = text.toLowerCase();
		String demo_text = "";
		String alphabet = "_abcdefghijklmnopqrstuvwxyz";
		String num = "_123456789";
		for(int i = 0; i<init.length(); i++){
			if(init.charAt(i) == ' '){
				demo_text = demo_text + "S";
			}
			else if((int)init.charAt(i) < 58 && (int)init.charAt(i)>47){
				demo_text = demo_text + alphabet.charAt(Integer.parseInt(String.valueOf(init.charAt(i))));
			}
			else if(init.charAt(i) == '!')
				demo_text += "!";
			else {
				if (Integer.parseInt(Integer.toString(alphabet.indexOf(init.charAt(i)) )) < 10) {
					demo_text = demo_text + "0" + Integer.toString(alphabet.indexOf(init.charAt(i)));
				}
				else {
					demo_text = demo_text + Integer.toString(alphabet.indexOf(init.charAt(i)));
				}
			}
		}
		result = demo_text;
	}

	public String getText(){
		return result;
	}

	@Override
	public void notify(Object object){
		setText((String) object);
	}
}
