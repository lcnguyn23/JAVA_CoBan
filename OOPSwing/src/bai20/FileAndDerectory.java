package bai20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileAndDerectory {

	public FileAndDerectory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File[] getDerectoryContent(String folder) {
		File directory = new File(folder);
		if (directory.isFile()) {
			return null;
		}
		File[] result = directory.listFiles();
		return result;
	}

	public String displayContent(File[] content) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < content.length; i++) {
			sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
			sb.append("\n");
		}
		return sb.toString();
	}

	public File[] getSubDirectory(File[] content) {
		ArrayList<File> result = new ArrayList<>();
		for (int i = 0; i < content.length; i++) {
			if (content[i].isDirectory()) {
				result.add(content[i]);
			}
		}
		File[] ketqua = new File[result.size()];
		return result.toArray(ketqua);
	}

	public File[] getFile(File[] content) {
		ArrayList<File> result = new ArrayList<>();
		for (int i = 0; i < content.length; i++) {
			if (content[i].isFile()) {
				result.add(content[i]);
			}
		}
		File[] ketqua = new File[result.size()];
		return result.toArray(ketqua);
	}

	public void getContentRe(String folder) {
		File content = new File(folder);
		if (content.isFile()) {
			System.out.println(content.getPath() + File.separator + content.getName());
			return;
		}
		System.out.println("Thu muc:" + folder);
		File[] sub = content.listFiles();
		for (int i = 0; i < sub.length; i++) {
			getContentRe(folder + File.separator + sub[i].getName());
		}
	}

	public String readTextFile(String filename) {
		StringBuilder content = new StringBuilder();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader bf = new BufferedReader(fr);
			String line = null;
			while ((line = bf.readLine()) != null) {
				content.append(line);
				content.append("\n");
			}
			bf.close();
			fr.close();
		} catch (FileNotFoundException ex) {
			return "Khong tim thay file" + filename;
		} catch (IOException ex) {
			return "Khong the doc file" + filename;
		}

		return content.toString();
	}

	public boolean writeTextFile(String filename, String content) {
		boolean flag = true;
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException ex) {
			return false;
		}
		return flag;
	}
}
