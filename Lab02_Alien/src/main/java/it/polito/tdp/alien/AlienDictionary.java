package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List<WordEnhanced> wordList;
	
	public AlienDictionary() {
		wordList=new ArrayList<WordEnhanced>();
	}

	public int equals (String alienWord) {
	
		for (WordEnhanced w:wordList) {
			if (w!=null) {
				if (w.getAlienWord().toLowerCase().compareTo(alienWord.toLowerCase())==0)
					return wordList.indexOf(w);
				
			}
		}
		
		return -1;
	}
	
	public void addWord(String alienWord, String translation) {
		WordEnhanced wTemp;
		if (this.equals(alienWord)!= -1) {
			int indice=this.equals(alienWord);
			wTemp=wordList.get(indice);
			}
		else {
			wTemp=new WordEnhanced(alienWord);
			wordList.add(wTemp);
		}
		wTemp.getTranslation().add(translation);
		}
	
	public List<String> translateWord(String alienWord) {
		if (this.equals(alienWord)!=-1) {
			int indice=this.equals(alienWord);
			return wordList.get(indice).getTranslation();
		}
		else return null;
	}
	public List<WordEnhanced> getWordList() {
		return wordList;
	}
	public void setWordList(List<WordEnhanced> wordList) {
		this.wordList = wordList;
	}
	
	}
