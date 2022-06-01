
package templateexemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ExportFilesWord extends AbstractExportFiles {
    
    public ExportFilesWord () {
        String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
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
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
    }

    @Override
    protected void save() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
