package edu.wpi.cs3733.entity;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String result;
	public void setText(String text){
		caesarCipher(text);
	}

	public String caesarCipher(String text) {
		String demo_text = "";
		for (int i = 0; i < text.length(); i++) {
			char c = (char) (text.charAt(i));
			if (((int) c < 123 && (int) c > 96) || ((int) c < 91 && (int) c > 64) || (int) c == 33 || (int) c == 44 || (int) c == 46 || (int) c == 63 || (int) c == 32) {
				if (alphabet.indexOf(Character.toLowerCase(c)) == -1) {
						demo_text += (char) (text.charAt(i));
				} else if (c == ' ') {
					demo_text += " ";
				} else {
					int index = alphabet.indexOf(Character.toLowerCase(c));
					if (Character.toUpperCase(c) == c) {
						demo_text += Character.toUpperCase(alphabet.charAt(25 - index));
					} else
						demo_text += (alphabet.charAt(25 - index));
				}
				result = demo_text;
			} else {
				result = "";
			}
		}
		return result;
	}

	public String getText(){
		return result;
	}

	@Override
	public void notify(Object object){
		setText((String)object);
	}
}
