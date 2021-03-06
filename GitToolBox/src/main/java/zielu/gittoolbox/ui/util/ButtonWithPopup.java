package zielu.gittoolbox.ui.util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

public class ButtonWithPopup extends JButton {
  private final JPopupMenu popupMenu = new JPopupMenu();

  public ButtonWithPopup(Action action, Action... options) {
    super(action);
    Arrays.stream(options).forEach(popupMenu::add);
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        popupMenu.show(e.getComponent(), e.getX(), e.getY());
      }
    });
  }
}
