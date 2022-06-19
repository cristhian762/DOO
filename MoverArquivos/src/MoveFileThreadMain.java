
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;

/**
 *
 * @author felipe
 */
public class MoveFileThreadMain {

	private static File listaFiles[] = null;

	public static void main(String args[]) throws IOException, InterruptedException {

		final long startTime = System.currentTimeMillis();// tempo incial
		listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
		System.out.println("Iniciando copiar de arquivos");
		
		
		Runnable runTh1 = new MoveFileThread(listaFiles);
		Runnable runTh2 = new MoveFileThread(listaFiles);
		
		Thread th1 = new Thread(runTh1);
		Thread th2 = new Thread(runTh2);
		
		th1.start();
		th2.start();
		
		
		final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
		System.out.println("Time:" + elapsedTimeMillis);

	}

	public static synchronized File[] getSingleTonListaFiles() throws IOException {
		if (listaFiles == null) {
			String current = new java.io.File(".").getCanonicalPath();
			File file = new File(current + "/src/origem");
			listaFiles = file.listFiles();
		}
		return listaFiles;
	}

}
