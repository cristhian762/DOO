
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class MoveFileThread implements Runnable {

	private static File listaFiles[] = null;
	private static int fileIndex = 0;
	
	public MoveFileThread(File listaFiles[]){
		this.listaFiles = listaFiles;
	}

	public static synchronized File[] getSingleTonListaFiles() throws IOException {
		if (listaFiles == null) {
			String current = new java.io.File(".").getCanonicalPath();
			File file = new File(current + "/src/origem");
			listaFiles = file.listFiles();
		}
		return listaFiles;
	}

	public static void copyFile(File sourceFile, File destFile) throws IOException {

		if (!sourceFile.exists()) {
			return;
		}
		if (!destFile.exists()) {
			destFile.createNewFile();
		}
		FileChannel source = null;
		FileChannel destination = null;
		source = new FileInputStream(sourceFile).getChannel();
		destination = new FileOutputStream(destFile).getChannel();
		if (destination != null && source != null) {
			destination.transferFrom(source, 0, source.size());
		}
		if (source != null) {
			source.close();
		}
		if (destination != null) {
			destination.close();
		}
	}
	
	public static synchronized int incrementFileIndex() {
		int index = fileIndex++;
		
		return index;
	}

	@Override
	public void run() {
		final long startTime = System.currentTimeMillis();// tempo incial
		System.out.println("Iniciando copiar de arquivos");

		for (int i = incrementFileIndex(); i < listaFiles.length; i = incrementFileIndex()) {
			try {
				File origem = new File(listaFiles[i].getAbsolutePath());
				String destinationFile = listaFiles[i].getAbsolutePath();
				destinationFile = destinationFile.replace("origem", "destino");
				copyFile(origem, new File(destinationFile));
			} catch (IOException ex) {
				Logger.getLogger(MoveFileThread.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

		final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
		System.out.println("Time:" + elapsedTimeMillis);

	}

}
