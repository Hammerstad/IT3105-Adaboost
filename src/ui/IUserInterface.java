/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Nicklas
 */
public interface IUserInterface {
    public String requestString(String question);
    public int requestInt(String question);
    public double requestDouble(String question);
    public boolean requestBoolean(String question);
    public int requestChoice(String title, Object[] choice);
    public int requestChoice(String title, Object[] choice, Object[] skip);
}
