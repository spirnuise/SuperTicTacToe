
import java.awt.event.ActionListener;

/**
 *
 * @author Jonathan
 */
public class GridPanel extends javax.swing.JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private final Game gameInstance;
	private Stone[][] gridSpots;
	
	/**
	 * 
	 */
	public GridPanel()
	{
		this(Game.GUEST_NAME, SkillLevel.Easy, true);
	}
	
	/**
	 * Creates new form GridPanel
	 * @param username1
	 * @param skillLevel
	 * @param isPlayerOneTurn
	 */
	public GridPanel(String username1, SkillLevel skillLevel, boolean isPlayerOneTurn)
	{
		initComponents();
		
		this.gridSpots = new Stone[6][6];
		this.gameInstance = new Game(username1, skillLevel, isPlayerOneTurn);
		if(this.gameInstance == null)
		{
			throw new IllegalArgumentException("Game could not be created with set options");
		}
	}
	
	/**
	 * Creates new form GridPanel
	 * @param username1
	 * @param username2
	 * @param isPlayerOneTurn
	 */
	public GridPanel(String username1, String username2, boolean isPlayerOneTurn)
	{
		initComponents();
		
		this.gridSpots = new Stone[6][6];
		this.gameInstance = new Game(username1, username2, isPlayerOneTurn);
		if(this.gameInstance == null)
		{
			throw new IllegalArgumentException("Game could not be created with set options");
		}
	}

	public Game getGame()
	{
		return this.gameInstance;
	}
	
	public Stone[][] getGridSpots()
	{
		Stone[][] copy = new Stone[6][6];
		
		System.arraycopy(this.gridSpots, 0, copy, 0, this.gridSpots.length);
		
		return copy;
	}
	
	public boolean placeStone(Stone stone)
	{
		if(stone == null)
		{
			throw new IllegalArgumentException("stone is null");
		}
		
		Location loc = stone.getStoneLocation();
		int row = loc.getXPos();
		int col = loc.getYPos();
		
		if(this.gridSpots[row][col] != null)
		{
			return false;
		}
		
		this.gridSpots[row][col] = stone;
		this.displayStone(stone);
		return true;
	}
	
	private void displayStone(Stone stone)
	{
		//TODO: Actually display the stone.
		
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(this);

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt)
    {
        if (evt.getSource() == jButton1)
        {
            GridPanel.this.jButton1ActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}