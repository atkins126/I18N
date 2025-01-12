package Number;

import java.util.*;
import javax.swing.*;
//import newtool.*;

public class MainFrame extends JFrame
{
  private static final long serialVersionUID = 1;
  private static final ResourceBundle res = ResourceBundle.getBundle("Number.messages");
  
  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        MainFrame inst = new MainFrame();
        inst.setLocationRelativeTo(null);
        inst.setVisible(true);
      }
	});
  }

  public MainFrame()
  {
    super();
    Initialize();
  }
  
  private JLabel Add(int count)
  {
    JLabel label = new JLabel();

    getContentPane().add(label);
    label.setText("dummy");
    return label;
  }
  
  private void Initialize()
  {
    try
    {
      JPanel contentPane = (JPanel)getContentPane();
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

      setTitle(res.getString("Title"));
      setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      
      Add(0);
      Add(1);
      Add(2);
      Add(3);
      Add(4);
      Add(5);
      Add(11);
      Add(21);
      Add(101);
      Add(111);
  
      pack();
      setSize(500, 200);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}