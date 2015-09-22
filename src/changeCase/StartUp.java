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
public class StartUp {
    public static void main(String[] args) {
        TextFormatter formatter = new UpperCaseFormatter();
        FormatService service = new FormatService(formatter);
        String result = service.changeCase("hElLO WorLD");
        System.out.println(result);
    }
}
