package view;

public class Exit implements View {
	
	@Override
	public void show() {
		out.println("=====������======");
		System.exit(0);
	}
	
}
