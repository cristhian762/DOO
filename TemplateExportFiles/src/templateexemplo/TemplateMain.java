package templateexemplo;

public class TemplateMain {
   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
        ExportFilesHtml exportHtml = new ExportFilesHtml();
        ExportFilesWord exportWord = new ExportFilesWord();

      exportHtml.exportHTML(texto);
      exportWord.exportWord(texto);
    }
    
}
