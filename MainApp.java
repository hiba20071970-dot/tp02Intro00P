package tp02Intro00P;

public class MainApp {
	public static  void main (String[] args) {
		BOOK book = new Book();
		book1 .title = "Clean Code";
		book1 . author = "Robert C. Martin";
		book1 . price = 3200.0;
		//Anyone can break the data!
		book1 . price = -500.0;   // No error -- but nonsense!
		book1 . displayInfo();
		
	}

}
