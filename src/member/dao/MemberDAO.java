package member.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import member.dto.MemberDTO;

public class MemberDAO {
	private String path = "D:\\2월_국비_핀테크_이태영\\Java\\test";
	private FileInputStream fis;
	private FileOutputStream fos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public void getData(MemberDTO dto) {
		
	}
}
