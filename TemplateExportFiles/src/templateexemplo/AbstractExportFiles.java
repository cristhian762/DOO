
package templateexemplo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

abstract class AbstractExportFiles {
    public abstract void export(String txt);
    protected abstract void printLine(String linha);
    protected abstract void save();
    
    BufferedWriter out = null;
    XWPFDocument document;
    FileOutputStream out1 = null;
}
