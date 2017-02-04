
package tabulator;

import amuyaña.Disjunction;
import java.io.IOException;
import javax.swing.JPanel;

public class Tabulator {

//    private static Style style;
    
    public Tabulator() {
        
    }
    
    public enum Style {
        LUPASCO, SIERPINSKI, AMUYAÑA, CHAKANA
    }
    
    public enum LupascoFormat {
        PANEL, HTML, LATEX, OPENDOCUMENT
    }
    
    /*
    IMPLEMENTACIONES DE LUPASCO
    */
    public JPanel getLupasco(boolean signs, boolean full, int color, int size) throws IOException {
        return LupascoPanel.getPanel(signs, full, color, size);
    }
    
    public JPanel getLupascoForExport(Disjunction d, boolean signs, boolean full, int color, int size) throws IOException {
        return LupascoPanel.getTreeForExport(d, signs, full, color, size);
    }

    public String getLupascoHTML() {
        // return Lupasco.getLatexFile();
        return new String();
    }
    
    public String getLupascoLATEX() {
        // return Lupasco.getLatexFile();
        return new String();
    }
    
    public String getLupascoOPENDOCUMENT() {
        // return Lupasco.getODFFile();
        return new String();
    }

    
    /*
    IMPLEMENTACIONES DE SIERPINSKI
    */
    
    // TO-DO
    
    /*
    IMPLEMENTACIONES DE AMUYAÑA
    */
    
    // TO-DO
    
    /*
    IMPLEMENTACIONES DE CHACANA
    */
    
    // TO-DO
    
    
}
