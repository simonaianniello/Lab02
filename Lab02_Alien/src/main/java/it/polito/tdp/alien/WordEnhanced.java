package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class WordEnhanced {

	private String alienWord;
	private List<String> translation;
	
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public List<String> getTranslation() {
		return translation;
	}
	public void setTranslation(List<String> translation) {
		this.translation = translation;
	}
	public WordEnhanced (String alienWord) {
		this.alienWord=alienWord;
		this.translation=new ArrayList<String>();
	}
}
