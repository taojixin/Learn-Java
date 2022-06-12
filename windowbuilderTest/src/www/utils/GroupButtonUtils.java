package www.utils;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class GroupButtonUtils {
	public String getSelectedButtonText(ButtonGroup buttonGroup) {

		for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {

		AbstractButton button = (AbstractButton) buttons.nextElement();

		if (button.isSelected()) {

		return button.getText();

		}

		}

		return null;

		}
}
