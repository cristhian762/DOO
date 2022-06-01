
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExportFilesHtml extends AbstractExportFiles {
    
    public ExportFilesHtml () {
        String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
        } catch (IOException ex) {
            Logger.getLogger(AbstractExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();
    }
    
    @Override
    protected void printLine(String linha) {
        try {
            out.write("<BR>" + linha);
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesHtml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void save() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesHtml.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
