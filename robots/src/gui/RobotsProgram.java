package gui;

import java.awt.Frame;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.*;

public class RobotsProgram {
  public static void main(String[] args) {
    setupFullLocalization();
    setupLookAndFeel();

    SwingUtilities.invokeLater(() -> {
      MainApplicationFrame frame = new MainApplicationFrame();
      frame.pack();
      frame.setVisible(true);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    });
  }

  private static void setupFullLocalization() {
    Locale.setDefault(new Locale("ru", "RU"));
    try {
      ResourceBundle bundle = ResourceBundle.getBundle("swing_ru_RU");
      bundle.keySet().forEach(key -> UIManager.put(key, bundle.getString(key)));
    } catch (MissingResourceException e) {
      System.err.println("Ошибка: файл локализации не найден!");
    }
  }

  private static void setupLookAndFeel() {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Ошибка настройки темы", "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
  }
}