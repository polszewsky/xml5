package xmlproject.app;

import java.awt.EventQueue;

import xmlproject.view.MainWindow;

public class Main {

	public static void main(String[] args) {


		System.out.println("hello there");
		setupUI();

	}

	
	/**
	 * Uruchamia aplikacje i interfejs graficzny
	 */
	private static void setupUI() {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				MainWindow mWindow = new MainWindow();
				mWindow.setTitle("Projektowy XML Editor");
				mWindow.setVisible(true);
			}
		});
	}
	
	
}
