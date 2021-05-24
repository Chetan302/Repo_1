package in.chetan.utils;


import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdEncryptor {

	public String encryptPwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		byte[] bytes = pwd.getBytes();
		byte[] encodedPwd = encoder.encode(bytes);
		String string = encodedPwd.toString();
		return string;
	}
}
