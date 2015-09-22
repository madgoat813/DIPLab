/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changeCase;

/**
 *
 * @author tmcfall
 */
public class FormatService {
    private TextFormatter formatter;
    
    public FormatService(TextFormatter formatter){
        this.formatter = formatter;
    }
    public String changeCase(String s) {
        return formatter.changeCase(s);
    }
}
