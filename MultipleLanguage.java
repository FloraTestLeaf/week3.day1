package week3.day1.abstraction;

//
//Assignment5: on Abstraction
//===========
//Interface :Language
//     Methods   :Java()
//     Interface :TestTool
//     Methods   :Selenium()
//     AbstractClass :MultipleLangauge
//     Methods   :python() and un implemented method as ruby()
//  Execution class: Automation 
//Implement all the methods of interface and abstract class in Automation class


public abstract class MultipleLanguage {

	public void python() {
		// TODO Auto-generated method stub
System.out.println("python");
	}
	
	 abstract void ruby();
}
