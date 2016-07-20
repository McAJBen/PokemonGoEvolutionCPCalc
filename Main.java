import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pokemon");
		frame.setSize(357, 230);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setResizable(false);
    	frame.add(new PokemonPanel());
    	frame.setVisible(true);
	}
}
