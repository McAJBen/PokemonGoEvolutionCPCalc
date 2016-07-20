import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PokemonPanel extends JPanel {

	private JComboBox<String> pokemon = new JComboBox<String>(Variables.pokemonNames);
	private JTextField cp = new JTextField(5);
	private JTextField hp = new JTextField(5);
	private JTextField starDust = new JTextField(5);
	private JButton submit = new JButton("Submit");
	private JLabel min = getCenterLabel("");
	private JLabel med = getCenterLabel("");
	private JLabel max = getCenterLabel("");
	
	
	public PokemonPanel() {
		
		JPanel top = new JPanel();
		top.setLayout(new GridLayout(0, 3));
		top.add(getRightLabel("Pokemon Type:  "));
		top.add(pokemon);
		top.add(new JLabel());
		top.add(getRightLabel("Current CP:  "));
		top.add(cp);
		top.add(getCenterLabel("Leave blank"));
		top.add(getRightLabel("Current HP:  "));
		top.add(hp);
		top.add(getCenterLabel("if unknown"));
		top.add(getRightLabel("Stardust Cost:  "));
		top.add(starDust);
		
		JPanel bottom = new JPanel();
		bottom.setLayout(new GridLayout(2, 5));
		
		bottom.add(new JLabel(""));
		bottom.add(getCenterLabel("Min:"));
		bottom.add(getCenterLabel("Most Likely:"));
		bottom.add(getCenterLabel("Max:"));
		bottom.add(new JLabel(""));
		bottom.add(new JLabel(""));
		bottom.add(min);
		bottom.add(med);
		bottom.add(max);
		bottom.add(new JLabel(""));
		
		setLayout(new BorderLayout());
		
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.CENTER);
		add(submit, BorderLayout.SOUTH);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc();
			}
		});
	}
	
	private void calc() {
		min.setText("No");
		med.setText("Options");
		max.setText("Found");
		int[] preEvStats;
		int[] postEvStats;
		{
			int[] dexs = Variables.getDexPair(pokemon.getSelectedIndex());
			preEvStats = Variables.getBaseIV(dexs[0]);
			postEvStats = Variables.getBaseIV(dexs[1]);
		
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		ArrayList<Integer> CPMult = new ArrayList<Integer>();
		{
			boolean knowCP = true;
			boolean knowHP = true;
			boolean knowSD = true;
			int curCP = 0, curHP = 0, levelRange = 1;
			try {
				curCP = Integer.parseInt(cp.getText());
			} catch (NumberFormatException e) {
				knowCP = false;
			}
			try {
				curHP = Integer.parseInt(hp.getText());
			} catch (NumberFormatException e) {
				knowHP = false;
			}
			try {
				levelRange = Variables.getLevel(starDust.getText());
			} catch (NumberFormatException e) {
				knowSD = false;
			}
			
			for (int lvl = levelRange; lvl < 80 && (lvl < levelRange + 4 || !knowSD); lvl++) {
				double cpm = Variables.getCPM(lvl);
				double cpm2 = Math.pow(Variables.getCPM(lvl), 2) / 10;
				for (int st = 0; st < 16; st++) {
					if (knowHP && (int) (cpm * (st + preEvStats[0])) != curHP) {
						continue;
					}
					for (int at = 0; at < 16; at++) {
						for (int df = 0; df < 16; df++) {
							if (knowCP) {
								int preCP = (Math.max((int)(
										Math.pow(preEvStats[0] + st, 0.5) * (preEvStats[1] + at) *
										Math.pow(preEvStats[2] + df, 0.5) * cpm2), 10));
								
								if (preCP != curCP) {
									continue;
								}
							}
							int postCP = (Math.max((int)(
									Math.pow(postEvStats[0] + st, 0.5) * (postEvStats[1] + at) *
									Math.pow(postEvStats[2] + df, 0.5) * cpm2), 10));
							
							CPMult.add(postCP);
							if (min > postCP) {
								min = postCP;
							}
							if (max < postCP) {
								max = postCP;
							}
						}
					}
				}
			}
		}
		if (CPMult.size() > 0) {
			this.min.setText(min + "");
			this.max.setText(max + "");
			int ave = 0;
			for (int i = 0; i < CPMult.size(); i++) {
				ave += CPMult.get(i);
			}
			this.med.setText((int)(ave / CPMult.size()) + "");
		}
	}
	
	private JLabel getCenterLabel(String s) {
		JLabel l = new JLabel(s);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		return l;
	}
	
	private JLabel getRightLabel(String s) {
		JLabel l = new JLabel(s);
		l.setHorizontalAlignment(SwingConstants.RIGHT);
		return l;
	}
}