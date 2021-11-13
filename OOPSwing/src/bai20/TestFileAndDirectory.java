package bai20;

import java.io.File;

public class TestFileAndDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileAndDerectory fd = new FileAndDerectory();
		File[] content = fd.getDerectoryContent("D:\\DD");
		// System.out.println(fd.displayContent(content));
		File[] thumuc = fd.getSubDirectory(content);
		System.out.println("Danh sach cac thu muc con la:");
		System.out.println(fd.displayContent(thumuc));
		File[] taptin = fd.getFile(content);
		System.out.println("Danh sach cac tap tin con la:");
		System.out.println(fd.displayContent(taptin));

		// fd.getContentRe("C:\\Users\\Admin\\Documents\\#Desktop\\CNPM-KTPM\\CNTT-DHKH-NAM2-HK2\\CNTT-DHKH-NAM2-HK2");

	}

}
