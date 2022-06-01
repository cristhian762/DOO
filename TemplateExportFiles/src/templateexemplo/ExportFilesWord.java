
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

 
/*Esse codigo esta uma bangunca..*/

public class ExportFilesWord extends AbstractExportFiles {
    public void exportWord(String txt){
             String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLineWord((String)linhas);
        }   
        saveWord();   
    }

    private void printLineWord(String linha) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
    }

    protected void saveWord() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFilesWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
