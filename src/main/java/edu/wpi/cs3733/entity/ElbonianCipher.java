package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	String result;

	public void setText(String text){
		elbonainCipher(text);
	}

	public String elbonainCipher(String text){
		String init = text.toLowerCase();
		if(init.length() > 140){
			init = init.substring(0, 140);
		}
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
				if (Integer.parseInt(Integer.toString(alphabet.indexOf(init.charAt(i)) )) < 10 && Integer.parseInt(Integer.toString(alphabet.indexOf(init.charAt(i)) )) > 0) {
					demo_text = demo_text + "0" + Integer.toString(alphabet.indexOf(init.charAt(i)));
				}
				else {
					demo_text = demo_text + Integer.toString(alphabet.indexOf(init.charAt(i)));
				}
			}
		}
		result = demo_text;
		if(result.contains("-"))
		{
			return "";
		}
		return result;
	}

	public String getText(){
		return result;
	}

	@Override
	public void notify(Object object){
		setText((String) object);
	}
}
