/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Administrador
 */
public class ProfessorItemRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof ProfessorItem) {
            ProfessorItem professorItem = (ProfessorItem) value;
            value = professorItem.getNome();  // Exibe apenas o nome na ComboBox
        }
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}