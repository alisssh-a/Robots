package gui;

import java.awt.Frame;
import java.util.Locale;
import javax.swing.*;

public class RobotsProgram {
  public static void main(String[] args) {
    try {
      Locale.setDefault(new Locale("ru", "RU"));
      UIManager.put("OptionPane.yesButtonText", "Да");
      UIManager.put("OptionPane.noButtonText", "Нет");

      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception e) {
      e.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
      MainApplicationFrame frame = new MainApplicationFrame();
      frame.pack();
      frame.setVisible(true);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    });
  }
}