/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epfg.Contents;

/**
 *
 * @author shcho
 */
public class HeaderComponent {
    String type,font,text;
    public HeaderComponent(String newtype, String newfont, String newText){
        type = newtype;
        text = newText;
        font = newfont;
    }
    public String getText() {
        return text;
    }
    public String getFont() {
        return font;
    }
    public String getType() {
        return type;
    }
    public void changeText(String newtype, String newfont, String newText){
        type = newtype;
        text = newText;
        font = newfont;
    }    
}
