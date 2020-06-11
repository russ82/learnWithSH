package view;

public class Exit implements View {
	
	@Override
	public void show() {
		out.println("=====³ª°¡±â======");
		System.exit(0);
	}
	
}
