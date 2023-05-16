package com.cg.googleautomatiom;

public class MyntraExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyntraWindow mw = new MyntraWindow();
		mw.loadUrl();
		mw.openTab("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a");
		mw.openTab("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]");
		mw.openTab("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a");
		mw.switchTabGeneric();
		
	

	}

}
