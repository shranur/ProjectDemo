package com.cg.googleautomatiom;

public class TestGoogle {

	public static void main(String[] args) {
 
		GoogleAutomation ga = new GoogleAutomation();
		ga.loadUrl();
		//ga.getLinks();
		//ga.getImages();
		//ga.close();
		ga.searchText();
		ga.getTitle();
		ga.refresh();
		ga.back();
		ga.getTitle();
		
		
	}

}
