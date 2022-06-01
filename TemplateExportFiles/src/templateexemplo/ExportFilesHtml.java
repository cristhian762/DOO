
package templateexemplo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExportFilesHtml extends AbstractExportFiles {

    public void exportHTML(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLineHTML((String)linhas);
        }   
        saveHTML();
        
    }
    
    private void printLineHTML(String linha) {
        try {
            out.write("<BR>" + linha);
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesHtml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void saveHTML() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesHtml.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
